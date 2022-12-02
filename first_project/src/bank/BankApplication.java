package bank;

import java.util.Scanner;

public class BankApplication {
	 private static Scanner scanner = new Scanner(System.in);
	 //계좌객체를 담을 배열
	private static BankAcc[] accountArray = new BankAcc[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean run = true;
		while (run) {
		System.out.println("-------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.println("선택>");
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) createAccount();
		else if (selectNo == 2) accountList();
		else if (selectNo == 3) deposit();
		else if (selectNo == 4) withdraw();
		else if (selectNo == 5) run = false;
	   }
		System.out.println("프로그램 종료");
	}
		//1.계좌생성
		public static void createAccount() {
			name("계정생성");
			
			System.out.println("계좌번호:");
			String num = scanner.next();
			
			System.out.println("계좌주:");
			String name = scanner.next();
			
			System.out.println("초기 입금액:");
			int money = scanner.nextInt();
			
			BankAcc newBankAcc = new BankAcc(num,name,money);
			
			for(int i=0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = newBankAcc;
					System.out.println("결과:계좌가 생성되었습니다");
					break; //계좌 넣고 for 반복문을 끝낸다.
				}
			}
		}
		//2.계좌목록
		public static void accountList() {
			for(int i=0; i<accountArray.length; i++) {
				BankAcc account = accountArray[i];
				if(account != null) {
					System.out.println("----------------");
					System.out.println("계좌번호: " + account.getAccnum());
					System.out.println("계좌주: " +account.getAccname());
					System.out.println("남은 금액: " + account.getMoney());
				}
			}
		}
		//3.예금
		public static void deposit() {
			name("예금액");
			System.out.println("계좌번호:");
			String serchnum = scanner.next();
			System.out.println("예금액:");
			int smoney = scanner.nextInt();
			BankAcc acc = findAccount(serchnum);
			if (acc == null) {
				System.out.println("결과: 계좌가 없습니다.");
				return;
			}
			acc.setMoney(acc.getMoney() + smoney);
			System.out.println("예금이 성공했습니다.");
			
			
			
			
		}
		//4.출금
		public static void withdraw() {
			name("출금액");
			System.out.println("계좌번호:");
			String serchnum = scanner.next();
			System.out.println("출금액:");
			int smoney = scanner.nextInt();
			
			BankAcc acc = findAccount(serchnum);
			if (acc == null) {
				System.out.println("결과: 계좌가 없습니다.");
				return;
			}
			acc.setMoney(acc.getMoney() - smoney);
			System.out.println("출금이 성공했습니다.");
		}
		

		//5. accountArray 배열에서 num과 동일한 Account객체 찾는 역할을 한다.
		private static BankAcc findAccount(String serchnum) {
			for(int i=0; i<accountArray.length; i++) {
				BankAcc account = accountArray[i];
				if(account.getAccnum().equals(serchnum)) {
					return account;
				} else {
					break;
				}
			
		}
			return null;
		}

	
		
		public static void name(String name) {
			System.out.println("------");
			System.out.println(name);
			System.out.println("------");
		}
		
}


