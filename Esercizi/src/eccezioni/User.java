package eccezioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public class User {

	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private int age;
	
	public User(String firstname, String lastname, String email, String password, int age) {
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setEmail(email);
		this.setPassword(password);
		this.setAge(age);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		if(firstname == null)
			throw new ExceptionUser("Nome nullo");
		if(firstname.isEmpty())
			throw new ExceptionUser("Nome vuoto");
		if(firstname.length() > 255 || firstname.length() < 2)
			throw new ExceptionUser("Nome non valido");
		if(!firstname.matches("[A-z]{2,255}"))
			throw new ExceptionUser("Nome con caratteri non validi");
		this.firstname = firstname;
		
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		if(lastname == null)
			throw new ExceptionUser("Cognome nullo");
		if(lastname.isEmpty())
			throw new ExceptionUser("Cognome vuoto");
		if(lastname.length() > 255 || lastname.length() < 2)
			throw new ExceptionUser("Cognome non valido");
		if(!lastname.matches("[A-z]{2,255}"))
			throw new ExceptionUser("Nome con caratteri non validi");
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email == null)
			throw new ExceptionUser("Email nulla");
		if(email.isEmpty())
			throw new ExceptionUser("Email vuota");
		if(!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))
			throw new ExceptionUser("Email non valida");
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password == null)
			throw new ExceptionUser("Password nulla");
		if(password.isEmpty())
			throw new ExceptionUser("Password vuota");
		if(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$"))
			throw new ExceptionUser("Password non valida");
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age <= 0)
			throw new ExceptionUser("Età non valida");
		this.age = age;
	}
	
	public static void saveUser(User u) throws IOException {
		File file = new File("files/user.txt");
		if(!file.exists())
			file.createNewFile();
		FileOutputStream output = new FileOutputStream(file);

		output.write(("Firstname: " + u.getFirstname() + "\n").getBytes());
		output.write(("Lastname: " + u.getLastname() + "\n").getBytes());
		output.write(("Email: " + u.getEmail() + "\n").getBytes());
		output.write(("Password: " + u.getPassword() + "\n").getBytes());
		output.write(("Età: " + u.getAge() + "\n").getBytes());
		
		output.flush();
		output.close();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
