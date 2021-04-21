package com.entreprise.toilette.models;

public class Toilette {
	private int gid;
	private String nom;
	private String accessible_pmr;
	private String automatique;
	private String adresse1;
	private String adresse2;
	private String complement_type;
	private String exploitant;
	private String proprietaire;
	private String nettoiement;
	private String horaire_d_ouverture;
	
	//Accesseurs & Mutateurs 
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
	public String getAccessible_pmr() {
		return accessible_pmr;
	}
	public void setAccessible_pmr(String accessible_pmr) {
		this.accessible_pmr = accessible_pmr;
	}
	public String getAutomatique() {
		return automatique;
	}
	public void setAutomatique(String automatique) {
		this.automatique = automatique;
	}
	public String getAdresse1() {
		return adresse1;
	}
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}
	public String getAdresse2() {
		return adresse2;
	}
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}
	public String getComplement_type() {
		return complement_type;
	}
	public void setComplement_type(String complement_type) {
		this.complement_type = complement_type;
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
	
	
}
