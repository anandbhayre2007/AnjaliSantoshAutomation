package testing;

import configuration.Configuration;

public class TestCommonPath {

	public static void main(String[] args) {

		
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println(Configuration.chromeDriverPath);
		
	}

}
