package classi;

public class App {

	public static void main(String[] args) {
		
		User thomas = new User("Thomas", "Turbato");
		User guido = new User("Guido", "La Vespa");
		
		System.out.println(thomas.toString());
		
		System.out.println(thomas.equals(guido));
		
		System.out.println(thomas.hashCode());
		
		
	}

}
