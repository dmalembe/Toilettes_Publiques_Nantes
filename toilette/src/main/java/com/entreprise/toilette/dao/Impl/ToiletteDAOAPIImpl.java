package com.entreprise.toilette.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.entreprise.toilette.dao.ToiletteDAOAPI;
import com.entreprise.toilette.dao.entity.ResponseToiletteAPIEntity;

@Repository
public class ToiletteDAOAPIImpl implements ToiletteDAOAPI{
	
	private static final String URL_API_OPEN_DATA = "https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_toilettes-publiques-nantes-metropole&q=&facet=pole&facet=commune&facet=type&facet=automatique";
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public ResponseToiletteAPIEntity getToilettes() {
		return restTemplate.getForEntity(URL_API_OPEN_DATA,ResponseToiletteAPIEntity.class).getBody();
	}
	
	
}
