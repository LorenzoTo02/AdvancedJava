package esercizioDevelopers;

public class Developer extends AbstractEmployee{
	
	private String language;

	public Developer(String name, String lastName, String language, double salario) {
		super(name, lastName, salario);
		this.language = language;
		
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Developer [language=");
		builder.append(language);
		builder.append("]");
		return builder.toString();
	}
	
	

	

	

	

	
	
	
	
	

}
