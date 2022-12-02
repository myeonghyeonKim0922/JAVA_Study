package test.ch08.interface_extends;

public class InterfaceCImpl implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("methodA 호출");
	}

	@Override
	public void methodB() {
		System.out.println("methodB 호출");
	}

	@Override
	public void methodC() {
		System.out.println("methodC 호출");
	}

}
