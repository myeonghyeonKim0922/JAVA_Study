package prectice;

public class GoldCustomer extends Customer{
	double saleRatio;

	public GoldCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		super.customerGrade = "Gold";
		super.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price -= (int)(price * saleRatio);
	}

	
}
