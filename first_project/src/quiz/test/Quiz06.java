package quiz.test;

public class Quiz06 {

	public static void main(String[] args) {
		class Marine {
			int x = 0, y = 0; // Marine의 위치좌표(x,y)
			static int hp = 60; // 현재 체력
			static int weapon = 6; // 공격력
			static int armor = 0; // 방어력

			static void weaponUp() {
				weapon++;
			}

		              void armorUp() {
				armor++;
			}

			void move(int x, int y) {
				this.x = x; // this.x는 인스턴스 변수, x는 지역변수
				this.y = y; // this.y는 인스턴스 변수, y는 지역변수
			}

	}

}
}