package test.ch16.stream;

import java.io.FileInputStream;

public class ReadEx2 {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while (true) {
				int num = is.read(data); //최대 100 byte를 읽는다. 읽은 수는 리턴. data에 읽은 내용 저장.
				
				if (num == -1) break; //파일의 끝에 도달했을때
				
				for (int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			
			is.close(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
