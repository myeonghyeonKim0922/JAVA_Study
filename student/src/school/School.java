package school;

import java.util.ArrayList;

public class School {
	static School instance = new School();
	private static String SCHOOL_NAME = "Good School";
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
		instance = new School();	
		}
		return instance;
	}
	
	public void studentadd(Student student) {
		studentList.add(student);
	}
	
	public void subjectadd(Subject subject) {
		subjectList.add(subject);
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	
	
}
