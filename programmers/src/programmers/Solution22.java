package programmers;

import java.util.*;
public class Solution22 {

	class Solution {
		    public int[] solution(int[] numbers, int num1, int num2) {
		    	num2 = num2 +1;
		        int[] answer = Arrays.copyOfRange(numbers, num1, num2);
		        return answer;
		    }
		}
}
