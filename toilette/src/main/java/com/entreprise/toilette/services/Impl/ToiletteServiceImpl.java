package com.entreprise.toilette.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entreprise.toilette.dao.ToiletteDAOAPI;
import com.entreprise.toilette.dao.entity.RecordsEntity;
import com.entreprise.toilette.dao.entity.ResponseToiletteAPIEntity;
import com.entreprise.toilette.models.Toilette;
import com.entreprise.toilette.services.ToiletteService;

@Service
public class ToiletteServiceImpl implements ToiletteService {
	
	@Autowired
	private ToiletteDAOAPI toiletteDAOAPI;
	
	@Override
	public List<Toilette> getToilettes(){
		ResponseToiletteAPIEntity response = toiletteDAOAPI.getToilettes();
		return TransformEntityToModel(response);
	}

	private List<Toilette> TransformEntityToModel(ResponseToiletteAPIEntity response) {
		// TODO Auto-generated method stub
		List<Toilette> result = new ArrayList<Toilette>();
		for (RecordsEntity record:response.getRecords()) {
			Toilette toilette = new Toilette();
			toilette.setGid(record.getFields().getGid());
			toilette.setNom(record.getFields().getNom());
			toilette.setAdresse1(record.getFields().getAdresse_1());
			toilette.setAdresse2(record.getFields().getAdresse_2());
			toilette.setComplement_type(record.getFields().getComplement_type());
			toilette.setAccessible_pmr(record.getFields().getAccessible_pmr());
			toilette.setExploitant(record.getFields().getExploitant());
			toilette.setHoraire_d_ouverture(record.getFields().getHoraire_d_ouverture());
			toilette.setProprietaire(record.getFields().getProprietaire());
			
			result.add(toilette);
		}
		return result;
	}

}
