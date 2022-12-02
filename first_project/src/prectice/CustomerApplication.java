package prectice;

import java.util.ArrayList;

public class CustomerApplication {
	
	static ArrayList<Customer> customerList = new ArrayList<Customer>();
	public static void main(String[] args) {
		Customer customerKim = new Customer(10010,"김첨지");
		Customer customerLee = new Customer(10020,"이종석");
		Customer customerKim2 = new GoldCustomer(10030,"김김김");
		Customer customerChoi = new VIPCustomerOther(10040,"최상길",12345);
		
		customerList.add(customerKim);
		customerList.add(customerLee);
		customerList.add(customerKim2);
		customerList.add(customerChoi);
		
		showAllCustomer();
		
		Customer customer = findCustomer(10040);
		if(customer == null) {
			System.out.println("등록된 회원이 아닙니다.");
		}else {
			showPriceBonus(customer ,10000);
		}
	}
	
	
	public static Customer findCustomer(int customerID) {
		for(Customer customer : customerList) {
			if(customerID == customer.customerID) {
				return customer;
			}
		}
		return null;
		
	}
	
	public static void showAllCustomer() {
		System.out.println("==========모든 고객 정보 출력==========");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerinfo());
		}
	}
	
	public static void showPriceBonus(Customer customer ,int price) {
		System.out.println("==========해당 고객의 할인율과 보너스 포인트 계산==========");
		System.out.println(customer.customerName + "님의 지불금액:" + customer.calcPrice(price) + "원");
		System.out.println(customer.customerName + "님의 현재 보너스 포인트:" + customer.bonusPoint);
}
}