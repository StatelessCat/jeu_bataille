import java.util.Random;
import java.util.Vector;

public class Paquet {

	private Vector<Carte> cartes; 
	
	public Paquet() {
		this.cartes = new Vector<Carte>();
	}
	
	public void ajouterCarte(Carte carte) {
		this.cartes.add(carte);
	}
	
	public String toString() {
		String str = new String();
		for (Carte c: this.cartes) {
			str += c.toString() + "\n";
		}
		return str;
	}
	
	public Carte retirerCarte(int n) {
		return this.cartes.remove(n);
	}
	
	/**
	 * Cherche une carte dans un paquet, la retire du paquet, puis la retourne
	 * @param carte carte à rechercher
	 * @return 
	 * @throws Exception
	 */
	public Carte retirerCarte(Carte carte) {
		int carteIndex = this.cartes.indexOf(carte);
		System.out.println("index : "+ carteIndex);
		if (carteIndex == -1) {
			throw new IllegalArgumentException("la carte n'est pas dans le jeu");
		}
		else {
			return this.cartes.remove(carteIndex);
		}
	}
	
	public Carte getCarte(int index) {
		return this.cartes.elementAt(index);
	}
	
	public int getNombreCartes() {
		return this.cartes.size();
	}
	
	public void melanger() {
		Random r = new Random();
		int pos1, pos2;
		Carte c1, c2;
		for (int i = 0; i < (this.cartes.size()*2); ++i) {
			pos1 = r.nextInt(this.cartes.size());
			pos2 = r.nextInt(this.cartes.size());
			c1 = this.getCarte(pos1);
			c2 = this.getCarte(pos2);
			this.cartes.set(pos1, c2);
			this.cartes.set(pos2, c1);
		}
	}
}
