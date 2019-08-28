package sn.isi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Hospitalisation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_hospitalisation;
	@ManyToOne
	private Infirmier infirmier =new Infirmier();
	@ManyToOne
	private Chambre chambre =new Chambre();

}
