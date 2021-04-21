package com.entreprise.toilette.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {
	
	@JsonProperty(value = "gid")
	private int gid;
	
	@JsonProperty(value = "nom")
	private String nom;
	
	@JsonProperty(value = "commune")
	private String commune;
	
	@JsonProperty(value = "adresse_1")
	private String adresse_1;
	
	@JsonProperty(value = "adresse_2")
	private String adresse_2;
	
	@JsonProperty(value = "exploitant")
	private String exploitant;
	
	@JsonProperty(value = "proprietaire")
	private String proprietaire;
	
	@JsonProperty(value = "nettoiement")
	private String nettoiement;
	
	@JsonProperty(value = "horaire_d_ouverture")
	private String horaire_d_ouverture;
	
	@JsonProperty(value = "complement_type")
	private String complement_type;
	
	@JsonProperty(value = "accessible_pmr")
	private String accessible_pmr;

	//Accesseur & Mutateurs 
	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getAdresse_1() {
		return adresse_1;
	}

	public void setAdresse_1(String adresse_1) {
		this.adresse_1 = adresse_1;
	}

	public String getAdresse_2() {
		return adresse_2;
	}

	public void setAdresse_2(String adresse_2) {
		this.adresse_2 = adresse_2;
	}

	public String getExploitant() {
		return exploitant;
	}

	public void setExploitant(String exploitant) {
		this.exploitant = exploitant;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public String getNettoiement() {
		return nettoiement;
	}

	public void setNettoiement(String nettoiement) {
		this.nettoiement = nettoiement;
	}

	public String getHoraire_d_ouverture() {
		return horaire_d_ouverture;
	}

	public void setHoraire_d_ouverture(String horaire_d_ouverture) {
		this.horaire_d_ouverture = horaire_d_ouverture;
	}

	public String getComplement_type() {
		return complement_type;
	}

	public void setComplement_type(String complement_type) {
		this.complement_type = complement_type;
	}

	public String getAccessible_pmr() {
		return accessible_pmr;
	}

	public void setAccessible_pmr(String accessible_pmr) {
		this.accessible_pmr = accessible_pmr;
	}
	
	
	
}
