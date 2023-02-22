package classi;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		User thomas = new User("Thomas", "Turbato");
		User thomas2 = new User("Thomas", "Turbato");
		User guido = new User("Guido", "La Vespa");
		
		System.out.println(thomas.toString());
		
		System.out.println(thomas.equals(thomas2));
		
		System.out.println(thomas.hashCode());
		
		System.out.println("Thomas Hash: " + thomas.hashCode());
		System.out.println("Thomas2 Hash: " + thomas2.hashCode());
		System.out.println("Guido Hash: " + guido.hashCode());
		
		User newThomas = (User) thomas.clone();
		User newThomas2 = new User(thomas);
		
		
		
	}

}
