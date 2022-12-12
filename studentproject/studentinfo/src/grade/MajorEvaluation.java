package grade;

/*
【문항4】 아래 클래스 다이어그램과 내용을 참고하여 grade 패키지의 GradeEvaluation.java, BasicEvaluation.java,          MajorEvaluation.java를 완성하시오.
         - GradeEvaluation메소드는 각각 학점을 리턴하며 MajorEvaluation은 필수과목 관련 클래스이고,   
           BasicEvalutiond은 일반과목 관련 클래스이다.
         - 각각의 클래스에서 학점을 반환하는 오버라이딩 된 getGrade 메소드를 작성하시오. (문제지 맨 위의  
           필수과목, 일반과목 학점 환산표 참고)
*/

public class MajorEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		String grade;
		if(point >= 95 && point <= 100) {
			grade = "S";
		}else if(point >= 90 && point <= 94) {
			grade = "A";
		}else if(point >= 80 && point <= 89) {
			grade = "B";
		}else if(point >= 70 && point <= 79) {
			grade = "C";
		}else if(point >= 60 && point <= 69) {
			grade = "D";
		}else {
			grade = "F";
		}
		return grade;
	}
	
}