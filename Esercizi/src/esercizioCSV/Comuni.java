package esercizioCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

import javax.management.RuntimeErrorException;

public class Comuni {
	
	private String comune;
	private String provincia;
	private String regione;
	
	public Comuni(String comune, String provincia, String regione) {
		this.comune = comune;
		this.provincia = provincia;
		this.regione = regione;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getRegione() {
		return regione;
	}
	public void setRegione(String regione) {
		this.regione = regione;
	}
	
	public static void addComune(Comuni c) throws IOException {
		File csv = new File("files/comuni.csv");
		if(!csv.exists()) {
			csv.createNewFile();
		}
		
		Writer output = new BufferedWriter(new FileWriter(csv, true));
		output.write(c.getComune());
		output.write(",");
		output.write(c.getProvincia());
		output.write(",");
		output.write(c.getRegione());
		output.write("\n");
		output.flush();
		output.close();
	}
	
	public static void viewAll() throws IOException {
		File csv = new File("files/comuni.csv");
		if(!csv.exists()) {
			throw new RuntimeException("File inesistente");
		}
		
		Reader input = new FileReader(csv);
		char[] readedChars = new char[Short.MAX_VALUE];
		int readed;
		while((readed = input.read(readedChars)) != -1) {
			
		}
		int count = 0;
		for (int i = 0; i < readedChars.length; i++) {
			if(i != 0) {				
				if(!Character.isWhitespace(readedChars[i]) || !Character.isWhitespace(readedChars[i-1])) {
					System.out.print(readedChars[i]);
				}
			} else {
				System.out.print(readedChars[i]);
			}
		}
		System.out.println();
	}
	
	

}
