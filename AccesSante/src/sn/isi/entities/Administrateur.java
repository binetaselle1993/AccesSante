package sn.isi.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("ADMIN")
public class Administrateur {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id_admin;

public Administrateur() {
	super();
}

public Administrateur(int id_admin) {
	super();
	this.id_admin = id_admin;
}

public int getId_admin() {
	return id_admin;
}

public void setId_admin(int id_admin) {
	this.id_admin = id_admin;
}

 



	
}
