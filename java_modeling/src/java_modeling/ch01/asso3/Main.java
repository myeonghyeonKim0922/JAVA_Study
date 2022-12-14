package java_modeling.ch01.asso3;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		//학생 두명 생성
		Student s1 = new Student("홍길동");
		Student s2 = new Student("김첨지");
		
		//과목생성
		Course jv = new Course("Java");
		Course dp = new Course("Design Pattern");
		
		//수강신청
		Transcript t1 = new Transcript(s1, jv); //홍길동은 java를 수강신청
		Transcript t2 = new Transcript(s1, dp); //홍길동은 디자인 패턴을 수강신청
		Transcript t3 = new Transcript(s2, dp); //김첨지는 디자인 패턴을 수강신청
		
		
		
		t1.setDate("2022");
		t1.setGrade("B0"); //길동의 2022년 Java성적이 B0다.
		
		t2.setDate("2022");
		t2.setGrade("D+"); //길동의 2022년 디자인패턴 성적이 D+이다.
		
		t3.setDate("2023");
		t3.setGrade("C+"); //첨지의 2023년 디자인패턴 성적이 C+이다.
		
		Vector vector = new Vector();
		vector.get(1);
		
	}

}
