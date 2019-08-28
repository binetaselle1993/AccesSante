package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Civilite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToMany(mappedBy="civilite")
	private List<Utilisateur> utilisateur = new ArrayList<Utilisateur>(); 
	@OneToMany(mappedBy="civilite")
	private List<Patient> patient = new ArrayList<Patient>();
	@Column
	private String libelle;
	
	public Civilite() {
		super();
	}

	public Civilite(int id, List<Utilisateur> utilisateur, List<Patient> patient, String libelle) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.patient = patient;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Utilisateur> getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(List<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
