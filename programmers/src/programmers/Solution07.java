package programmers;

public class Solution07 {
	class Solution {
	    public int solution(int n, int k) {
	    	        int lamb = 12000;
		        int drink = 2000;
		        int sale = 0;
		        int result = 0;
		        
		        for(int i = 1; i <= n; i++){
		            if(i % 10 == 0){
		                sale += -2000;
		            }
		        }
		        result = (lamb * n) + (drink * k) + sale;
				return result; 
	    }
	}
}
