package modal;

public class Article {

	private String title;
	private String autore;
	
	public Article(String title, String autore) {
		this.title = title;
		this.autore = autore;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Article [title=");
		builder.append(title);
		builder.append(", autore=");
		builder.append(autore);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
