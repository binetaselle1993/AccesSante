package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_patient;
	@ManyToOne
	private Civilite civilite =new Civilite();
	@OneToMany(mappedBy="patient")
	private List<Consultation> consultation = new ArrayList<Consultation>();
	@OneToMany(mappedBy="patient")
	private List<Ticket> ticket = new ArrayList<Ticket>();
	@OneToMany(mappedBy="patient")
	private List<Rendez_vous> rendez_vous = new ArrayList<Rendez_vous>();
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String sexe;
	@Column
	private String age;
	@Column
	private String telephone;
	@Column
	private String email;
	@Column
	private String adresse;
	@Column
	private String profession;
	public Patient() {
		super();
	}
	public Patient(int id_patient, Civilite civilite, List<Consultation> consultation, List<Ticket> ticket,
			List<Rendez_vous> rendez_vous, String nom, String prenom, String sexe, String age, String telephone,
			String email, String adresse, String profession) {
		super();
		this.id_patient = id_patient;
		this.civilite = civilite;
		this.consultation = consultation;
		this.ticket = ticket;
		this.rendez_vous = rendez_vous;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.profession = profession;
	}
	public int getId_patient() {
		return id_patient;
	}
	public void setId_patient(int id_patient) {
		this.id_patient = id_patient;
	}
	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	public List<Consultation> getConsultation() {
		return consultation;
	}
	public void setConsultation(List<Consultation> consultation) {
		this.consultation = consultation;
	}
	public List<Ticket> getTicket() {
		return ticket;
	}
	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}
	public List<Rendez_vous> getRendez_vous() {
		return rendez_vous;
	}
	public void setRendez_vous(List<Rendez_vous> rendez_vous) {
		this.rendez_vous = rendez_vous;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
}
