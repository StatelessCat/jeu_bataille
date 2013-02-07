import java.util.Random;


public class MainClass {

	public static void main(String[] args) {
		/*
		try {
			Paquet p = new Paquet();
			p.retirerCarte(4);
		} catch (Exception e) {
			System.out.println(e);
		}
		*/
		Random ran = new Random();
		Integer lol = ran.nextInt(4);
		
		System.out.println(lol);
		
	}

}
