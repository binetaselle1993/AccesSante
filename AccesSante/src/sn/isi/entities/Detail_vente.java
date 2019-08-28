package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Detail_vente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_vente;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_ordonnance;
	@Column
	private String description;
	public Detail_vente() {
		super();
	}
	public Detail_vente(int id_vente, int id_ordonnance, String description) {
		super();
		this.id_vente = id_vente;
		this.id_ordonnance = id_ordonnance;
		this.description = description;
	}
	public int getId_vente() {
		return id_vente;
	}
	public void setId_vente(int id_vente) {
		this.id_vente = id_vente;
	}
	public int getId_ordonnance() {
		return id_ordonnance;
	}
	public void setId_ordonnance(int id_ordonnance) {
		this.id_ordonnance = id_ordonnance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
