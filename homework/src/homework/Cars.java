package homework;

public class Cars {
	//필드
		int rideCapacity = 0; //승차 정원
		int Cc = 0; //배기량
		protected String CarName = "스파크";
		protected String Engine; //엔진 형식
		protected String Fuel; //연료
		protected String FuelEfficiency;//연비	
		public String saleRank;
		int Hp = 0; //마력(horse power)
		int Rpm = 0; //최고 출력 회전수
		protected String Gear; //기어 단 수
		
		
		
		
		
		//생성자
		public Cars() {
		}
		
		//메소드
		public void InitCarInfo(){
			this.CarName ="스파크";
			this.Engine = "I3";
			this.Fuel = "Gasoline";
			this.FuelEfficiency = "2등급";
			this.rideCapacity = 5;
			this.Hp = 75; 
			this.Rpm = 6500 ;
			this.Cc = 999;
			this.Gear = "5단";
		}
		
		public void showInfo() {
			System.out.println("모델: " + CarName);
			System.out.println("엔진형식: " + Engine);
			System.out.println("연료 종류: " + Fuel);
			System.out.println("연비 등급: " + FuelEfficiency);
			System.out.println("승차 정원:" +rideCapacity);
			System.out.println("최고 출력:" +Hp +"마력");
			System.out.println("최고 출력 회전 수:" +Rpm);
			System.out.println("배기량:" +Cc+"cc");
			System.out.println("기어 단 수:" +Gear);
			System.out.println("");
			System.out.println("");
			
	}
}
