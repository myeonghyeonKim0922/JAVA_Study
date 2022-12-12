package homework;

public class Ray extends Cars{
		
	@Override
	public void InitCarInfo() {
		super.CarName = "레이";
		super.Engine = "I3";
		super.Fuel ="Gasoline";
		super.FuelEfficiency = "3등급";
		this.rideCapacity = 5;
		super.Hp = 76;
		super.Rpm = 6200  ;
		super.Cc = 998;
		super.Gear = "4단";
	}
}