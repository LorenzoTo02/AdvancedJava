package modal;

import java.util.Arrays;

public class Blog {

	private String name;
	private Article[] articles;
	
	public Blog(String name) {
		this.name = name;
		this.articles = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}
	
	public void addArticle(Article article) {
		if(this.articles == null) {
			
		} else {
			
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Blog [title=");
		builder.append(name);
		builder.append(", articles=");
		builder.append(Arrays.toString(articles));
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
