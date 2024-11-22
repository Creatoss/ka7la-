package clientModel;
import java.util.List;
import java.util.ArrayList;

public class GestioannaireClients_Model {
	private List<Client_Model> listeClients;

    // Constructeur
    public GestioannaireClients_Model() {
        this.listeClients = new ArrayList<>();
    }

    // Méthode pour ajouter un client
    public void ajouterClient(Client_Model client) {
        listeClients.add(client);
    }

    // Méthode pour supprimer un client
    public void supprimerClient(Client_Model client) {
        listeClients.remove(client);
    }

    // Méthode pour obtenir un Client_Modelpar son identifiant
    public Client_Model obtenirClientParId(int identifiantClient) {
        for (Client_Model client : listeClients) {
            if (client.getIdentifiantClient() == identifiantClient) {
                return client;
            }
        }
        return null; // Retourne null si le client n'est pas trouvé
    }

    // Méthode pour obtenir la liste des clients
    public List<Client_Model> getListeClients() {
        return listeClients;
    }

    // Méthode pour définir la liste des clients
    public void setListeClients(List<Client_Model> listeClients) {
        this.listeClients = listeClients;
}
}
