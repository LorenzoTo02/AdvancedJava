package modal;

import java.util.Arrays;

public class Blog {

	private String name;
	private Article[] articles;
	public static int count = 0;
	
	public Blog(String name) {
		this.name = name;
		this.articles = new Article[0];
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

			count++;
			Article[] ar = new Article[count];
			for (int i = 0; i < this.articles.length; i++) {
				if(this.articles[i] != null)
					ar[i] = this.articles[i];
				//counter++;
			}
			ar[count - 1] = article;
			
			this.articles = ar;
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
