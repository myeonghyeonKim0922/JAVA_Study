package quiz.javaBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(date.format(now));
	}

}
