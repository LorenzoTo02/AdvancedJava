package program;

import modal.Article;
import modal.Blog;

public class App {

	public static void main(String[] args) {
		
		Article a = new Article("Art 1", "Mario");
		Article b = new Article("Art 2", "Giuseppe");
		Article c = new Article("Art 3", "Fabiano");
		Article d = new Article("Art 4", "Gualtiero");
		
		Blog blog = new Blog("Bloggers");
		
		blog.addArticle(a);
		blog.addArticle(b);
		blog.addArticle(c);
		blog.addArticle(d);
		
		for (Article articolo : blog.getArticles()) {
			System.out.println(articolo.toString());
		}
		
	}

}
