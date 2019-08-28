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
@DiscriminatorValue("INFIRMIER")
public class Infirmier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_infirmier;
	@OneToMany(mappedBy="infirmier")
	private List<Hospitalisation> hospitalisation = new ArrayList<Hospitalisation>();
	public Infirmier() {
		super();
	}
	public Infirmier(int id_infirmier, List<Hospitalisation> hospitalisation) {
		super();
		this.id_infirmier = id_infirmier;
		this.hospitalisation = hospitalisation;
	}
	public int getId_infirmier() {
		return id_infirmier;
	}
	public void setId_infirmier(int id_infirmier) {
		this.id_infirmier = id_infirmier;
	}
	public List<Hospitalisation> getHospitalisation() {
		return hospitalisation;
	}
	public void setHospitalisation(List<Hospitalisation> hospitalisation) {
		this.hospitalisation = hospitalisation;
	}

}
