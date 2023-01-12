package programmers;

import java.util.*;
public class Solution21 {

	class Solution {
	    public int solution(int[] sides) {
	        int answer = 0;
	        Arrays.sort(sides);
	        if(sides[sides.length-1] < sides[sides.length-2] + sides[sides.length-3] ){
	            answer = 1;
	        } else {
	            answer = 2;
	        }
	        return answer;
	    }
	}
}
