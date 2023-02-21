package arrayFigure;

public class App {

	public static void main(String[] args) {
		
		Figure t = new Triangolo(5, 7);
		
		Figure s = new Square(6);
		
		Figure[] figures = new Figure[2];
		
		figures[0] = t;
		figures[1] = s;
		
		for (int i = 0; i < figures.length; i++) {
			if(figures[i] instanceof Square) {
				System.out.println("Area quadrato = " + figures[i].calcolaArea() + " cm2");
				System.out.println("Perimetro quadrato = " + figures[i].calcolaPerimetro() + " cm");
			} else if (figures[i] instanceof Triangolo) {
				System.out.println("Area Triangolo = " + figures[i].calcolaArea() + " cm2");
				System.out.println("Perimetro Triangolo = " + figures[i].calcolaPerimetro() + " cm");
			}
			
			System.out.println("------------------------------------");
		}
		
	}
	
}
