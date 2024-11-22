package inventaireModel;
import java.util.ArrayList ; 
import java.util.List ; 
public class GestionnaireInventaire_Model {
	private List<Produit_Model> ListeProduits ; 
	public GestionnaireInventaire_Model() {
		this.ListeProduits=new ArrayList<>(); 
	}
	public List<Produit_Model> getListeProduits() {
        return this.ListeProduits;
    }
	public void setListeProduits(List<Produit_Model> listeProduits) {
        this.ListeProduits = listeProduits;
    }
	public Produit_Model obtenirProduitParId(int identifiantProduit) 
	{
        for (Produit_Model produit : ListeProduits) 
        {
            if (produit.getIdentifiantProduit() == identifiantProduit)
            {
                return produit;
            }
        }
		return null;
	}
}
