import java.util.ListIterator;
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
	public Carte retirerCarte(Carte carte) throws Exception {
		Carte crt = new Carte();
		ListIterator<Carte> li = this.cartes.listIterator();
		while(li.hasNext()) {
			crt = li.next();
			// si l'objet Carte est identique au parametre
			if ((carte.getCouleur() == crt.getCouleur()) && (carte.getValeur() == crt.getValeur())) {
				break;
			}
		}
		// on vérifie que la raison de la sortie de la boucle est bien que la carte à étée trouvée:
		if ((carte.getCouleur() == crt.getCouleur()) && (carte.getValeur() == crt.getValeur())) {
			// on retire le référent de la carte que l'on enleve:
			return this.cartes.remove(li.previousIndex());
		}
		else {
			throw new IllegalArgumentException("pas de carte trouvée");
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
