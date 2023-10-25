package raoua1.com.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Gateau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGateau;
	private String nomGateau;
	private double prix;
	private String saveur;
	private Date dateCreation;
	
	@ManyToOne
	private Commande commande;
	

	
	
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Gateau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gateau( String nomGateau, String saveur, Date dateCreation,double prix) {
		super();
		this.nomGateau = nomGateau;
		this.saveur = saveur;
		this.dateCreation = dateCreation;
		this.prix=prix;
	}
	
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Gateau [idGateau=" + idGateau + ", nomGateau=" + nomGateau + ", prix=" + prix + ", saveur=" + saveur
				+ ", dateCreation=" + dateCreation + "]";
	}
	public Long getIdGateau() {
		return idGateau;
	}
	public void setIdGateau(Long idGateau) {
		this.idGateau = idGateau;
	}
	public String getNomGateau() {
		return nomGateau;
	}
	public void setNomGateau(String nomGateau) {
		this.nomGateau = nomGateau;
	}
	public String getSaveur() {
		return saveur;
	}
	public void setSaveur(String saveur) {
		this.saveur = saveur;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	

}
