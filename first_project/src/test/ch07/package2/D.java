package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A{
	public D( ) {
		super();
	}

	public void method1() {
		this.field = "1";
		this.method();
	}
	public void method2() {
			A a = new A();
			a.field = "1";
			a.method();
	}
}
