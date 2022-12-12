package school;

import java.util.ArrayList;

public class Student {
	/*
	 【문항1】 아래 클래스 다이어그램을 참고하여 school 패키지의 Student.java를 완성하시오.
        - 필드 작성
        - 생성자 작성
        - 필드에 대한 getter, setter 메소드 작성
	 */
	private int studentId;
	private String studentName;
	private Subject majorSubject;
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score){
		scoreList.add(score);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
}
