package programmers;

import java.util.ArrayList;
import java.util.Collections;
public class Solution23 {

	class Solution {
	    public int solution(int[] numbers) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        int answer = 0;
	        for(int i = 0; i<numbers.length; i++) {
	        	for(int j = 0; j<numbers.length; j++) {
	        		if(i != j) {
	        			answer = numbers[i] * numbers[j];
	        			list.add(answer);
	        			}
	        		}
	        	}
	        answer = Collections.max(list);
	        return answer;
	    }
	}
}
