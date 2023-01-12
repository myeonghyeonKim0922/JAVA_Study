package programmers;

public class Solution10 {
	class Solution {
	    public int solution(int[] array, int height) {
	      	   int higher = 0; 
		           for(int i=0; i<array.length; i++){
		               if(array[i] > height) {
		            	   
		                   higher++;
		           }
		           
		       }
				return higher;
		    }
		}
}
