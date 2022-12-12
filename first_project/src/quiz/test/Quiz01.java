package quiz.test;

import java.util.stream.Stream;

public abstract class Quiz01 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
	        for(int i : digits) {
	        	answer = digits[i] + answer;
	        }
	        return answer;
	    }
	}

	public static void main(String[] args) {
		int n = 1234;
        int answer = 0;
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<digits.length; i++) {
        	answer = digits[i] + answer;
        }
        System.out.println(answer);
        
		
		
	
		}
}
