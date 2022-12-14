package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import school.*;
import utils.Define;

public class GenerateGradeReport {
	//필드
	School school = School.getInstance(); //School 싱글톤 객체 생성
	
	public static final String TITLE = "수강생 학점 \t\t\n";
	public static final String HEADER = "이름 | 학번 | 필수과목 | 점수     \n";
	public static final String LINE = "---------------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	//성적 산출 결과의 헤더, 몸통, 푸터를 합쳐준다.
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList(); //과목 리스트 불러오기
		for(Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter(subject);
		}
		
		return buffer.toString(); //buffer의 데이터를 String타입으로 바꾼다.
	}
	
	//헤더를 만들어준다.
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t"+subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}
	
	
	//몸통을 만든다.
	public void makeBody(Subject subject) {
		//해당 과목을 수강신청한 학생 리스트를 가져온다.
		ArrayList<Student> studentList = subject.getStudentList();
		
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId()); //학번
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName() + "\t");
			buffer.append(" | ");
			
			//학생별 수강과목의 점수 학점 계산
			getScoreGrade(student, subject.getSubjectID());
			buffer.append("\n");
			buffer.append(LINE);
			
		}
	}

	//학생의 수강과목 점수와 학점을 얻는 메소드
	public void getScoreGrade(Student student, int subjectId) {
		//해당 학생이 수강한 과목의 점수 리스트(국어, 수학)
		ArrayList<Score> scoreList = student.getScoreList();
		
		//해당 학생의 필수과목의 과목코드
		int majorId = student.getMajorSubject().getSubjectID();
		
		GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation()};
		
		for(int i=0; i<scoreList.size(); i++) {
			Score score = scoreList.get(i); //해당 과목의 점수를 받아온다.
			
			//과목코드가 같은지 확인
			if(score.getSubject().getSubjectID() == subjectId) {
				String grade; //학점
				
				if(score.getSubject().getSubjectID() == majorId) { //필수과목일때 학점 산출
					grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
				}else { //일반과목일때 학점 산출
					grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());					
				}
				
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}
	
	//푸터를 만든다
	public void makeFooter(Subject subject) {
		buffer.append("\n"); //buffer += "\n"
	}
}
