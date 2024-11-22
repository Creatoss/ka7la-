package commandeModel;
import java.util.List;

public class GestioannaireVentes_Model {
	 private List<Commande_Model> listCommandes;

	    public GestioannaireVentes_Model(List<Commande_Model> listCommandes) {
	        this.listCommandes = listCommandes;
	    }

	    public List<Commande_Model> getListCommandes() {
	        return listCommandes;
	    }

	    public void setListCommandes(List<Commande_Model> listCommandes) {
	        this.listCommandes = listCommandes;
	    }
}
