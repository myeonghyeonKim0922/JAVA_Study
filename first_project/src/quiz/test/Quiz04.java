package quiz.test;

public class Quiz04 {

	static String name ="das"; // 학생이름
	static int ban = 1; //반
	static int no =10; //번호
	static int kor; //국어점수
	static int eng; //영어점수
	static int math; //수학점수
	static int totalresult;
	static float avgresult;
	public static void main(String[] args) {
		
		
		}
	
	public static int getTotal() {
		totalresult = kor + eng + math;
		return totalresult;
	}
	
	public static String getAverage() {
		avgresult = totalresult % 3;
		return String.format("%.2f",avgresult);
		 
	}

}
