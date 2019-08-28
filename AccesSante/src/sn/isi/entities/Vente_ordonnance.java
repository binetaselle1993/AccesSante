package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vente_ordonnance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_vente;
	@ManyToOne
	private Pharmacien pharmacien =new Pharmacien();
	@ManyToOne
	private Stock stock =new Stock();
	@Column
	private int quantite;
	@Column
	private Double montant;
	public Vente_ordonnance() {
		super();
	}
	public Vente_ordonnance(int id_vente, Pharmacien pharmacien, Stock stock, int quantite, Double montant) {
		super();
		this.id_vente = id_vente;
		this.pharmacien = pharmacien;
		this.stock = stock;
		this.quantite = quantite;
		this.montant = montant;
	}
	public int getId_vente() {
		return id_vente;
	}
	public void setId_vente(int id_vente) {
		this.id_vente = id_vente;
	}
	public Pharmacien getPharmacien() {
		return pharmacien;
	}
	public void setPharmacien(Pharmacien pharmacien) {
		this.pharmacien = pharmacien;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	
	
}
