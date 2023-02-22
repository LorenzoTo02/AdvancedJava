package classi;

import java.util.Objects;

public class User implements Cloneable{
	
	public static final String TAG = User.class.getName();

	private String firstname;
	private String lastname;
	
	public User() {
		this.firstname = "";
		this.lastname = "";
	}
	
	public User(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public User(User src) {
		this.firstname = src.firstname;
		this.lastname = src.lastname;
	}

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null)
			return false;
		
		if(obj == this)
			return true;
		
		if(!(obj instanceof User)) 
			return false;
		
		User user = (User) obj;
		
		return this.firstname.equals(user.firstname) && this.lastname.equals(user.lastname);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstname, lastname);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		User dest = new User();
		dest.firstname = this.firstname;
		dest.lastname = this.lastname;
		return dest;
	}
	
	
	
	
	
	
	
	
}
