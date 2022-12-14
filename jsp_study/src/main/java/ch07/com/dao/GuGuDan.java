package ch07.com.dao;

public class GuGuDan {
 private int n1;

public int getN1() {
	return n1;
}

public void setN1(int n1) {
	this.n1 = n1;
}
	
public int[] process() {
	int[] temp = new int[9];
	for(int i = 1; i<=9; i++){
		for(int j=0; j<=8; j++) {
			temp[j] = n1 * i;
		}
	}
	return temp;
}
}
