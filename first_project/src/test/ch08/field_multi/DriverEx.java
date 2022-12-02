package test.ch08.field_multi;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.driver(bus); //버스가 달립니다
		driver.driver(taxi); //택시가 달립니다
	}

}
