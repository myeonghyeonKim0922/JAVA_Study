package test.ch12.wild;

public class GenericEx {

	public static void main(String[] args) {
		//모든 사람이 신청
//		Person person = new Person();
//		Applicant<Person> applicant = new Applicant<Person>(person);
//		Course.registerCourse1(applicant);
//		
//		Worker worker = new Worker();
//		Applicant<Worker> applicant2 = new Applicant<Worker>(worker);
//		Course.registerCourse1(applicant2); 
		//위에 코드를 한줄로 줄여쓴게 바로 아래의 코드이다.
		
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println("");
		//학생만 신청
//		Course.registerCourse2(new Applicant<Person>(new Person()));
//		Course.registerCourse2(new Applicant<Person>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println("");
		//직장인 및 일반인 신청
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<Student>(new Student()));
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println("");

		
	}

}
