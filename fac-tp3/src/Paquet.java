import java.util.ListIterator;
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
			str += str.toString() + "\n";
		}
		return str;
	}
	
	public Carte retirerCarte(int carte) {
		return this.cartes.remove(carte);
	}
	
	public Carte retirerCarte(Carte carte) throws Exception {
		Carte crt = new Carte();
		ListIterator<Carte> li = this.cartes.listIterator();
		while(li.hasNext()) {
			crt = li.next();
			if ((carte.getCouleur() == crt.getCouleur()) && (carte.getValeur() == crt.getValeur())) {
				break;
			}
		}
		if ((carte.getCouleur() == crt.getCouleur()) && (carte.getValeur() == crt.getValeur())) {
			return crt;
		}
		else {
			throw new Exception("");
		}
		
	}
	
	public Carte getCarte(int index) {
		return this.cartes.elementAt(index);
	}
	
	public int getNombreCartes() {
		return this.cartes.size();
	}
	
	public void melanger() {}
}
