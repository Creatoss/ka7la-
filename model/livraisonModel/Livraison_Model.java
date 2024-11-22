package livraisonModel;
import java.time.LocalDate;

import commandeModel.Commande_Model;

public class Livraison_Model {
	 private int idLivraison;
	    private Commande_Model commande;
	    private String adresseLivraison;
	    private LocalDate dateEstimee;
	    private String statut;

	    public Livraison_Model(int idLivraison, Commande_Model commande, String adresseLivraison, LocalDate dateEstimee, String statut) {
	        this.idLivraison = idLivraison;
	        this.commande = commande;
	        this.adresseLivraison = adresseLivraison;
	        this.dateEstimee = dateEstimee;
	        this.statut = statut;
	    }

	    public int getIdLivraison() {
	        return idLivraison;
	    }

	    public void setIdLivraison(int idLivraison) {
	        this.idLivraison = idLivraison;
	    }

	    public Commande_Model getCommande() {
	        return commande;
	    }

	    public void setCommande(Commande_Model commande) {
	        this.commande = commande;
	    }

	    public String getAdresseLivraison() {
	        return adresseLivraison;
	    }

	    public void setAdresseLivraison(String adresseLivraison) {
	        this.adresseLivraison = adresseLivraison;
	    }

	    public LocalDate getDateEstimee() {
	        return dateEstimee;
	    }

	    public void setDateEstimee(LocalDate dateEstimee) {
	        this.dateEstimee = dateEstimee;
	    }

	    public String getStatut() {
	        return statut;
	    }

	    public void setStatut(String statut) {
	        this.statut = statut;
	    }

}
