package test.ch12.InterfaceGeneric;

public class HomeAgency implements Rentable<Home>{

	@Override
	public Home rent() {
		return new Home();//home 객체를 리턴
	}

}
