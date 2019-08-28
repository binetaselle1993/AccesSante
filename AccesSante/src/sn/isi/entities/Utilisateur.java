package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_UTILISATEUR")
@DiscriminatorValue("MERE")
public class Utilisateur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id_utilisateur;
	@ManyToOne
	private Civilite civilite =new Civilite();
	@Column
	private String nom_utilisateur;
	@Column
	private String prenom_utilisateur;
	@Column
	private String sexe_utilisateur;
	@Column
	private String age_utilisateur ;
	@Column
	private String tel_utilisateur ;
	@Column
	private String email_utilisateur ;
	@Column
	private String adr_utilisateur ;
	@Column
	private String login ;
	@Column
	private String password ;
	@Column
	private String active ;
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(int id_utilisateur, Civilite civilite, String nom_utilisateur, String prenom_utilisateur,
			String sexe_utilisateur, String age_utilisateur, String tel_utilisateur, String email_utilisateur,
			String adr_utilisateur, String login, String password, String active) {
		super();
		this.id_utilisateur = id_utilisateur;
		this.civilite = civilite;
		this.nom_utilisateur = nom_utilisateur;
		this.prenom_utilisateur = prenom_utilisateur;
		this.sexe_utilisateur = sexe_utilisateur;
		this.age_utilisateur = age_utilisateur;
		this.tel_utilisateur = tel_utilisateur;
		this.email_utilisateur = email_utilisateur;
		this.adr_utilisateur = adr_utilisateur;
		this.login = login;
		this.password = password;
		this.active = active;
	}

	public int getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	public String getNom_utilisateur() {
		return nom_utilisateur;
	}
	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}
	public String getPrenom_utilisateur() {
		return prenom_utilisateur;
	}
	public void setPrenom_utilisateur(String prenom_utilisateur) {
		this.prenom_utilisateur = prenom_utilisateur;
	}
	public String getSexe_utilisateur() {
		return sexe_utilisateur;
	}
	public void setSexe_utilisateur(String sexe_utilisateur) {
		this.sexe_utilisateur = sexe_utilisateur;
	}
	public String getAge_utilisateur() {
		return age_utilisateur;
	}
	public void setAge_utilisateur(String age_utilisateur) {
		this.age_utilisateur = age_utilisateur;
	}
	public String getTel_utilisateur() {
		return tel_utilisateur;
	}
	public void setTel_utilisateur(String tel_utilisateur) {
		this.tel_utilisateur = tel_utilisateur;
	}
	public String getEmail_utilisateur() {
		return email_utilisateur;
	}
	public void setEmail_utilisateur(String email_utilisateur) {
		this.email_utilisateur = email_utilisateur;
	}
	public String getAdr_utilisateur() {
		return adr_utilisateur;
	}
	public void setAdr_utilisateur(String adr_utilisateur) {
		this.adr_utilisateur = adr_utilisateur;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

}
