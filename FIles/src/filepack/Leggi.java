package filepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Leggi {

	public static void main(String[] args) throws IOException {
	
		File file = new File("documenti/2023/readme.txt");
		InputStream input = new FileInputStream(file);
		
//		byte[] datas = new byte[(int) file.length()];
		byte[] datas = new byte[3];
//		int data;
		
		
		int readed = 0;
		
		while((readed = input.read(datas)) != -1) {
			System.out.println("Dati validi: " + readed + " bytes");
			for (int i = 0; i < readed; i++) {
				System.out.print(datas[i] + " ");
			}
			System.out.println();
		}
		
		
//		for (int i = 0 ; i < file.length() && (data = input.read()) != -1 ; i++) {
//			datas[i] = (byte) data;
//		}
		input.close();
		
//		System.out.println(Arrays.toString(datas));
		
	}

}
