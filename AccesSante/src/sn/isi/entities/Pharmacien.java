package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("PHARMACIEN")
public class Pharmacien {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_pharmacien;
	@OneToMany(mappedBy="pharmacien")
	private List<Vente_ordonnance> vente_ordonnace = new ArrayList<Vente_ordonnance>();
	@OneToMany(mappedBy="pharmacien")
	private List<Commande> commande = new ArrayList<Commande>();
	public Pharmacien() {
		super();
	}
	public Pharmacien(int id_pharmacien, List<Vente_ordonnance> vente_ordonnace, List<Commande> commande) {
		super();
		this.id_pharmacien = id_pharmacien;
		this.vente_ordonnace = vente_ordonnace;
		this.commande = commande;
	}
	public int getId_pharmacien() {
		return id_pharmacien;
	}
	public void setId_pharmacien(int id_pharmacien) {
		this.id_pharmacien = id_pharmacien;
	}
	public List<Vente_ordonnance> getVente_ordonnace() {
		return vente_ordonnace;
	}
	public void setVente_ordonnace(List<Vente_ordonnance> vente_ordonnace) {
		this.vente_ordonnace = vente_ordonnace;
	}
	public List<Commande> getCommande() {
		return commande;
	}
	public void setCommande(List<Commande> commande) {
		this.commande = commande;
	}
	

}
