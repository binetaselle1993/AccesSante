package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Prise_en_charge {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String type;
	@Column
	private String entreprise;
	@Column
	private String assurance;
	@Column
	private Double taux;
	public Prise_en_charge() {
		super();
	}
	public Prise_en_charge(int id, String type, String entreprise, String assurance, Double taux) {
		super();
		this.id = id;
		this.type = type;
		this.entreprise = entreprise;
		this.assurance = assurance;
		this.taux = taux;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	public String getAssurance() {
		return assurance;
	}
	public void setAssurance(String assurance) {
		this.assurance = assurance;
	}
	public Double getTaux() {
		return taux;
	}
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
}
