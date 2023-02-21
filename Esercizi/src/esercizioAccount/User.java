package esercizioAccount;

import esercizioDevelopers.Account;

public class User {

	private String name;
	private String lastName;
	private int eta;
	
	private Account account;

	public User(String name, String lastName, int eta) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.eta = eta;
		this.account = null;
	}

	public User(String name, String lastName, int eta, Account account) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.eta = eta;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", lastName=" + lastName + ", eta=" + eta + ", account=" + account + "]";
	}
	
	
	
	
	
	
}
