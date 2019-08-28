package sn.isi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rendez_vous {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_rendez_vous;
	@ManyToOne
	private Medecin medecin =new Medecin();
	@ManyToOne
	private Planing planing =new Planing();
	@ManyToOne
	private Patient patient =new Patient();
	@Column
	private Date date;
	@Column
	private String objet;
	public Rendez_vous() {
		super();
	}
	public Rendez_vous(int id_rendez_vous, Medecin medecin, Planing planing, Patient patient, Date date, String objet) {
		super();
		this.id_rendez_vous = id_rendez_vous;
		this.medecin = medecin;
		this.planing = planing;
		this.patient = patient;
		this.date = date;
		this.objet = objet;
	}
	public int getId_rendez_vous() {
		return id_rendez_vous;
	}
	public void setId_rendez_vous(int id_rendez_vous) {
		this.id_rendez_vous = id_rendez_vous;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Planing getPlaning() {
		return planing;
	}
	public void setPlaning(Planing planing) {
		this.planing = planing;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	
}
