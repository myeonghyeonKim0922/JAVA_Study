package quiz;

public class MemberService {
	String id;
	String Password;
	
	

	
	boolean login(String id, String Password){
		if(id == "hong" && Password == "12345") {
			System.out.println("로그인 되었습니다");
			return true;
		}else {
			 System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		return false;
	}
	void logout(String id) {
		if(id == "hong") {
			System.out.println( id + "님이 로그아웃 되었습니다");	
		}
	}
	
}
