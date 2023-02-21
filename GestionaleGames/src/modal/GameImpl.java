package modal;

import modalInterface.Game;
import modalInterface.Store;

public abstract class GameImpl implements Game {
	
	private String title;
	private double price;
	private String store;
	private int year;
	boolean online;
	
	
	public GameImpl(String title, double price, String store, int year, boolean online) {
		this.title = title;
		this.price = price;
		this.store = store;
		this.year = year;
		this.online = online;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getStore() {
		return store;
	}


	public void setStore(String store) {
		this.store = store;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public boolean isOnline() {
		return online;
	}


	public void setOnline(boolean online) {
		this.online = online;
	}
	
	
	
	


}
