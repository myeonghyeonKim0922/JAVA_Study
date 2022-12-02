package school;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private Subject majorSubject;
	
	ArrayList<Score> scoreList = new ArrayList<Score>();
	
	public Student(String studentName, int studentId, Subject majorSubject ) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.majorSubject = majorSubject;
	}
	
	public void subjectScoreAdd(Score score) {
		scoreList.add(score);
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
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

	
	
	
}
