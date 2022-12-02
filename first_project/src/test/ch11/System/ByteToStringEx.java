package test.ch11.System;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";
		data = data + "ans";
	
		byte[] arr1 = data.getBytes("UTF-8");//UTF-8로 인코딩
		System.out.println(Arrays.toString(arr1)); //배열을 문자열로 바꾼다
		
		String str1 = new String(arr1,"UTF-8");
		System.out.println(str1);
		
	}

}
