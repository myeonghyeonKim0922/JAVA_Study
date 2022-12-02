package test.ch07;

public class PromotionEx {
	
	class A {}

	class B extends A{}

	class C extends A{}

	class D extends B{}

	class E extends C{}

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//자동타입
		
		A a1 = new b;
		A a2 = new c;
		A a3 = new d;
		A a4 = new e;
		
		B b3 = e;
		C c2 = d;
		
		
	}

}
