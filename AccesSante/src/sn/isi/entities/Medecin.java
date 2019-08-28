package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("MEDECIN")
public class Medecin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_medecin;
	@OneToMany(mappedBy="medecin")
	private List<Rendez_vous> rendez_vous = new ArrayList<Rendez_vous>();
	@OneToMany(mappedBy="medecin")
	private List<Planing> planning = new ArrayList<Planing>();
	@OneToMany(mappedBy="medecin")
	private List<Bulletin> bulletin = new ArrayList<Bulletin>();
	@OneToMany(mappedBy="medecin")
	private List<Consultation> consultation = new ArrayList<Consultation>();
	@ManyToOne
	private Service service =new Service();
	@Column
	private String specialite;
	public Medecin() {
		super();
	}
	public Medecin(int id_medecin, List<Rendez_vous> rendez_vous, List<Planing> planning, List<Bulletin> bulletin,
			List<Consultation> consultation, Service service, String specialite) {
		super();
		this.id_medecin = id_medecin;
		this.rendez_vous = rendez_vous;
		this.planning = planning;
		this.bulletin = bulletin;
		this.consultation = consultation;
		this.service = service;
		this.specialite = specialite;
	}
	public int getId_medecin() {
		return id_medecin;
	}
	public void setId_medecin(int id_medecin) {
		this.id_medecin = id_medecin;
	}
	public List<Rendez_vous> getRendez_vous() {
		return rendez_vous;
	}
	public void setRendez_vous(List<Rendez_vous> rendez_vous) {
		this.rendez_vous = rendez_vous;
	}
	public List<Planing> getPlanning() {
		return planning;
	}
	public void setPlanning(List<Planing> planning) {
		this.planning = planning;
	}
	public List<Bulletin> getBulletin() {
		return bulletin;
	}
	public void setBulletin(List<Bulletin> bulletin) {
		this.bulletin = bulletin;
	}
	public List<Consultation> getConsultation() {
		return consultation;
	}
	public void setConsultation(List<Consultation> consultation) {
		this.consultation = consultation;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

}
