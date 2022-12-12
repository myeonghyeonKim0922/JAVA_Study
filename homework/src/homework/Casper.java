package homework;

public class Casper extends Cars{

	@Override
	public void InitCarInfo() {
		super.CarName = "캐스퍼";
		super.Engine = "I3";
		super.Fuel ="Gasoline";
		super.FuelEfficiency = "-";
		this.rideCapacity = 4;
		super.Hp = 76;
		super.Rpm = 6200 ;
		super.Cc = 998 ;
		super.Gear = "4단";
	}

}
