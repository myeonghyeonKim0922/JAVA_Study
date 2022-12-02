package prectice;

public class VIPCustomerOther extends Customer{
	double saleRatio;
	int agentID;

	public VIPCustomerOther(int customerID, String customerName,int agentID) {
		super(customerID,customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price -= (int)(price * saleRatio);
	}

	@Override
	public String showCustomerinfo() {
		return customerName + "님의 등급: " + customerGrade +","+ " 보너스 포인트:" +bonusPoint +"점," + "상담직원 ID:" + agentID;
	}
	}