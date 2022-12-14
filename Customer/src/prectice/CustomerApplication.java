package prectice;

import java.util.ArrayList;

public class CustomerApplication {
	static ArrayList<Customer> customerList = new ArrayList<Customer>();
	public static void main(String[] args) {
		Customer silverCustomer = new Customer(10010,"김");
		Customer silverCustomer2 = new Customer(10020,"이");
		Customer GoldCustomer = new GoldCustomer(10030,"박");
		Customer VIPCustomer = new VIPCustomer(10040,"최",12345);
		
		customerList.add(silverCustomer);
		customerList.add(silverCustomer2);
		customerList.add(GoldCustomer);
		customerList.add(VIPCustomer);
		
		showAllCustomer();
		
		Customer customer = findCustomer(10040);
		if(customer == null) {
			System.out.println("없는 회원 정보입니다");
		}else {
			showPriceBonus(customer, 10000);
		}
		
	}
	
	public static void showAllCustomer() {
		System.out.println("======모든 고객 정보 출력======");
		for(Customer customer: customerList) {
			System.out.println(customer.showCustomerInfo());
		}
	}
	public static Customer findCustomer(int customerID) {
		for(Customer customer: customerList) {
			if(customer.customerID == customerID) {
				return customer;
			}
		}
		return null;
	}
	
	public static void showPriceBonus(Customer customer, int price) {
		System.out.println("====지불할 금액과 회원님의 포인트====");
		System.out.println(customer.customerName + "님의 지불 금액:" + customer.calcPrice(price) + "원 입니다.");
		System.out.println(customer.customerName + "님의 잔여 포인트:" +customer.bonusPoint + "점 입니다.");
	}

}
