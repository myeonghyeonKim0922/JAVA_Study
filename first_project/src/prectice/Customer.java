package prectice;

public class Customer {
	//필드
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	//생성자
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	//메소드
	private void initCustomer() {
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	
	//get,set
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

	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	public String showCustomerinfo() {
		return customerName + "님의 등급: " + customerGrade +","+ " 보너스 포인트:" +bonusPoint +"점";
	}
}
