package eccezioni;

public class ExceptionUser extends RuntimeException{

	public ExceptionUser() {
		super("ExceptionUser");
	}
	public ExceptionUser(String message) {
		super(message);
	}
	public ExceptionUser(Throwable cause) {
		super(cause);
	}
	public ExceptionUser(String message, Throwable cause) {
		super(message, cause);
	}
	
	public void print() {
		System.out.println("ExceptionUser: " + this.getMessage());
	}
	
}
