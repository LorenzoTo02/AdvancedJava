package cerchioCilindro;

public class Cylinder extends Circle{

	private double height;
	
	public Cylinder(double height, double r) {
		super(r);
		this.height = height;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getSurfaceArea() {
		return 2 * super.getSurfaceArea() + super.getCircle() * this.height;
	}
	
	public double getVolume() {
		return super.getSurfaceArea() * this.height;	
	}
	
	
}
