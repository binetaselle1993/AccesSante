package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_stock;
	@OneToMany(mappedBy="stock")
	private List<Vente_ordonnance> vente_ordonnance = new ArrayList<Vente_ordonnance>();
	@OneToMany(mappedBy="stock")
	private List<Commande> commande = new ArrayList<Commande>();
	@Column
	private String quantite_stock;
	@Column
	private String quantite_seuil;
	@Column
	private String duree_stock;
	public Stock() {
		super();
	}
	public Stock(int id_stock, List<Vente_ordonnance> vente_ordonnance, List<Commande> commande, String quantite_stock,
			String quantite_seuil, String duree_stock) {
		super();
		this.id_stock = id_stock;
		this.vente_ordonnance = vente_ordonnance;
		this.commande = commande;
		this.quantite_stock = quantite_stock;
		this.quantite_seuil = quantite_seuil;
		this.duree_stock = duree_stock;
	}
	public int getId_stock() {
		return id_stock;
	}
	public void setId_stock(int id_stock) {
		this.id_stock = id_stock;
	}
	public List<Vente_ordonnance> getVente_ordonnance() {
		return vente_ordonnance;
	}
	public void setVente_ordonnance(List<Vente_ordonnance> vente_ordonnance) {
		this.vente_ordonnance = vente_ordonnance;
	}
	public List<Commande> getCommande() {
		return commande;
	}
	public void setCommande(List<Commande> commande) {
		this.commande = commande;
	}
	public String getQuantite_stock() {
		return quantite_stock;
	}
	public void setQuantite_stock(String quantite_stock) {
		this.quantite_stock = quantite_stock;
	}
	public String getQuantite_seuil() {
		return quantite_seuil;
	}
	public void setQuantite_seuil(String quantite_seuil) {
		this.quantite_seuil = quantite_seuil;
	}
	public String getDuree_stock() {
		return duree_stock;
	}
	public void setDuree_stock(String duree_stock) {
		this.duree_stock = duree_stock;
	}


}
