package test.ch08;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("===========");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
		
//		RemoteControl rc;
//		rc = new Television();
//		rc.turnOn();
//		rc.setVolume(20);
//		rc.turnOff();
//		
//		
//		
//		rc = new Audio(); //오디오로 교체
//		rc.turnOn();
//		rc.setVolume(20);
//		rc.turnOff();
	}
}
