package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Fiche_hospitalisation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
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
	@Column
	private String poids;
	@Column
	private String taille;
	@Column
	private String pouls;
	@Column
	private String fre;
	@Column
	private String tem;
	@Column
	private String motif;
	public Fiche_hospitalisation() {
		super();
	}
	public Fiche_hospitalisation(int id, String nom, String prenom, String sexe, String age, String telephone,
			String email, String adresse, String profession, String poids, String taille, String pouls, String fre,
			String tem, String motif) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.age = age;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.profession = profession;
		this.poids = poids;
		this.taille = taille;
		this.pouls = pouls;
		this.fre = fre;
		this.tem = tem;
		this.motif = motif;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPoids() {
		return poids;
	}
	public void setPoids(String poids) {
		this.poids = poids;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public String getPouls() {
		return pouls;
	}
	public void setPouls(String pouls) {
		this.pouls = pouls;
	}
	public String getFre() {
		return fre;
	}
	public void setFre(String fre) {
		this.fre = fre;
	}
	public String getTem() {
		return tem;
	}
	public void setTem(String tem) {
		this.tem = tem;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}

}
