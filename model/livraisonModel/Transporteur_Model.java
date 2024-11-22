package livraisonModel;

public class Transporteur_Model {
	private final int idTransporteur;
    private String nom;
    private String contact;
    private String zoneLivraison;

    public Transporteur_Model(int idTransporteur, String nom, String contact, String zoneLivraison) {
        this.idTransporteur = idTransporteur;
        this.nom = nom;
        this.contact = contact;
        this.zoneLivraison = zoneLivraison;
    }

    public int getIdTransporteur() {
        return idTransporteur;
    }

    /*public void setIdTransporteur(int idTransporteur) {
        this.idTransporteur = idTransporteur;
    }*/

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getZoneLivraison() {
        return zoneLivraison;
    }

    public void setZoneLivraison(String zoneLivraison) {
        this.zoneLivraison = zoneLivraison;
    }
}
