package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C2 {
//	A a = new A();
	B b = new B();
	
	
	A a = new A(true);
	A a1 = new A(1);
	A a2 = new A("a"); //private로 인해 오류가 뜬다. private: 같은 클래스 안에서만 사용 가능
}
