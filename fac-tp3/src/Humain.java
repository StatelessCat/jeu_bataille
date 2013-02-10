import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Humain extends Joueur {

	@Override
	public Carte choisirCarte() throws Exception {
		Carte c2 = new Carte();
		
		try {
			System.out.println("Vous disposez des cartes suivantes:");
			System.out.println(this.paquet.toString());
			System.out.println("Veuillez choisir une carte:");
			Reader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			String couleur = br.readLine();
			String valeur = br.readLine();
			
			Carte c1 = new Carte(Integer.parseInt(couleur), Integer.parseInt(valeur));
			// instruction succeptible de lever une Exception:
			c2 = this.paquet.retirerCarte(c1);
			// j'ai besoin de retourner une carte:
			return c2;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			throw new Exception("impossible de renvoyer une carte");
		} 
	}

}
