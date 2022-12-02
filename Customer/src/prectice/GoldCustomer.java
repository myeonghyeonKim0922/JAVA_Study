package prectice;

public class GoldCustomer extends Customer{
	public double saleRatio;
	
	GoldCustomer(int customerID, String customerName){
		this.customerID = customerID;
		this.customerName = customerName;
		this.saleRatio = 0.1;
		super.bonusRatio = 0.03;
		super.customerGrade = "Gold";
	}
	
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += (price * bonusRatio);
		return price -= (int) (price * saleRatio);
	}
}
