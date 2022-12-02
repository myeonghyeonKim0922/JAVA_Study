package test.ch11.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {

	public static void main(String[] args) {
		Class clazz =Car2.class; //Car객체
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
//			System.out.println(constructor.getName());
			System.out.print(constructor.getName()+ "(");
			//파라메터의 타입을 불러온다.
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName() + " " +field.getName());
		}
		
		System.out.println("[메소드 정보]");
		Method[] methods =clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName()+ "(");
			//파라메터의 타입을 불러온다.
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
		private static void printParameters(Class[] parameters) {
			for(int i=0; i<parameters.length; i++) {
				System.out.print(parameters[i].getName());
				if (i<(parameters.length-1)) {
					System.out.print(",");
			}
		}
	}

}
