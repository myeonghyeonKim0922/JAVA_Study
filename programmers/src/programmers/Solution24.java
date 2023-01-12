package programmers;

public class Solution24 {
	class Solution {
	    public String solution(String my_string, int n) {
	    	String answer = "";
	    	char [] mystring = my_string.toCharArray();
			for(int i = 0; i<mystring.length; i++) {
				for(int j = 0; j<n; j++) {
					answer += Character.toString(mystring[i]);
				}
			}
			return answer;
	    }
	}
}
