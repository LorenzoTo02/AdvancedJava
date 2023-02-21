package arrayFigure;

public class Triangolo extends AbstractFigure{

	private double base;
	private double height;
	
	public Triangolo(double base, double height) {
		super(3);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calcolaPerimetro() {
		return Math.round((Math.sqrt(Math.pow(this.base/2, 2) + Math.pow(this.height, 2)) * 2) + this.base);
	}

	@Override
	public double calcolaArea() {
		return (this.base * this.height)/2;
	}
	
	
	
	
	
	
}
