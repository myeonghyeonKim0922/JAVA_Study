package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //자동 타입변환
//		vehicle.run();
	//  vehicle.checkFare();
		
		
//		Bus bus = (Bus) vehicle;
//		bus.run();
//		bus.checkFare();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		ride(taxi);
		ride(bus);
	}
	
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			//vehicle이 Bus 객체를 가지고 있냐? Vehicle vehicle = new Bus();
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
	}

}
