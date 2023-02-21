package esercizioDevelopers;

public interface Employee {


	Account getAccount();

	void setAccount(Account account);

	double getSalario();

	void setSalario(double salario);

	String getName();

	void setName(String name);

	String getLastName();

	void setLastName(String lastName);

//	String getLanguage();
//
//	void setLanguage(String language);

	Company getCompany();

	void setCompany(Company company);

}
