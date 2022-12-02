package quiz;

public class IsNumber {
	public static boolean isNumber(String str) {
	    if (str == null || str.equals(str)) return false;

	    try {
	        Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException nfe) {
//	        nfe.printStackTrace();
	        return false;
	    }
	}
	
public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}


}

