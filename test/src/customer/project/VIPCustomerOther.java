package customer.project;


public class VIPCustomerOther extends Customer {
	private int agentID;
	public double saleRatio;
	
	
	public VIPCustomerOther(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price -= (int) (price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return customerName +"님의 등급: " + customerGrade + ", 보너스 포인트: "+bonusPoint +"점, 담당 상담원 번호: " +agentID; 
	}
}

