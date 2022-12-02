package quiz.test;

public abstract class Quiz01 {
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

	public static void main(String[] args) {
		int num = 10;
		if(num < 0) {
			System.out.println("음수");
		}else if(num > 0) {
			System.out.println("양수");			
		}else {
			System.out.println("0");						
		}
	}

}
