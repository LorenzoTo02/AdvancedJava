package esercizioDevelopers;

public class Bank {

	private String name;
	private String address;
	private int clienti;
	
	
	public Bank(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Account newAccount(double amount) {
		Account a = new Account(setIban(), amount);
		this.clienti++;
		return a;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bank [name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
	
	public String setIban() {
		String iban = "";
		String numeri = "";
		for(int i = 0; i < 24; i++) {
			numeri += (int)(Math.random() * 10);
		}
		
		iban = "IT" + numeri + this.clienti;
		return iban;
		
	}
	
	
	
	
}
