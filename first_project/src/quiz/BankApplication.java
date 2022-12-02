package quiz;

import java.util.Scanner;

public class BankApplication {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.계좌에서 쓰이는 것들 추가 
		//2.빈 배열 만들고 그안에 계좌가 생성될때마다 추가 최대 100개 
		//3.계좌번호로 계좌를 불러와서 금액 수정이 가능해야함.
		//4.계좌 목록으로 배열안에 있는 계좌들 출력
		BankAcc bankacc = new BankAcc(null, null, 0);
		
		System.out.println("-------------------------------------------"); 
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.print("선택>");
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			String userscan = scan.nextLine();
		switch (userscan) {
		case "1": System.out.println("--------"); 
		  		  System.out.println("계좌생성");
				  System.out.println("--------");  	
				  System.out.print("계좌번호:");  	
				  String scannum = scan.nextLine();
				  bankacc.setAccnum(scannum);
				  System.out.print("계좌주:");
				  String scanname = scan.nextLine();
				  bankacc.setAccname(scanname);
				  System.out.print("초기입금액:");
				  String scanmoney = scan.nextLine(); 
				  int money = Integer.parseInt(scanmoney);
				  bankacc.setMoney(money);
				  System.out.println("계좌가 생성되었습니다.");
                 break;
        case "2": System.out.println("--------"); 
		  		  System.out.println("계좌목록");
		  		  System.out.println("--------");
		  		  //배열에 있는 계좌 순서대로 출력
                 break;
        case "3": System.out.println("--------"); 
		  		  System.out.println("예금");
		  		  System.out.println("--------");
		  		  System.out.println("계좌번호:");  	
				  
				  System.out.print("예금액:");
				 
				  
                 break;
        case "4": System.out.println("--------"); 
		  		  System.out.println("출금");
		  		  System.out.println("--------");
		  		  System.out.println("계좌번호:");  	
				  
				  System.out.print("출금액:");
				  money = scan.nextLine(); 
//				  money.setBalance(money);
                 break;
        case "5":  System.out.println("종료합니다");
                 	break;
		
	}
		}
}
}
