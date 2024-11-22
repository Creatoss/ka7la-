package commandeModel;

import clientModel.Client_Model;
import java.time.LocalDate;
import java.util.List;
public class Commande_Model {
	private final int idCommande;
    private Client_Model client;
    private List<ArticleCommande_Model> articlesCommande;
    private LocalDate dateCommande;
    private String statutCommande;
    private double montantTotal;

    public Commande_Model(int idCommande, Client_Model client, List<ArticleCommande_Model> articlesCommande, LocalDate dateCommande, String statutCommande, double montantTotal) {
        this.idCommande = idCommande;
        this.client = client;
        this.articlesCommande = articlesCommande;
        this.dateCommande = dateCommande;
        this.statutCommande = statutCommande;
        this.montantTotal = montantTotal;
    }

    public int getIdCommande() {
        return idCommande;
    }
    public Client_Model getClient() {
        return client;
    }

    public void setClient(Client_Model client) {
        this.client = client;
    }

    public List<ArticleCommande_Model> getArticlesCommande() {
        return articlesCommande;
    }

    public void setArticlesCommande(List<ArticleCommande_Model> articlesCommande) {
        this.articlesCommande = articlesCommande;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getStatutCommande() {
        return statutCommande;
    }

    public void setStatutCommande(String statutCommande) {
        this.statutCommande = statutCommande;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

}
