package clientModel;
import java.util.List;
import commandeModel.Commande_Model;
public class Client_Model {
	private final int identifiantClient;
    private String nom;
    private String email;
    private String numeroTelephone;
    private String adresse;
    private List<Commande_Model> historiqueAchats;

    // Constructeur
    public Client_Model(int identifiantClient, String nom, String email, String numeroTelephone, String adresse, List<Commande_Model> historiqueAchats) {
        this.identifiantClient = identifiantClient;
        this.nom = nom;
        this.email = email;
        this.numeroTelephone = numeroTelephone;
        this.adresse = adresse;
        this.historiqueAchats = historiqueAchats;
    }

    // Getters
    public int getIdentifiantClient() {
        return identifiantClient;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public List<Commande_Model> getHistoriqueAchats() {
        return historiqueAchats;
    }

    // Setters
    /*public void setIdentifiantClient(int identifiantClient) {
        this.identifiantClient = identifiantClient;
    }*/

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setHistoriqueAchats(List<Commande_Model> historiqueAchats) {
        this.historiqueAchats = historiqueAchats;
    }
}
