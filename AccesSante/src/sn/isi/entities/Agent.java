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
@DiscriminatorValue("AGENT")
public class Agent {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id_agent;
	@OneToMany(mappedBy="agent")
	private List<Ticket> ticket = new ArrayList<Ticket>();
	public Agent() {
		super();
	}
	public Agent(int id_agent, List<Ticket> ticket) {
		super();
		Id_agent = id_agent;
		this.ticket = ticket;
	}
	public int getId_agent() {
		return Id_agent;
	}
	public void setId_agent(int id_agent) {
		Id_agent = id_agent;
	}
	public List<Ticket> getTicket() {
		return ticket;
	}
	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	} 
	
}
