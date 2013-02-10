import java.io.IOException;


public abstract class Joueur {
	
	protected Paquet paquet;
	
	public Joueur() {
		this.paquet = new Paquet();
	}
	
	public final void nouveauJeu() {
		System.out.println("le joueur " + this.toString() + " entre dans le jeu");
	}
	
	public final Carte jouer() throws Exception {
		//System.out.println(this.paquet.getNombreCartes());
		Carte carte = choisirCarte();
		this.paquet.retirerCarte(carte);
		System.out.println(this.paquet.getNombreCartes());
		return carte;
	}
	
	public abstract Carte choisirCarte() throws Exception;
	
	public void recupererCarte(Carte carte) {
		this.paquet.ajouterCarte(carte);
	}
	
	public boolean aPerdu() {
		if (this.paquet.getNombreCartes() <= 0) {
			System.out.println("le joueur " + this.hashCode() + " a perdu");
			return true;
		}
		else {
			return false;
		}
	}
	
}
