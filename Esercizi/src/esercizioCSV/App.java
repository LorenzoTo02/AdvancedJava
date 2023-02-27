package esercizioCSV;

import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		
		boolean start = true;
		
		while(start) {
			System.out.println("1) Inserisci comune");
			System.out.println("2) Vedi tutti");
			System.out.println("3) Esci");
			int fai = scanner();
			if(fai == 1) {
				System.out.println("Inserisci Comune");
				String comune = chiediScanner();
				System.out.println("Inserisci Provincia");
				String provincia = chiediScanner();
				System.out.println("Inserisci Regione");
				String regione = chiediScanner();
				Comuni.addComune(new Comuni(comune, provincia, regione));
				start = true;
			} else if (fai == 2){
				Comuni.viewAll();
				start = true;
			} else if(fai == 3) {
				System.out.println("Arrivederci!");
				start = false;
			}
		}
		
		
		
	}
	
	public static int scanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	public static String chiediScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

}
