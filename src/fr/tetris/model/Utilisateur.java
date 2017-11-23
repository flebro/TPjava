package fr.tetris.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Utilisateur {
	@Id
	@Column(name="UTI_ID")
	@GeneratedValue	(strategy=GenerationType.IDENTITY)	
	private int Id;
	@Column(name="UTI_NOM")
	private String Nom;
	@Column(name="UTI_MDP")
	private String MDP;
	
	public int getId() {
		return Id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getMDP() {
		return MDP;
	}
	public void setMDP(String mDP) {
		MDP = mDP;
	}
	
	
}
