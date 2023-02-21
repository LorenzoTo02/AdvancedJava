package esercizioDevelopers;

public abstract class AbstractEmployee implements Employee{

	private String name;
	private String lastName;
	private Company company;
	private Account account;
	private double salario;
	
	
	public AbstractEmployee(String name, String lastName, double salario) {
		this.name = name;
		this.lastName = lastName;
		this.company = null;
		this.account = null;
		this.salario = salario;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
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


	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Developer [name=");
		builder.append(name);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", company=");
		builder.append(company.getName());
		builder.append(", account=");
		builder.append(account.getAmount());
		builder.append(", salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
