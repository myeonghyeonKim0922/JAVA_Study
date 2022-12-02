package test.ch05;

public class Calculator2 {
	//1.필드
	static double pi = 3.14159;
	static String model = "calc1";
	static String number = "1";
	static String info;
	
	//static 블록: static 필드에 대한 초기화 작업이 필요할때 사용
	static {
		info = model + "_" + number;
	}
	
	//2.메소드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}
