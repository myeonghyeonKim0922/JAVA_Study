package quiz.Exception;

import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		FileWriter fw = null;
		try (FileWriter fw = new FileWriter("file.txt")){	
			fw.write("Java");	
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
