package programmers;

public class Solution04 {
	class Solution {
	    public int solution(int num1, int num2) {
	        double result = (num1 / (double)num2) * 1000;
	        Math.floor(result);
	        return (int) result;
	    }
	}
}
