package test.ch11.Date;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx2 {

	public static void main(String[] args) {
		//타임존 객체 생성
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		
		Calendar now = Calendar.getInstance(timeZone); //현재 시간과 날짜를 가져옴
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(month);
		System.out.println(year);
		System.out.println(day);
		
		
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY: strWeek = "월";break;
		case Calendar.TUESDAY: strWeek = "화";break;
		case Calendar.WEDNESDAY: strWeek = "수";break;
		case Calendar.THURSDAY: strWeek = "목";break;
		case Calendar.FRIDAY: strWeek = "금";break;
		case Calendar.SATURDAY: strWeek = "토";break;
		case Calendar.SUNDAY: strWeek = "일";break;
		}
		System.out.println(strWeek);
		
		int amPm = now.get(Calendar.AM_PM);
//		System.out.println(amPm);
		
		if(amPm == Calendar.AM) {
			System.out.println("오전");			
		}else {
			System.out.println("오후");			
		}
		
		System.out.println(now.get(Calendar.HOUR) + "," + now.get(Calendar.MINUTE)+","+now.get(Calendar.SECOND));
		
		//Hour: 오전/오후 기준(0~11)
	}

}
