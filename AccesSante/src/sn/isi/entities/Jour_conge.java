package sn.isi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jour_conge {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Planing planing =new Planing();
	@Column
	private String designation;
	@Column
	private Date date;
	public Jour_conge() {
		super();
	}
	public Jour_conge(int id, Planing planing, String designation, Date date) {
		super();
		this.id = id;
		this.planing = planing;
		this.designation = designation;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Planing getPlaning() {
		return planing;
	}
	public void setPlaning(Planing planing) {
		this.planing = planing;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
