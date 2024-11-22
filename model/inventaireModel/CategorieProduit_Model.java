package inventaireModel;
import java.util.ArrayList;
import java.util.List;
public class CategorieProduit_Model {

	    private int idCategorie;
	    private String nom;
	    private String description;
	    private List<Produit_Model> produits;

	    public CategorieProduit_Model(int identifiantCategorie, String nom, String description) {
	        this.idCategorie = identifiantCategorie;
	        this.nom = nom;
	        this.description = description;
	        this.produits = new ArrayList<>();
	    }

	    public List<Produit_Model> obtenirProduitsParCategorie() {
	        return produits;
	    }
	    // Getters
	    public int getIdentifiantCategorie() {
	        return idCategorie;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }
	    
	    public List<Produit_Model> getProduits() {
	        return produits;
	    }

	    public void setProduits(List<Produit_Model> produits) {
	        this.produits = produits;
	    }
}
