package test.ch02;

public class OverflowUnderflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125; // -128 ~127
		//오버플로우: 타입이 허용하는 최대값을 벗어나는 것
		
		for(int i = 0; i < 5; i++) {
			var1++;
//			System.out.println(var1);
			
			byte var2 = -125; // -128 ~127
			//언더플로우: 타입이 허용하는 최소값을 벗어나는 것 
			for(int i1 = 0; i1 < 5; i1++) {
				var2--;
				System.out.println(var2);
		}
	}

	}
}