package java_modeling.ch01.asso3;

import java.util.Vector;

public class Course {
	//필드
	private String name; //과목명
	private Vector<Transcript> transcripts; //수강신청한 학생들
	
	//생성자
	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	//수강신청 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}
	//과목명
	public String getName() {
		return name;
	}
	
	
}
