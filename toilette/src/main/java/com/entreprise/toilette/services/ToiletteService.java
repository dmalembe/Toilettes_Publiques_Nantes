package com.entreprise.toilette.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entreprise.toilette.models.Toilette;

public interface ToiletteService {
	
	public List<Toilette> getToilettes();
}
