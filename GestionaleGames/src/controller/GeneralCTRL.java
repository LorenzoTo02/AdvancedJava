package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import modal.GameOffline;
import modal.GameOnline;
import modalInterface.Game;

public class GeneralCTRL {

	public static ArrayList<String> getData() {
		
		ArrayList<String> lines = new ArrayList<>();
		
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\loren\\git\\repo\\GestionaleGames\\src\\files\\games.txt"));

				while(sc.hasNextLine()) {
					String line = sc.nextLine();
					lines.add(line);
				}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Non trovato");
		}
		return lines;
		
		
	}
	
	public static ArrayList<Game> gameCheck(String[] games) {
		
		ArrayList<Game> objGames = new ArrayList<>();
		
		for (int i = 0; i < games.length; i++) {
			
			String[] game = games[i].split(" - ");
			
			String title = game[0];
			double price = Double.parseDouble(game[1]);
			String store = game[2];
			int year = Integer.parseInt(game[3]);
			boolean online = Boolean.parseBoolean(game[4]);
			if(online) {
				int nPlayer = Integer.parseInt(game[5]);
				Game g = new GameOffline(title, price, store, year, store, online);
				objGames.add(g);
			} else {
				String story = game[5];
				Game g = new GameOnline(title, price, store, year, year, online);
				objGames.add(g);
			}
			
			
			
		}
		
		return objGames;
		
	}
	
	
	
}
