package fournisseurModel;
import inventaireModel.Produit_Model;
import java.util.ArrayList;
import java.util.List;
public class Fournisseur_Model {
	    private final int idFournisseur;
	    private String nom;
	    private String contact;
	    private List<Produit_Model> produitsFournis;

	    public Fournisseur_Model (int idFournisseur, String nom, String contact) {
	        this.idFournisseur = idFournisseur;
	        this.nom = nom;
	        this.contact = contact;
	        this.produitsFournis = new ArrayList<>();
	    }

	    public int getIdFournisseur() {
	        return idFournisseur;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public String getContact() {
	        return contact;
	    }

	    public List<Produit_Model> getProduitsFournis() {
	        return produitsFournis;
	    }

	    public void setContact(String contact) {
	        this.contact = contact;
	    }
	    public void setNom(String nom) {
	        this.nom = nom;
	    }
	    public void setProduitsFournis(List<Produit_Model> produitsFournis) {
	        this.produitsFournis = produitsFournis;
	    }
}
