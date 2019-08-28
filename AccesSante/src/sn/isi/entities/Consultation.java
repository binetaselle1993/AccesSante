package sn.isi.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Consultation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_consultation;
	
	@ManyToOne
	private Patient patient =new Patient();
	@ManyToOne
	private Dossier dossier =new Dossier();
	@ManyToOne
	private Medecin medecin =new Medecin();
	@OneToMany(mappedBy="consultation")
	private List<Bulletin> bulletin = new ArrayList<Bulletin>();
	@OneToMany(mappedBy="consultation")
	private List<Ordonnance> ordonnance = new ArrayList<Ordonnance>();
	@Column
	private Date date_cons;
	@Column
	private String plaites_sym;
	@Column
	private String tdr;
	@Column
	private String autres_examen;
	@Column
	private String diagnostic;
	@Column
	private String ref_contre_ref;
	@Column
	private String traitement;
	@Column
	private String besoins_pf;
	@Column
	private String observations;
	public Consultation() {
		super();
	}
	public Consultation(int id_consultation, Patient patient, Dossier dossier, Medecin medecin, List<Bulletin> bulletin,
			List<Ordonnance> ordonnance, Date date_cons, String plaites_sym, String tdr, String autres_examen,
			String diagnostic, String ref_contre_ref, String traitement, String besoins_pf, String observations) {
		super();
		this.id_consultation = id_consultation;
		this.patient = patient;
		this.dossier = dossier;
		this.medecin = medecin;
		this.bulletin = bulletin;
		this.ordonnance = ordonnance;
		this.date_cons = date_cons;
		this.plaites_sym = plaites_sym;
		this.tdr = tdr;
		this.autres_examen = autres_examen;
		this.diagnostic = diagnostic;
		this.ref_contre_ref = ref_contre_ref;
		this.traitement = traitement;
		this.besoins_pf = besoins_pf;
		this.observations = observations;
	}
	public int getId_consultation() {
		return id_consultation;
	}
	public void setId_consultation(int id_consultation) {
		this.id_consultation = id_consultation;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public List<Bulletin> getBulletin() {
		return bulletin;
	}
	public void setBulletin(List<Bulletin> bulletin) {
		this.bulletin = bulletin;
	}
	public List<Ordonnance> getOrdonnance() {
		return ordonnance;
	}
	public void setOrdonnance(List<Ordonnance> ordonnance) {
		this.ordonnance = ordonnance;
	}
	public Date getDate_cons() {
		return date_cons;
	}
	public void setDate_cons(Date date_cons) {
		this.date_cons = date_cons;
	}
	public String getPlaites_sym() {
		return plaites_sym;
	}
	public void setPlaites_sym(String plaites_sym) {
		this.plaites_sym = plaites_sym;
	}
	public String getTdr() {
		return tdr;
	}
	public void setTdr(String tdr) {
		this.tdr = tdr;
	}
	public String getAutres_examen() {
		return autres_examen;
	}
	public void setAutres_examen(String autres_examen) {
		this.autres_examen = autres_examen;
	}
	public String getDiagnostic() {
		return diagnostic;
	}
	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}
	public String getRef_contre_ref() {
		return ref_contre_ref;
	}
	public void setRef_contre_ref(String ref_contre_ref) {
		this.ref_contre_ref = ref_contre_ref;
	}
	public String getTraitement() {
		return traitement;
	}
	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}
	public String getBesoins_pf() {
		return besoins_pf;
	}
	public void setBesoins_pf(String besoins_pf) {
		this.besoins_pf = besoins_pf;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}
	         

}
