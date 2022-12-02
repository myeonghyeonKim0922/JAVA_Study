package prectice;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public int bonusPoint;
	public double bonusRatio;
	
	public Customer() {}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += (price * bonusRatio);
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급: " + customerGrade +","+ "보너스 포인트:" + bonusPoint+"점";
		
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
