package test.ch11.Annotation;

public class Service {
	//필드
//	String test;
	
	//생성자
//	Service(){}
	
	//메소드
	@PrintaAnnotation
	public void method1() {}
	
	@PrintaAnnotation
	public void method2() {}
	
	@PrintaAnnotation(value="#", number = 20)
	public void method3() {}
	
}
