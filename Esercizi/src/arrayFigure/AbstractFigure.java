package arrayFigure;

public abstract class AbstractFigure implements Figure {

	private int nlati;
	
	public AbstractFigure(int nlati) {
		this.nlati = nlati;
	}

	public int getNlati() {
		return nlati;
	}

	public void setNlati(int nlati) {
		this.nlati = nlati;
	}
	
	
	
	
	
}
