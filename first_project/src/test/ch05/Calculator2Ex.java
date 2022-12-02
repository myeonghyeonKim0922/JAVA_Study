package test.ch05;

public class Calculator2Ex {

	public static void main(String[] args) {
		Calculator2 calc2 = new Calculator2();
//		calc2.pi = 10;
		calc2.plus(1, 2);
		Calculator2.plus(1, 2);//객체(인스턴스)를 생성하지 않아도 클래스를 통해서 접근 가능
		Calculator2.minus(2, 1);
//		System.out.print(Calculator2.pi);
		System.out.print(Calculator2.info);
	}

}
