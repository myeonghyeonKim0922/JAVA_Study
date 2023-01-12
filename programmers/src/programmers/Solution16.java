package programmers;

public class Solution16 {
	class Solution {
	    public int solution(int n) {
	        int result = 0;
             if(n > 0){
	                result += 1;
	            }
	        for(int i=1; i < n; i++)
	           if(i % 7 == 0){
                   result += 1;
               }
			return result;
	        }
	    }
}
