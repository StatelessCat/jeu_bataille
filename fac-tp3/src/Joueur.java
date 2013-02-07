
public abstract class Joueur {
	
	protected Paquet paquet;
	
	public Joueur() {
		this.paquet = new Paquet();
	}
	
	public final void nouveauJeu() {
		// TODO 
	}
	
	public final Carte jouer() throws Exception {
		Carte carte = choisirCarte();
		paquet.retirerCarte(carte);
		return carte;
	}
	
	public abstract Carte choisirCarte();
	
	public void recupererCarte(Carte carte) {
		this.paquet.ajouterCarte(carte);
	}
	
	public boolean aPerdu() {
		if (this.paquet.getNombreCartes() <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
