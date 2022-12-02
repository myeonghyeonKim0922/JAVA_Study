package test.ch07;
// 클래스 앞에 final을 붙이면 그 클래스는 부모 클래스로 사용할 수 없다
//public final class Airplane {
public class Airplane {
	public void land() {
		System.out.println("착륙합니다.");
	}
	public void fly() {
		System.out.println("일반비행합니다.");
	}
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}
