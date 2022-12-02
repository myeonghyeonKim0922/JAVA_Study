
public class VIPCustomer extends Customer{
	//필드 
	private int agentID; //상담원 아이디
	double saleRatio; //할인비율
	
	//생성자 
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}

	//메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio); //보너스 비율을 계산해서 bonusPoint를 적립해준다.
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() +",담당 상담원 아이디:" + agentID;
	}

	public int getAgentID() {
		return agentID;
	}
	
	
}
