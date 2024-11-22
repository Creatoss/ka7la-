package userModel;
/*import clientModel.GestioannaireClients_Model ; 
import commandeModel.GestioannaireVentes_Model;
import fournisseurModel.GestioannaireFournisseur_Model;
import inventaireModel.GestionnaireInventaire_Model;
import livraisonModel.GestionnaireLivraison_Model;*/
public class Utilisateur_Model {
	private final int idUtilisateur ; 
	private String nomUtilisateur ; 
	private String motDePasse ; 
	private String role  ; 
	/*
	private GestioannaireClients_Model clients ; 
	private GestioannaireVentes_Model commandes ; 
	private GestioannaireFournisseur_Model fournisseurs ; 
	private GestionnaireInventaire_Model prduits ; 
	private GestionnaireLivraison_Model Livraison ; 
	*/
	
	public Utilisateur_Model(int identifiantUtilisateur , String nomUtilisateur , String motDePasse , String role  ) {
		this.idUtilisateur= identifiantUtilisateur  ; 
		this.nomUtilisateur = nomUtilisateur ; 
		this.motDePasse = motDePasse ;  
		this.role = role  ; 
		
		
	}
	
	public int getIdentifiantUtilisateur() {
        return idUtilisateur;
    }

    /*public void setIdentifiantUtilisateur(int identifiantUtilisateur) {
        this.identifiantUtilisateur = identifiantUtilisateur;
    }*/

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
