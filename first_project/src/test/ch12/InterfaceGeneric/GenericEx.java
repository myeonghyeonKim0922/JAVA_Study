package test.ch12.InterfaceGeneric;

public class GenericEx {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.tutnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}

}
