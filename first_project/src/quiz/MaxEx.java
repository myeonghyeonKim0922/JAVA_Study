package quiz;

class MaxEx {
	static int result = 0;
	 //max 메소드 작성
	static int max(int[] data){
		if(data == null || data.length == 0) {
			return -999999;
		}
		for(int i = 0; i < data.length; i++) {
			if(data[i] > result) {
				result = data[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열
		}
}
