package quiz.javaBase;

import java.util.StringTokenizer;

public class NewString {

	public static void main(String[] args) {
		String info = "이름,아이디,패스워드";
		StringTokenizer st = new StringTokenizer(info, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
