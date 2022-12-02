package java_modeling.ch01.gip;

//합성
public class Computer {
	private MainBoard mb;
	private CPU C;
	private Memory m;
	private PowerSupply ps;
	
	public Computer() {
		this.mb = new MainBoard();
		this.C = new CPU();
		this.m = new Memory();
		this.ps = new PowerSupply();
	}
}
