package test.ch08.interface_extends;

public class ExtendsEx {

	public static void main(String[] args) {
		InterfaceCImpl  impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		//interfaceC는 interfaceA, interfaceB를 상속 받았으므로 아래와 같이 호출 가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
