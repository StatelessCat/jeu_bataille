import java.util.Random;


public class Ordinateur extends Joueur {

	Random random;
	
	public Ordinateur() {
		super();
		this.random = new Random();
	}
	
	public Carte choisirCarte() {
		int r1 = random.nextInt();
		int r2 = random.nextInt();
		
		Carte c = new Carte();
	}
}
