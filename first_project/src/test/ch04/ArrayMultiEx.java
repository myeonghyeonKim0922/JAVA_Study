package test.ch04;

public class ArrayMultiEx {

	public static void main(String[] args) {
//		int[] scores = {10,90,10};
		int[][] scores = {{80,90,96},{76,88}};
		int[][] mathScore = new int[2][3];
		
		for (int i=0; i<mathScore.length; i++) {
			for(int k=0; k<mathScore[i].length; k++) {
				System.out.println("수학점수"+mathScore[i][k]);
			}
		}
//		int[][] mathScore = {{81,82,83},{84,85,86}};
//		mathScore[0][0] = 81;
//		mathScore[0][1] = 82;
//		mathScore[0][2]= 83;
//		mathScore[1][0]= 84;
//	    mathScore[1][1]= 85;
//		mathScore[1][2]= 86;
//										
		
		System.out.println("1차원 배열 길이(반의 수) :"+scores.length);
		System.out.println("2차원 배열 길이(반의 학생 수) :"+scores[0].length);
		System.out.println("2차원 배열 길이(반의 학생 수) :"+scores[1].length);

		System.out.println("첫번쨰 반의 세번째 학생 :"+scores[0][2]);
		System.out.println("첫번쨰 반의 세번째 학생 :"+scores[1][1]);
		
		//첫번째 반의 평균 점수
		
		int class1Sum=0;
		for (int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum/scores[0].length;
		System.out.println("첫번째 반의 평균"+class1Avg);
		
		int class2Sum=0;
		for (int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum/scores[1].length;
		System.out.println("두번째 반의 평균"+class2Avg);
		
		//전체 학생의 평균
		int totalStudent = 0;
		int totalSum = 0;
		for(int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		double totalAvg = (double) totalSum/totalStudent;
		System.out.println("전체 학생 평균"+totalAvg);
	}

}
