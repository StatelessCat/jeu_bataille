
public class Jeu {

	private Paquet paquet;
	
	public Jeu(Joueur j1, Joueur j2) throws Exception {
		this.paquet = new Paquet();
		this.creerNouveauPaquet();
		
		int cpt = 1;
		this.distribuerPaquet(j1, j2);
		System.out.println(j1.toString());
		System.out.println(j1.paquet.getNombreCartes());
		
		System.out.println(j2.toString());
		System.out.println(j2.paquet.getNombreCartes());
		
		while( !(j1.aPerdu()) && !(j2.aPerdu())) {
			System.out.println(">>>tour :" + cpt++);
			this.jouer(j1, j2);
		}
	}
	
	private void jouer(Joueur j1, Joueur j2) throws Exception {
		Carte c1 = j1.choisirCarte();
		System.out.println(j1.hashCode() + " pose : " + c1 + " reste " + j1.paquet.getNombreCartes() + " cartes");
		
		Carte c2 = j2.choisirCarte();
		System.out.println(j2.hashCode() + " pose : " + c2 + " reste " + j2.paquet.getNombreCartes() + " cartes");

		if (c1.compareCarte(c2) == 1) {
			j1.recupererCarte(c1);
			j1.recupererCarte(c2);
		}
		else if (c1.compareCarte(c2) == -1) {
			j2.recupererCarte(c1);
			j2.recupererCarte(c2);
		}
		else {
			//j1.recupererCarte(c1);
			//j2.recupererCarte(c2);
		}
	}
	
	private void creerNouveauPaquet() {
		for (int i = 0; i < 12; ++i) {
			for (int j = 0; j < 4; ++j) {
				Carte tmp = new Carte(j, i);
				this.paquet.ajouterCarte(tmp);
			}
		}
	}
	
	private void distribuerPaquet(Joueur j1, Joueur j2) {
		j1.nouveauJeu();
		j2.nouveauJeu();
		while (this.paquet.getNombreCartes() >= 2) {
			Carte c1 = this.paquet.retirerCarte();
			Carte c2 = this.paquet.retirerCarte();
			j1.recupererCarte(c1);
			j2.recupererCarte(c2);
			System.out.println(this.paquet.toString());
		}
	}
}
