package eccezioni;

import java.io.IOException;

public class App {
	
	public static void main(String[] args) throws IOException {
			
		User u = new User("mome", "ciao", "lollo@gmail.com", "Password123!", 9);
		System.out.println(u.toString());
		User.saveUser(u);
			
	}
	
}
