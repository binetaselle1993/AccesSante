package sn.isi.controlleur;

import javax.faces.bean.ManagedBean;

import sn.isi.entities.Administrateur;

@ManagedBean(name="administrateurBean")
public class administrateurBean {
private Administrateur administrateur;

public administrateurBean() {
	administrateur=new Administrateur() ;
}
public String getConnection() {
	return "acceuil.jsf";
}

public Administrateur getAdministrateur() {
	return administrateur;
}

public void setAdministrateur(Administrateur administrateur) {
	this.administrateur = administrateur;
}


	
}
