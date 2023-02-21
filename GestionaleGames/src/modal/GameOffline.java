package modal;

import modalInterface.Store;

public class GameOffline extends GameImpl{

	private String story;
	
	public GameOffline(String title, double price, Store store, int year, String story, boolean online) {
		super(title, price, store, year, online);
		this.story = story;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}
	
	

}
