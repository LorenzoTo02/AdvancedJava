package esercizioDevelopers;

public class Company {

	private String name;
	private Employee[] developers;
	private Account account;
	
	public Company(String name) {
		this.name = name;
		this.developers = new Employee[15];
		this.account = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee[] getDevelopers() {
		return developers;
	}

	public void setDevelopers(Employee[] developers) {
		this.developers = developers;
	}
	
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void addDeveloper(Employee dev) {
		
		if(dev.getCompany() != null) return;
		int i = 0;
		
		while(this.developers[i] != null && i < this.developers.length) {
			i++;
		}
				
		this.developers[i] = dev;

	}
	
	public double payDevelopers() {
		double somma = 0;
		for (int i = 0; i < developers.length; i++) {
			if(developers[i] != null) {
				somma += developers[i].getSalario();
				double newAmount = developers[i].getAccount().getAmount() + developers[i].getSalario();
				developers[i].getAccount().setAmount(newAmount);
				double tot = this.account.getAmount();
				this.account.setAmount(tot - developers[i].getSalario());
			}		
		}
		return somma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [name=");
		builder.append(name);
		builder.append(", developers=");
		for (Employee developer : developers) {
			if(developer != null) {
				builder.append(" ");
				builder.append(developer.getName());
			}
		}
		builder.append(", Totale=");
		builder.append(account.getAmount());
		builder.append("]");
		return builder.toString();
	}

	
	


	

	
	
	

	
	
	
	
	
}
