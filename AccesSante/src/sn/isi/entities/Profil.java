package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Profil {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_profil;
	@Column
	private String role;
	public Profil() {
		super();
	}
	public Profil(int id_profil, String role) {
		super();
		this.id_profil = id_profil;
		this.role = role;
	}
	public int getId_profil() {
		return id_profil;
	}
	public void setId_profil(int id_profil) {
		this.id_profil = id_profil;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	 


}
