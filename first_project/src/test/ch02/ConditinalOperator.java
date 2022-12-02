package test.ch02;

public class ConditinalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int score = 75;
		char grade = (score > 90) ? 'A' : (score > 80) ? 'B' : ((score > 70) ? 'C' : 'D');
		
		System.out.println(score + "점은" + grade +"등급입니다.");
		
		
		int num = 1;
		System.out.println((num > 0) ? "양수" : ( num == 0) ? "0입니다" : "음수");
	}

}
