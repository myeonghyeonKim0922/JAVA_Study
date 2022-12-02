package test.ch03;

public class for_EX {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		
//		System.out.println(sum);
		
//		for(float x=0.1f; x<=1.0f; x+=0.1f) {
//			System.out.println(x);
//		}
		
		
		
		for (int m=2; m<=9; m++) {
			System.out.println("***"+m+"단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));
				
			}
		}
		
		
		
		
		
		//		for (int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//
//		for (int i=1,j=1; i<=10; i++,j++) {
////			System.out.println(i);
//			System.out.println(j);
//		}
	}

}
