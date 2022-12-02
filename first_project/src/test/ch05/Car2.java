package test.ch05;

public class Car2 {
	//인스턴스 필드
	int speed;
	
	//인스턴스 메소드
	void run() {
		System.out.println(this.speed + "으로 달립니다.");
	}
	void run2() {
		this.run();
		System.out.println(this.speed + "으로 달립니다.");
	}
	
//	static {
//		this.speed = 200; //X
//		this.run(); //X
//	}
	
	//정적 메소드
	static void simulate() {
//		this.speed = 200;//X
//		this.run();//X
		Car2 myCar = new Car2();
		
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car2 myCar = new Car2();
		
		myCar.speed = 60;
		myCar.run();
		
		
	}

}
