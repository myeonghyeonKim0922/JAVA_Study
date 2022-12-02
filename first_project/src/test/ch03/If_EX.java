package test.ch03;

public class If_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		int num =(int) (Math.random()*6) +1;
		
		if(num == 1) {
		 System.out.println("1번");
	}else if (num == 2) {
		System.out.println("2번");
	}else if (num == 3){
		System.out.println("3번");
	}else if (num == 4){
		System.out.println("4번");
	}else if (num == 5){
		System.out.println("5번");
	}else if (num == 6){
		System.out.println("6번");
	}
		
		//switch: byte, char, long, int, String, short 사용 가능
		char grade = 'A';
	switch(grade) {
	case 'A':
		System.out.println("1번");
	break;
	case 'B':
		System.out.println("2번");
	break;
	case 'C':
		System.out.println("3번");
	break;
	case 'D':
		System.out.println("4번");
	break;
	case 5:
		System.out.println("5번");
	break;
	default:
		System.out.println("6번");
	
	}
		
		
	}
}
