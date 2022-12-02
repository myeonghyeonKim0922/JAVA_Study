package test.ch07.poly;

public class Car {
	//필드로 타이어 객체 선언
	public Tire tire;
	
	public void run() {
		//타이어를 굴린다
		tire.roll();
	}
}
