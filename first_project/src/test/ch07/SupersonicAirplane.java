package test.ch07;

public class SupersonicAirplane extends Airplane{

	static final public int NORMAL = 1;
	static final public int SUPERSONIC = 2;
	
	//필드
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			super.fly();			
		}
		//super.메소드명() -> 부모 클래스의 메소드 실행
	}
	
}
