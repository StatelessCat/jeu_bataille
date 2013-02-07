import java.util.Random;


public class Ordinateur extends Joueur {

	private Random random;
	
	public Ordinateur() {
		super();
		this.random = new Random();
	}
	
	public Carte choisirCarte() {
		return this.paquet.retirerCarte((random.nextInt(this.paquet.getNombreCartes())));
	}
}
