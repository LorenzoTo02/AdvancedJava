package generics;

public class App {

	public static void main(String[] args) {
		
		Pair<Integer, Double> coppieN = new Pair<Integer, Double>(2, 3.4);
		
		Pair<Character, String> coppieS = new Pair<Character, String>('S', "Stringa");
		
		System.out.println(coppieN.toString());
		System.out.println(coppieS.toString());
		
	}

}
