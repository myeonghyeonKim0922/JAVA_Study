package test.ch12.MethodGeneric;

public class GenericEx {
	//제네릭 메소드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	public static void main(String[] args) {
		//제네릭 메소드 호출: T를 Integer로 대체
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("홍길동");
		String name = box2.get();
		System.out.println(name);
		
		
		
		
	}

}
