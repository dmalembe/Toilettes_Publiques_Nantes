package com.entreprise.toilette.dao.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseToiletteAPIEntity {
	
	@JsonProperty(value = "records")
	private List<RecordsEntity> records;
	
	//Accesseurs et Mutateurs 

	public List<RecordsEntity> getRecords() {
		return records;
	}

	public void setRecords(List<RecordsEntity> records) {
		this.records = records;
	}

}
