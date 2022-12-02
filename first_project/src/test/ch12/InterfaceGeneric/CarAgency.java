package test.ch12.InterfaceGeneric;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		return new Car(); //Car 객체를 리턴
	}

}
