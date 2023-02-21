package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
	
	public static void gameCheck() {
		
	}
	
	
	
}
