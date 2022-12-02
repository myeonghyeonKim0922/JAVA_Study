package test.ch04;

public class test {
	 public double solution(int[] numbers) {
		 int resultnum = 0;
	        for(int i = 0; i <= numbers.length; i++) {
	        	resultnum += numbers[i]; 
	        }
	       int result = resultnum / numbers.length;
	       return result;
	    }

	public static void main(String[] args) {
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
