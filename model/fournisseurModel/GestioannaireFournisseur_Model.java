package fournisseurModel;
import java.util.ArrayList;
import java.util.List;
public class GestioannaireFournisseur_Model {
	private List<Fournisseur_Model> listeFournisseurs;
	public GestioannaireFournisseur_Model() {
        this.listeFournisseurs = new ArrayList<>();
    }
	
    public Fournisseur_Model getFournisseur(int idFournisseur) {
        for (Fournisseur_Model fournisseur : listeFournisseurs) {
            if (fournisseur.getIdFournisseur() == idFournisseur) {
                return fournisseur;
            }
        }
        return null; 
    }

    public List<Fournisseur_Model> getListeFournisseurs() {
        return listeFournisseurs;
    }
}
