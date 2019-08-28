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
public class TypeTicket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@OneToMany(mappedBy="typeTicket")
	private List<Ticket> ticket = new ArrayList<Ticket>();
	@Column
	private String libelle;
	public TypeTicket() {
		super();
	}
	public TypeTicket(int id, List<Ticket> ticket, String libelle) {
		super();
		this.id = id;
		this.ticket = ticket;
		this.libelle = libelle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Ticket> getTicket() {
		return ticket;
	}
	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
