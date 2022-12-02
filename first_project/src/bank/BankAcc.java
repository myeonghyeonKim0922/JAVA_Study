package bank;

public class BankAcc {
private String accnum;
private String accname;
private int money;

public BankAcc(String accnum, String accname, int money) {
	this.accnum = accnum;
	this.accname = accname;
	this.money = money;
}

public String getAccnum() {
	return accnum;
}
public void setAccnum(String accnum) {
	this.accnum = accnum;
}
public String getAccname() {
	return accname;
}
public void setAccname(String accname) {
	this.accname = accname;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}

}
