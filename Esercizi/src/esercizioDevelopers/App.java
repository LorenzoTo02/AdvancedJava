package esercizioDevelopers;

public class App {

	public static void main(String[] args) {
		
		Bank banca = new Bank("Intesa", "P.za Statuto");
		
		Company Alten = new Company("Alten");
		Alten.setAccount(banca.newAccount(1000000));
		
		Employee d1 = new Developer("Mario", "Bross", "JavaScript", 1300);
		Employee d4 = new Consulent("Luigi", "Mario", 21, 1000);
		d1.setAccount(banca.newAccount(0));
		Employee d2 = new Developer("Abel", "Nucci", "Spring", 1500);
		d2.setAccount(banca.newAccount(0));
		d4.setAccount(banca.newAccount(0));
		d1.getAccount().setUser(d1);
		d2.getAccount().setUser(d2);
		d4.getAccount().setUser(d4);
		Alten.addDeveloper(d1);
		Alten.addDeveloper(d4);
		d4.setCompany(Alten);

		d1.setCompany(Alten);
		Alten.addDeveloper(d2);
		d2.setCompany(Alten);

		
		double pagamento = Alten.payDevelopers();
		
		System.out.println(d1.getAccount().toString());
		System.out.println(d2.getAccount().toString());

		System.out.println(Alten.toString());
		
		System.out.println("Pagamento effettuato, totale: " + pagamento + "€");
		
		String name = "Paolino";
		int age = 19;
		
		System.out.printf("Nome: %s - età %d \n", name, age);
		
		Account.transferTo(d1.getAccount(), d2.getAccount(), 100.00);
		
		System.out.println(d1.getAccount().toString());
		System.out.println(d2.getAccount().toString());
		
		
	}

}
