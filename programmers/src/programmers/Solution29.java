package programmers;

import java.util.stream.Stream;
public class Solution29 {

	class Solution {
		    public int solution(int n) {
	        int answer = 0;
	        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
	        for(int i=0; i<digits.length; i++) {
	        	answer = digits[i] + answer;
	        }
	        System.out.println(answer);
		        return answer;
		    }
		}
}
