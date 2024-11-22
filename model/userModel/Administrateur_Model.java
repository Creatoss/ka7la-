package userModel;

public class Administrateur_Model extends Utilisateur_Model {
	private String niveauxAdmin  ; 
	public Administrateur_Model(int identifiantUtilisateur , String  nomUtilisateur , String motDePasse , String role , String niveauxAdmin ) {
		super(identifiantUtilisateur ,nomUtilisateur , motDePasse , role) ;
		this.niveauxAdmin = niveauxAdmin ; 
	}
	public String getNiveauxAdmin() {
		return this.niveauxAdmin ; 
	}
	
}
