package test.ch05;

public class Earth {
	//상수(변수명은 대문자, 스네이크로 쓴다)
	//final:절대 변경 x ,static: 전역 변수
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	//static 필드를 초기화 해줄때
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS; 
	}
	
}
