package test.ch05;

public class Korea {
	//final 필드(저장된 값들을 절대로 변경할 수 없다.)
	//final 필드는 초기값을 반드시 줘야한다.(필드 선언시 주거나 혹은 생성자에서 줘야한다.)
	final String nation ="대한민국";
	final String ssn; //주민번호
	
	//인스턴스 필드
	String name;
	
	Korea(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
	
}
