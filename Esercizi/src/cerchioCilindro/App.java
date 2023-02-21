package cerchioCilindro;

public class App {

	public static void main(String[] args) {
		
		Cylinder c = new Cylinder(2.3, 4.0);
		
		System.out.printf("Superficie del Cilindro: %f%ne il volume del cilindro: %f%n", c.getSurfaceArea(), c.getVolume());
		
	}

}
