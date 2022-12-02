package homework;

public class Avante extends Cars{

	@Override
	public void InitCarInfo() {
		super.CarName ="아반떼";
		super.Engine = "I4";
		super.Fuel ="Gasoline/Hybrid";
		super.FuelEfficiency = "1등급";
		this.rideCapacity = 5;
		super.Hp = 105;
		super.Rpm = 5700 ;
		super.Cc = 1580;
		super.Gear = "6단";
	}

}
