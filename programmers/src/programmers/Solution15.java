package programmers;

public class Solution15 {
	class Solution {
	    public int solution(int slice, int n) {
	        int pizza = slice;
	        int result = 1;
	            if(n % slice == 0){
	                result = n / slice;
	            }else{
	                result = 1 + (n / slice);
	            }
				return result;
	        }
	    }

}
