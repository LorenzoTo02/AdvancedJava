package esercizioDevelopers;

import esercizioAccount.User;

public class Account {
	
//	private static int nextIban = 0;
	private String iban;
	private double amount;
	
	private Employee user;
	
	static {
		
	}
	
	public Account(String iban, double amount) {
		this.iban = iban;
		this.amount = amount;
		
//		Account.nextIban++;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getIban() {
		return iban;
	}
	
	public Employee getUser() {
		return user;
	}

	public void setUser(Employee user) {
		this.user = user;
	}

	public void toTransfer(User userAcc, double amount) {
		
		if(amount <= 0 || this.getAmount() < amount) return;
		
		double newAmount = userAcc.getAccount().getAmount() + amount;
		userAcc.getAccount().setAmount(newAmount); 
		
		this.setAmount(this.getAmount() - amount);
	}
	
	public static void transferTo(Account from, Account to, double amount) {
		
		if(amount <= 0 || from.getAmount() < amount) return;
		
		double newAmount = to.getAmount() + amount;
		to.setAmount(newAmount); 
		
		from.setAmount(from.getAmount() - amount);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [iban=");
		builder.append(iban);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
	
	
	

	
	
	
	
	
	

}
