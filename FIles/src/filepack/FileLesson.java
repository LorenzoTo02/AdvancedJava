package filepack;

import java.io.File;
import java.io.IOException;

public class FileLesson {

	public static void main(String[] args) throws IOException {
		
		File documentiDir = new File("documenti");
		if(!documentiDir.exists()) {
			documentiDir.mkdirs(); //make directories
		}
		
		File currentYearDocumentDir = new File(documentiDir, "2023");
		if(!currentYearDocumentDir.exists()) {
			currentYearDocumentDir.mkdir();
		}
		
		for (int i = 0; i < 2; i++) {
			File readme = new File(currentYearDocumentDir, "readme" + i +".txt");
			if (!readme.exists()) {
				readme.createNewFile();
			} 
		}
		String absolutePath = documentiDir.getAbsolutePath();
		System.out.println(absolutePath);
		
		
		File[] files = currentYearDocumentDir.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
		
	}

}
