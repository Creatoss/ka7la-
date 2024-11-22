package livraisonModel;
import java.util.List;
public class GestionnaireLivraison_Model {
	private List<Livraison_Model> listLivraisons ; 
	public  GestionnaireLivraison_Model( List<Livraison_Model> listLivraisons ) 
	{
		this.listLivraisons = listLivraisons; 
	}
	public List<Livraison_Model> getListLivraisons() {
        return listLivraisons;
    }

    public void setListLivraisons(List<Livraison_Model> listLivraisons) {
        this.listLivraisons = listLivraisons;
    }

}
