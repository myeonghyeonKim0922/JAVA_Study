package test.ch01;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte byteValue = 10;
//		int intValue = byteValue;
//		System.out.println(intValue);
//		
//		
//		char charValue = '가';
//		intValue = charValue;
//		System.out.println(intValue);
//		
//		intValue = 50;
//		long longValue = intValue;
//		System.out.println(longValue);
//		
//		longValue = 100;
//		float floatValue = longValue;
//		System.out.println(floatValue);
//		
//		floatValue = 100.5f;
//		double doubleValue = floatValue;
//		System.out.println(doubleValue);
		
		
		//char타입의 허용범위는 음수를 포함하지 않음 byte는 음수가 있어서
//		byte test = 65;
//		char charValue = test;
		
//		int intValue = 103029770;
//		byte byteValue = (byte)intValue;
//		System.out.println(byteValue);
//		
//		long var1 = 300;
//		int var4 = (int) var1;
//		System.out.println(var4);
//		
//		int var5 = 65;
//		char var6 = (char) var5;
//		System.out.println(var6);
//		
//		double var7 = 3.14;
//		int var8 = (int) var7;
//		System.out.println(var8);
		
		byte x = 10; 
		byte y = 20;
		int result = x + y;
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		
		char v6 ='a';
		char v7 = 1;
		int result4 = v6 + v7;
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println(result5);
		
		int v9 = 10;
		double result6 = v9/4.0;
		System.out.println(result6);
		
		int v10 = 1; 
		int v11 = 2;
		
		double result7 = (double)v10 / v11;
		System.out.println(result7);
		
		String str = "안녕하세요";
		int val = 1;
		String val2 = "3";
		System.out.println(str + val + val2);
		
		byte value = Byte.parseByte(val2); //문자형을 byte형으로
		int value2 = Integer.parseInt(val2);
		double value3 = Double.parseDouble(val2);
		
		String str2 = String.valueOf(val);//기본형을 문자형으로
//		String str2 = String.valueOf(3.14);
//		String str2 = String.valueOf(true);
		
		
		System.out.printf("이름:%-6s\n","감자바"); //문자열
		System.out.printf("이름:%10.2f\n",25.21); //실수
		System.out.printf("실수:%f"
				+ " , 정수출력: %d",25.21,20); //실수
		System.out.printf("이름:%6d",25); //정수
		
		
		
		
	}

}
