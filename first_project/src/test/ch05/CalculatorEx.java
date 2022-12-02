package test.ch05;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10); 
		System.out.println(result1);
		
		double result2 = myCalc.areaRectangle(10, 20);
		System.out.println(result2);
		
		
		
//		myCalc.powerOn();
//		
//		int result1 = myCalc.plus(10, 29);
//		System.out.println(result1);
//		
//		int x = 10, y = 4;
//		
//		double result2 = myCalc.divide(x,y);
//		System.out.println(result2);
//		
//		myCalc.powerOff();
	}

}
