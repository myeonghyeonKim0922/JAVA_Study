package quiz.test;

public class Quiz02 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		int result = 0;
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println(sum /5);
	}

}
