package sn.isi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Jour_travail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id_jour_travail;
	@ManyToOne
	private Planing planing =new Planing();
	@Column
	private Date date;
	@Column
	private String heure_travail;
	@Column
	private String heure_pause;
	public Jour_travail() {
		super();
	}
	public Jour_travail(int id_jour_travail, Planing planing, Date date, String heure_travail, String heure_pause) {
		super();
		Id_jour_travail = id_jour_travail;
		this.planing = planing;
		this.date = date;
		this.heure_travail = heure_travail;
		this.heure_pause = heure_pause;
	}
	public int getId_jour_travail() {
		return Id_jour_travail;
	}
	public void setId_jour_travail(int id_jour_travail) {
		Id_jour_travail = id_jour_travail;
	}
	public Planing getPlaning() {
		return planing;
	}
	public void setPlaning(Planing planing) {
		this.planing = planing;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHeure_travail() {
		return heure_travail;
	}
	public void setHeure_travail(String heure_travail) {
		this.heure_travail = heure_travail;
	}
	public String getHeure_pause() {
		return heure_pause;
	}
	public void setHeure_pause(String heure_pause) {
		this.heure_pause = heure_pause;
	}

}
