package programmers;

public class Solution05 {
	class Solution {
	    public double solution(int[] numbers) {
	      int sum = 0;

	        // for(반복 대상 변수명: 반복 대상)
	        // {수행문}
	        for (int loop : numbers) {
	            sum += loop;
	        }

	        // sum이 int이므로 double로 형변환을 해줘야 answer에 sum 값을 담을 수 있습니다.
	        double answer = (double) sum / numbers.length;
	        return answer;

	    }
	}
}
