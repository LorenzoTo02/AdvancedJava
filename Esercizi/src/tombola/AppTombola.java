package tombola;

import java.util.HashSet;
import java.util.Set;

public class AppTombola {

	public static void main(String[] args) {
		
		Set<Integer> numeri = new HashSet<>();
		int[] counters = new int[Short.MAX_VALUE];
		
		int iterazioni = 0;
		
		for (int i = 0; i < counters.length; i++) {
			int count = 0;
			numeri.clear();
			
			do{
				numeri.add((int)(Math.random()* 91));
				count++;
				iterazioni++;
				System.out.println(iterazioni);
			}while(numeri.size() <= 90);
			
			counters[i] = count;
		}

		System.out.println("La media è: " + calcolaMedia(counters));
		
		
		
	}
	
	public static double calcolaMedia(int[] counters) {
		int somma = 0;
		for (int i = 0; i < counters.length; i++) {
			somma += counters[i];
		}
		return somma / counters.length;
	}

}
