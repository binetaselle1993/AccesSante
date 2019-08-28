package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Fiche_observation {
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
	
}
