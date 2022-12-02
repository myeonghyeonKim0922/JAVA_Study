package school.report;

import java.util.ArrayList;

import school.*;

public class GenerateGradeReport {
	School goodschool = School.getInstance();
	public static final String LINE = "-----------------------\n";
	public static final String HEADER = "수강생 학점 \t\t\n";
	public static final String FOOTER = "\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public void getreport(Subject subject) {
		
	}
	
	public void header(Subject subject) {
		buffer.append(LINE);
		buffer.append("\t"+subject.getSubjectName());
		buffer.append(HEADER);
		buffer.append("이름 | 학번 | 필수과목 | 점수");
		buffer.append(LINE);
	}
	
	public void body(Subject subject) {
		ArrayList<Student> studentList = subject.getStudentList();
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName());
			buffer.append(" | ");
			
		}
		
	}
	
	public void footer(Subject subject) {}
	
	
	public void
}
