package com.entreprise.toilette.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entreprise.toilette.models.Toilette;
import com.entreprise.toilette.services.ToiletteService;

@RequestMapping(path = "/api/toilettes")
@RestController
public class ToiletteController {
	
	@Autowired
	private ToiletteService toiletteService;
	
	@CrossOrigin("*")
	@GetMapping(path = "/")
	public List<Toilette> getToilettes(){
		return toiletteService.getToilettes();
	}

}
