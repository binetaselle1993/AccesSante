package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Lit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private Long numero;
	public Lit() {
		super();
	}
	public Lit(int id, Long numero) {
		super();
		this.id = id;
		this.numero = numero;
	}
	
}
