package model;

public class Note {
	int nombre_etoile;
	Utilisateur [] liste_users;
	Centre [] liste_centres;
	Formation [] liste_fomations;
	public Note(int nombre_etoile) {
		super();
		this.nombre_etoile = nombre_etoile;
	}
	public Note() {
		super();
	}
	
	public void setListe_centres(Centre[] liste_centres) {
		this.liste_centres = liste_centres;
	}
	public int getNombre_etoile() {
		return nombre_etoile;
	}
	public void setNombre_etoile(int nombre_etoile) {
		this.nombre_etoile = nombre_etoile;
	}
	
	
}
