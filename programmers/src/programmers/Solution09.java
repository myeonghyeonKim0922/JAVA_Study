package programmers;

public class Solution09 {
	class Solution {
	    public int[] solution(int[] num_list) {
	        int[] answer = {};
	        for(int i : num_list) {
	        	if(num_list[i] % 2 == 0) {
	        		answer[i] = num_list[i];
	        	}
	        }
	        return answer;
	    }
	}
}
