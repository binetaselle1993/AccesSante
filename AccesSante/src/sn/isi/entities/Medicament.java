package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Medicament {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id_produit;
	@ManyToOne
	private Ordonnance ordonnance =new Ordonnance();
	@ManyToOne
	private  Commande commande=new Commande();
	@Column
	private String designation;
	@Column
	private String description;
	@Column
	private String type;
	@Column
	private Double prix;
	public Medicament() {
		super();
	}
	public Medicament(int id_produit, Ordonnance ordonnance, Commande commande, String designation, String description,
			String type, Double prix) {
		super();
		Id_produit = id_produit;
		this.ordonnance = ordonnance;
		this.commande = commande;
		this.designation = designation;
		this.description = description;
		this.type = type;
		this.prix = prix;
	}
	public int getId_produit() {
		return Id_produit;
	}
	public void setId_produit(int id_produit) {
		Id_produit = id_produit;
	}
	public Ordonnance getOrdonnance() {
		return ordonnance;
	}
	public void setOrdonnance(Ordonnance ordonnance) {
		this.ordonnance = ordonnance;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}

}
