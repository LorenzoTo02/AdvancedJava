package filepack;

import java.io.FileOutputStream;
import java.io.IOException;

public class Scrivi {

	public static void main(String[] args) throws IOException {
		
		//Output Stream (Scrittura nei file)
		
		FileOutputStream outputStream = new FileOutputStream("documenti/2023/readme.txt");
		
		byte[] datas = {99, 98, 97, 52, 47, 98, 36, 45, 28, 36};
		/*
		for (int i = 0; i < datas.length; i++) {
			outputStream.write((byte) datas[i]);
		}
		*/
		outputStream.write(datas);
		outputStream.flush();
		outputStream.close();
		
	}

}
