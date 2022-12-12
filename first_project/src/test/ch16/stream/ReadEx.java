package test.ch16.stream;

import java.io.FileInputStream;

public class ReadEx {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while (true) {
				int data = is.read(); //1byte씩 읽기
				
				if (data == -1) break; //파일의 끝에 도달했을때
				
				System.out.println(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
