package test.ch05;

public class CarEx {

	public static void main(String[] args) {
		//1. 객체 생성
		Car mycar = new Car("그렌저","검정",250);
		
		
		System.out.println(mycar.model);
//		System.out.println(mycar.start);
		System.out.println(mycar.speed);
		System.out.println(mycar.color);
		System.out.println(mycar.company);
		System.out.println(mycar.maxSpeed);
		mycar.speed = 60;
		System.out.println(mycar.speed);
		
		System.out.println("--------------");
		Car car2 = new Car("자가용");
		System.out.println(car2.model);
		System.out.println(car2.color);
		Car car3 = new Car("자가용","빨강");
		System.out.println("--------------");
		System.out.println(car3.color);
		System.out.println(car3.model);
	}

}
