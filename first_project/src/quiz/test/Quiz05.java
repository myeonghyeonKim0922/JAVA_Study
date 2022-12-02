package quiz.test;

public class Quiz05 extends Quiz04{

	public static void main(String[] args) {
		Quiz05 student = new Quiz05();
		System.out.print(student);
		
	}
	
	@Override
	public String toString() {
		return "이름:" + name + " 반: " + ban +" 번호: "+no;
		
	}

}
