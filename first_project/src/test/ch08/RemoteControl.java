package test.ch08;

public interface RemoteControl {
	//인터페이스에 선언된 필드는 모두 public static final 특성을 갖는다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//public 추상메소드
	//public이 없어도 컴파일 과정에서 public abstract가 자동으로 붙는다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드: 인터페이스에서 실행 메소드를 구현하고 싶을때 사용.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 처리 합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("음소거 해제.");
		}
	}
	
	//정적(static)메소드
	//코드를 구현 할 수 있다.
	//public이 없어도 컴파일 과정에서 public이 붙는다.
	static void changeBattery() {
		System.out.println("건전지 교체.");		
	}
	
}
