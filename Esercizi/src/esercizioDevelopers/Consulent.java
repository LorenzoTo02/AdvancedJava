package esercizioDevelopers;

public class Consulent extends AbstractEmployee{
	
	private int clienti;

	public Consulent(String name, String lastName, double salario, int clienti) {
		super(name, lastName, salario);
		this.clienti = clienti;
	}

	public int getClienti() {
		return clienti;
	}

	public void setClienti(int clienti) {
		this.clienti = clienti;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Consulent [clienti=");
		builder.append(clienti);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	

	

	
	
	
}
