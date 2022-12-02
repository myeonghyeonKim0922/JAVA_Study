2package test.ch08.field_multi;

public class CarEx {

	public static void main(String[] args) {
		Car mycar = new Car();
		mycar.run();
		
		//타이어 객체 교체
		mycar.tire1 = new KumhoTire();
		mycar.tire2 = new KumhoTire();
		mycar.run();
		
	}

}
