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
public class Service {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_service;
	@OneToMany(mappedBy="service")
	private List<Medecin> medecin = new ArrayList<Medecin>();
	@Column
	private String libelle;
	public Service() {
		super();
	}
	public Service(int id_service, List<Medecin> medecin, String libelle) {
		super();
		this.id_service = id_service;
		this.medecin = medecin;
		this.libelle = libelle;
	}
	public int getId_service() {
		return id_service;
	}
	public void setId_service(int id_service) {
		this.id_service = id_service;
	}
	public List<Medecin> getMedecin() {
		return medecin;
	}
	public void setMedecin(List<Medecin> medecin) {
		this.medecin = medecin;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
