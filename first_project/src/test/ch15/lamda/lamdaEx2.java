package test.ch15.lamda;

public class lamdaEx2 {

	public static void main(String[] args) {
		Person person = new Person();
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
		
		//return문이 하나만 있을때는 중괄호와 return 생략 가능
		person.action((x, y) -> x - y);
		person.action((x, y) -> x * y);

	}

}
