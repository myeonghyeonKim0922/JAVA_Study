package test.ch11.Annotation;

import java.lang.reflect.*;

public class PrintAnnotationEx {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			//PrintaAnnotation 얻기
			PrintaAnnotation printAno = method.getAnnotation(PrintaAnnotation.class);
			printLine(printAno);
			method.invoke(new Service()); //메소드 실행
		}
		
	}
	public static void printLine(PrintaAnnotation printAno) {
		if (printAno != null) {
			//number속성 값 얻기
			int number = printAno.number();
			String value = printAno.value();
			
			System.out.println(number);
			System.out.println(value);
		}
	}

}
