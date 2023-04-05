package model;

public class Centre {
	String nom_centre;
	String adresse_centre;
	int num_centre;
	String email_centre;
	String site_centre;
	Utilisateur [] liste_users;
	Payment payment;
	public String getNom_centre() {
		return nom_centre;
	}
	public void setNom_centre(String nom_centre) {
		this.nom_centre = nom_centre;
	}
	public String getAdresse_centre() {
		return adresse_centre;
	}
	public void setAdresse_centre(String adresse_centre) {
		this.adresse_centre = adresse_centre;
	}
	public int getNum_centre() {
		return num_centre;
	}
	public void setNum_centre(int num_centre) {
		this.num_centre = num_centre;
	}
	public String getEmail_centre() {
		return email_centre;
	}
	public void setEmail_centre(String email_centre) {
		this.email_centre = email_centre;
	}
	public String getSite_centre() {
		return site_centre;
	}
	public void setSite_centre(String site_centre) {
		this.site_centre = site_centre;
	}
	public Utilisateur[] getListe_users() {
		return liste_users;
	}
	public void setListe_users(Utilisateur[] liste_users) {
		this.liste_users = liste_users;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Centre(String nom_centre, String adresse_centre, int num_centre, String email_centre, String site_centre,
			Payment payment) {
		super();
		this.nom_centre = nom_centre;
		this.adresse_centre = adresse_centre;
		this.num_centre = num_centre;
		this.email_centre = email_centre;
		this.site_centre = site_centre;
		this.payment = payment;
	}
	public Centre() {
		super();
	}
	
	
}
