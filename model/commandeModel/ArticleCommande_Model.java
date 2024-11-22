package commandeModel;
import inventaireModel.Produit_Model;

public class ArticleCommande_Model {
	private final int idArticle  ;
	private Produit_Model produit ; 
	private int quantite ; 
	private double prixUnitaire ; 
	
	public ArticleCommande_Model(int idArticle ,Produit_Model produit ,int quantite , double prixUnitaire  ) 
	{
		this.idArticle = idArticle ; 
		this.produit = produit; 
		this.quantite = quantite ; 
		this.prixUnitaire = prixUnitaire  ; 
	}
	public int getIdArticle() {
        return idArticle;
    }
	public Produit_Model getProduit() {
        return produit;
    }

    public void setProduit(Produit_Model produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
	
	
}
