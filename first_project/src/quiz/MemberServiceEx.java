package quiz;

public class MemberServiceEx {
	public static void main(String[] args) {
	MemberService memberService = new MemberService();

	memberService.login("hong","12345");
	memberService.logout("hong");
	boolean result = memberService.login("hong","12345");
	System.out.println(result);
}
}
