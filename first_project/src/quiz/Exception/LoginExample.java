package quiz.Exception;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void login(String id, String password) throws WrongPasswordException{
		if(!id.equals("blue")) {
			System.out.println("아이디가 존재하지 않습니다");
		}
		if(!password.equals("12345")) {
			System.out.println("패드워드가 틀립니다.");			
		}
	}
}
