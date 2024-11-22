package inventaireModel;

public class Produit_Model {
	private final int idProduit;
    private String nom;
    private double prix;
    private int quantite;
    private String categorie;
    private String description;

    public Produit_Model(int identifiantProduit, String nom, double prix, int quantite, String categorie, String description) {
        this.idProduit = identifiantProduit;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie = categorie;
        this.description = description;
    }

    // Getters
    public int getIdentifiantProduit() {
        return idProduit;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    /*public void setIdentifiantProduit(int identifiantProduit) {
        this.identifiantProduit = identifiantProduit;
    }*/

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
