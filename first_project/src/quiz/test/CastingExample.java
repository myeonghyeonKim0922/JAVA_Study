package quiz.test;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			
			bus.run();
			bus.run();
			bus.checkFare();
			
		}
	}

}
