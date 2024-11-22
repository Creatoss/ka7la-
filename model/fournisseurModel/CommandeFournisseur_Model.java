package fournisseurModel;
import java.time.LocalDate;
import inventaireModel.Produit_Model; 
public class CommandeFournisseur_Model {
	
	    private final int idCommande;
	    private Fournisseur_Model fournisseur;
	    private Produit_Model produit;
	    private int quantite;
	    private LocalDate dateCommande;
	    private String statut;
	    public CommandeFournisseur_Model(int idCommande, Fournisseur_Model fournisseur, Produit_Model produit, int quantite, LocalDate dateCommande, String statut) 
	    {
	        this.idCommande = idCommande;
	        this.fournisseur = fournisseur;
	        this.produit = produit;
	        this.quantite = quantite;
	        this.dateCommande = dateCommande;
	        this.statut = statut;
	    }
	    public int getIdCommande() {
	        return idCommande;
	    }

	    public Fournisseur_Model  getFournisseur() {
	        return fournisseur;
	    }

	    public Produit_Model getProduit() {
	        return produit;
	    }

	    public int getQuantite() {
	        return quantite;
	    }

	    public LocalDate getDateCommande() {
	        return dateCommande;
	    }

	    public String getStatut() {
	        return statut;
	    }
	    public void setFournisseur(Fournisseur_Model fournisseur) {
	        this.fournisseur = fournisseur;
	    }

	    public void setProduit(Produit_Model produit) {
	        this.produit = produit;
	    }

	    public void setQuantite(int quantite) {
	        this.quantite = quantite;
	    }

	    public void setDateCommande(LocalDate dateCommande) {
	        this.dateCommande = dateCommande;
	    }

	    public void setStatut(String statut) {
	        this.statut = statut;
	    }
}
