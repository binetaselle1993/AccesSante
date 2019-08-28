package sn.isi.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dossier {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num_dossier;
	@OneToMany(mappedBy="dossier")
	private List<Ordonnance> ordonnance = new ArrayList<Ordonnance>();
	@OneToMany(mappedBy="dossier")
	private List<Bulletin> bulletin = new ArrayList<Bulletin>();
	@OneToMany(mappedBy="dossier")
	private List<Consultation> consultation = new ArrayList<Consultation>();
	@Column
	private Date date_creation;
	public Dossier() {
		super();
	}
	public Dossier(Long num_dossier, List<Ordonnance> ordonnance, List<Bulletin> bulletin,
			List<Consultation> consultation, Date date_creation) {
		super();
		this.num_dossier = num_dossier;
		this.ordonnance = ordonnance;
		this.bulletin = bulletin;
		this.consultation = consultation;
		this.date_creation = date_creation;
	}
	public Long getNum_dossier() {
		return num_dossier;
	}
	public void setNum_dossier(Long num_dossier) {
		this.num_dossier = num_dossier;
	}
	public List<Ordonnance> getOrdonnance() {
		return ordonnance;
	}
	public void setOrdonnance(List<Ordonnance> ordonnance) {
		this.ordonnance = ordonnance;
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
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

}
