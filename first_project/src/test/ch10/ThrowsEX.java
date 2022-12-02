package test.ch10;

public class ThrowsEX {

	public static void main(String[] args) {
		try {
			findClass(); //메소드를 호출한 곳에서 예외처리
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static void findClass() throws ClassNotFoundException {
		Class.forName("Java.lang.String2");
	}
}
