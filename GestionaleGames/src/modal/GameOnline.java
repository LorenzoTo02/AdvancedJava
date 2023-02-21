package modal;

import modalInterface.Store;

public class GameOnline extends GameImpl{

	int nPlayer;
	
	public GameOnline(String title, double price, String store, int year, int nPlayer, boolean online) {
		super(title, price, store, year, online);
		this.nPlayer = nPlayer;
	}

	public int getnPlayer() {
		return nPlayer;
	}

	public void setnPlayer(int nPlayer) {
		this.nPlayer = nPlayer;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GameOnline [nPlayer=");
		builder.append(nPlayer);
		builder.append("]");
		return builder.toString();
	}
	
	

}
