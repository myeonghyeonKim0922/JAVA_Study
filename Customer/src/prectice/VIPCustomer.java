package prectice;

public class VIPCustomer extends Customer{
public double saleRatio;
public int agentID;

	VIPCustomer(int customerID, String customerName,int agentID){
		this.customerID = customerID;
		this.customerName = customerName;
		this.agentID = agentID;
		this.saleRatio = 0.2;
		super.bonusRatio = 0.05;
		super.customerGrade = "VIP";
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio); //보너스 비율을 계산해서 bonusPoint를 적립해준다.
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		return customerName + "님의 등급: " + customerGrade +","+ "보너스 포인트:" + bonusPoint+"점"+" 상담원 ID:"+agentID;
	}
	
}
	




