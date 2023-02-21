package cerchioCilindro;

public class Circle {

	private double r;

	public Circle(double r) {
		this.r = r;
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	public double getSurfaceArea() {
		return Math.PI*Math.pow(this.r, 2);
	}
	
	public double getCircle() {
		return 2 * Math.PI * this.r;
	}
	
	
}
