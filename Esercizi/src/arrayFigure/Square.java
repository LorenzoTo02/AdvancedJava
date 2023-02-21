package arrayFigure;

public class Square extends AbstractFigure{

	private double lato;
	
	public Square(double lato) {
		super(4);
		this.lato = lato;
	}

	@Override
	public double calcolaPerimetro() {
		return lato * 4;
	}

	@Override
	public double calcolaArea() {
		return lato * lato;
	}

}
