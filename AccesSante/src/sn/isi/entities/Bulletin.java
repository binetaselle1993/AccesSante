package sn.isi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bulletin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_bulletin;
	@ManyToOne
	private Medecin medecin =new Medecin();
	@ManyToOne
	private Dossier dossier =new Dossier();
	@ManyToOne
	private Consultation consultation =new Consultation();
	
	@Column
	private String description;
	@Column
	private Date date;
	public Bulletin() {
		super();
	}
	public Bulletin(int id_bulletin, Medecin medecin, Dossier dossier, Consultation consultation, String description,
			Date date) {
		super();
		this.id_bulletin = id_bulletin;
		this.medecin = medecin;
		this.dossier = dossier;
		this.consultation = consultation;
		this.description = description;
		this.date = date;
	}
	public int getId_bulletin() {
		return id_bulletin;
	}
	public void setId_bulletin(int id_bulletin) {
		this.id_bulletin = id_bulletin;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	  
	

}
