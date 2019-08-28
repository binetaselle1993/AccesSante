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
public class Commande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int num_commande;
	@ManyToOne
	private Pharmacien pharmacien =new Pharmacien();
	@OneToMany(mappedBy="commande")
	private List<Medicament> medicament = new ArrayList<Medicament>();
	@ManyToOne
	private Stock stock =new Stock();
	@Column
	private Date date;
	@Column
	private int quantite;
	public Commande() {
		super();
	}
	public Commande(int num_commande, Pharmacien pharmacien, List<Medicament> medicament, Stock stock, Date date,
			int quantite) {
		super();
		this.num_commande = num_commande;
		this.pharmacien = pharmacien;
		this.medicament = medicament;
		this.stock = stock;
		this.date = date;
		this.quantite = quantite;
	}
	public int getNum_commande() {
		return num_commande;
	}
	public void setNum_commande(int num_commande) {
		this.num_commande = num_commande;
	}
	public Pharmacien getPharmacien() {
		return pharmacien;
	}
	public void setPharmacien(Pharmacien pharmacien) {
		this.pharmacien = pharmacien;
	}
	public List<Medicament> getMedicament() {
		return medicament;
	}
	public void setMedicament(List<Medicament> medicament) {
		this.medicament = medicament;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	

}
