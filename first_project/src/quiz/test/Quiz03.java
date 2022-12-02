package quiz.test;

public class Quiz03 {

	public static void main(String[] args) {
		int money = 2680; 
		int result500 = 0; //500원을 나눈 결과
		int what500 = 0; // 500원의 갯수
		int result100 = 0;
		int what100 = 0;
		int result50 = 0;
		int what50 = 0;
		int result10 = 0;
		int what10 = 0;
		
		if(2680 % 500 != 0) {
			result500 = 2680 % 500;
			what500 = 2680 / 500;
		}
		if(result500 % 100 != 0) {
			result100 = result500 % 100;
			what100 = result500 / 100;
		}
		if(result100 % 50 != 0) {
			result50 = result100 % 50;
			what50 = result100 / 50;
		}
		if(result50 % 100 != 0) {
			result10 = result50 % 10;
			what10 = result50 / 10;
		}
		
		System.out.println("2680원을 모두 동전으로 바꿔서 생긴 동전갯수는?");
		System.out.println("500원 :"+what500+"개");
		System.out.println("100원 :"+what100+"개");
		System.out.println("50원 :"+what50+"개");
		System.out.println("10원 :"+what10+"개");
		
	}

}
