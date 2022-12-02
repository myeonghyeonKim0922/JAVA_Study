package homework;

import java.util.Scanner;

public class CarApp {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Cars Spark = new Cars();
		Ray Ray = new Ray();
		Avante Avante = new Avante();
		Casper Casper = new Casper();

		
		boolean run = true;
		while (run) {
		System.out.println("======차 스펙 출력 프로그램=======");
		System.out.println("1.레이 | 2.스파크 | 3.아반떼 | 4.캐스퍼 | 5.종료");
		System.out.println("선택>");
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) Carinfo(Ray);
		else if (selectNo == 2) Carinfo(Spark);
		else if (selectNo == 3) Carinfo(Avante);
		else if (selectNo == 4) Carinfo(Casper);
		else if (selectNo == 5) run = false;
	   }
		System.out.println("프로그램 종료");
	}
	static void Carinfo(Cars Car) {
		
		Car.InitCarInfo();
		Car.showInfo();
		}
	}


