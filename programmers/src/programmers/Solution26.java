package programmers;

import java.util.*;
public class Solution26 {

	class Solution {
	    public int solution(int[] array) {
	        int answer = 0;
	        Arrays.sort(array);
	        int h = array.length / 2;
	            answer = array[h];
	        return answer;
	    }
	}
}
