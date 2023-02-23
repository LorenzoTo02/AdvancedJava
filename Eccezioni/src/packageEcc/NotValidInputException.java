package packageEcc;

public class NotValidInputException extends RuntimeException{
	
	
	public NotValidInputException() {
		super("Not Valid Input Exception");
	}
	public NotValidInputException(String message) {
		super(message);
	}
	public NotValidInputException(Throwable cause) {
		super(cause);
	}
	public NotValidInputException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public void print() {
		System.out.println("NotValidInputException: " + this.getMessage());
	}
	
}
