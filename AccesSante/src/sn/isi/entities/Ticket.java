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
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_ticket;
	@ManyToOne
	private Agent agent =new Agent();
	@ManyToOne
	private TypeTicket typeTicket =new TypeTicket();
	@ManyToOne
	private Patient patient =new Patient();
	@Column
	private Long numero;
	@Column
	private Double prix;
	@Column
	private String description;
	@Column
	private Date date;
	public Ticket() {
		super();
	}
	public Ticket(int id_ticket, Agent agent, TypeTicket typeTicket, Patient patient, Long numero, Double prix,
			String description, Date date) {
		super();
		this.id_ticket = id_ticket;
		this.agent = agent;
		this.typeTicket = typeTicket;
		this.patient = patient;
		this.numero = numero;
		this.prix = prix;
		this.description = description;
		this.date = date;
	}
	public int getId_ticket() {
		return id_ticket;
	}
	public void setId_ticket(int id_ticket) {
		this.id_ticket = id_ticket;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public TypeTicket getTypeTicket() {
		return typeTicket;
	}
	public void setTypeTicket(TypeTicket typeTicket) {
		this.typeTicket = typeTicket;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
