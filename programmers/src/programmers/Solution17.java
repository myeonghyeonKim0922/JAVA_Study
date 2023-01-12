package programmers;

public class Solution17 {
	class Solution {
	    public int[] solution(int money) {
	        int ice = 5500;
	        int icer = money / ice;
	        int moneyr = money % ice;
	        int[] answer = {icer,moneyr};
	        return answer;
	    }
	}
}
