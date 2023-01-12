package programmers;

public class Solution19 {
	class Solution {
	    public String solution(String my_string) {
	     StringBuffer sb = new StringBuffer(my_string);
	        String reversedStr = sb.reverse().toString();

	        System.out.println(reversedStr);
	        return reversedStr;
	    }
	}
}
