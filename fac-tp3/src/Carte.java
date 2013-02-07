
/**
 * 
 * @author raphael
 * Une carte :
 * couleur: {0: pique; 1: trefle; 2: coeur; 3: carreau}
 * valeur: {0: Carte2; 1: Carte3; 2: Carte4; 3: Carte5;
 * 4:Carte6; 5:Carte7; 6:Carte8; 7:Carte9; 8:Carte10;
 * 9:Valet; 10:Dame; 11:Roi; 12:As}
 */
public class Carte {
	private int couleur;
	private int valeur;
	
	public Carte() {
		this.couleur = 0;
		this.valeur = 0;
	}
	
	public Carte(Carte carte) {
		this.couleur = carte.couleur;
		this.valeur = carte.valeur;
	}
	
	public Carte(int couleur, int valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}
	
	public String toString() {
		return "{" + "valeur: " + this.valeur + " couleur: " + this.couleur + "}";
	}

	public int getCouleur() {
		return couleur;
	}

	private	 void setCouleur(int couleur) {
		this.couleur = couleur;
	}

	public int getValeur() {
		return valeur;
	}

	private void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	/**
	 * Compare deux cartes
	 * @param c
	 * @return 1 si l'objet appelant est plus fort que la Carte en parametre, -1 si la Carte en parametre est plus forte, 0 sinon
	 */
	public int compareCarte(Carte c) {
		if (this.valeur > c.valeur) {
			return 1;
		}
		else if (this.valeur < c.valeur) {
			return -1; 
		}
		else {
			return 0;
		}
	}
	
	public int hashCode() {
		return this.valeur * (this.couleur+1);
	}
}
