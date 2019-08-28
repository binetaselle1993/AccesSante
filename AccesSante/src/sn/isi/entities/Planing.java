package sn.isi.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Planing {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_planning;
	@OneToMany(mappedBy="planing")
	private List<Jour_conge> jour_conge = new ArrayList<Jour_conge>();
	@OneToMany(mappedBy="planing")
	private List<Jour_travail> jour_travail = new ArrayList<Jour_travail>();
	@OneToMany(mappedBy="planing")
	private List<Rendez_vous> rendez_vous = new ArrayList<Rendez_vous>();
	@ManyToOne
	private Medecin medecin =new Medecin();
	public Planing() {
		super();
	}
	public Planing(int id_planning, List<Jour_conge> jour_conge, List<Jour_travail> jour_travail,
			List<Rendez_vous> rendez_vous, Medecin medecin) {
		super();
		this.id_planning = id_planning;
		this.jour_conge = jour_conge;
		this.jour_travail = jour_travail;
		this.rendez_vous = rendez_vous;
		this.medecin = medecin;
	}
	public int getId_planning() {
		return id_planning;
	}
	public void setId_planning(int id_planning) {
		this.id_planning = id_planning;
	}
	public List<Jour_conge> getJour_conge() {
		return jour_conge;
	}
	public void setJour_conge(List<Jour_conge> jour_conge) {
		this.jour_conge = jour_conge;
	}
	public List<Jour_travail> getJour_travail() {
		return jour_travail;
	}
	public void setJour_travail(List<Jour_travail> jour_travail) {
		this.jour_travail = jour_travail;
	}
	public List<Rendez_vous> getRendez_vous() {
		return rendez_vous;
	}
	public void setRendez_vous(List<Rendez_vous> rendez_vous) {
		this.rendez_vous = rendez_vous;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
}
