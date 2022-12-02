package java_modeling.ch01.gip;

//집약관계
public class Computer2 {
	private MainBoard mb;
	private CPU C;
	private Memory m;
	private PowerSupply ps;
	
	public Computer2(MainBoard mb,CPU C,Memory m,PowerSupply ps) {
		this.mb = mb;
		this.C = C;
		this.m = m;
		this.ps = ps;
	}
}
