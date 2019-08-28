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
public class Ordonnance {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id_ordonnance;
		@ManyToOne
		private Consultation consultation =new Consultation();
		@OneToMany(mappedBy="ordonnance")
		private List<Medicament> medicament = new ArrayList<Medicament>();
		@ManyToOne
		private Medecin medecin =new Medecin();
		@ManyToOne
		private Dossier dossier =new Dossier();
		@Column
		private Date date_preinscription;
		@Column
		private String description;
		public Ordonnance() {
			super();
		}
		public Ordonnance(int id_ordonnance, Consultation consultation, List<Medicament> medicament, Medecin medecin,
				Dossier dossier, Date date_preinscription, String description) {
			super();
			this.id_ordonnance = id_ordonnance;
			this.consultation = consultation;
			this.medicament = medicament;
			this.medecin = medecin;
			this.dossier = dossier;
			this.date_preinscription = date_preinscription;
			this.description = description;
		}
		public int getId_ordonnance() {
			return id_ordonnance;
		}
		public void setId_ordonnance(int id_ordonnance) {
			this.id_ordonnance = id_ordonnance;
		}
		public Consultation getConsultation() {
			return consultation;
		}
		public void setConsultation(Consultation consultation) {
			this.consultation = consultation;
		}
		public List<Medicament> getMedicament() {
			return medicament;
		}
		public void setMedicament(List<Medicament> medicament) {
			this.medicament = medicament;
		}
		public Medecin getMedecin() {
			return medecin;
		}
		public void setMedecin(Medecin medecin) {
			this.medecin = medecin;
		}
		public Dossier getDossier() {
			return dossier;
		}
		public void setDossier(Dossier dossier) {
			this.dossier = dossier;
		}
		public Date getDate_preinscription() {
			return date_preinscription;
		}
		public void setDate_preinscription(Date date_preinscription) {
			this.date_preinscription = date_preinscription;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
}
