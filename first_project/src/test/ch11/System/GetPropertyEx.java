package test.ch11.System;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName +"\n" + userHome+"\n" + userName);
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objkey : keys) {
			String key = (String) objkey;
			System.out.println(key);
		}
	}

}
