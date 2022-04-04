package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReusableFunction {
	
	public static String getValue(String str) throws IOException
	{
	FileInputStream fis = new FileInputStream("C:\\Users\\User\\workspace\\InsuranceCompleteFlowProd\\src\\main\\java\\com\\qa\\config\\config.properties");
		
	
	
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(str);
	}

	public static String getValue1(String str) throws IOException
	{
	
		Properties prop1 = new Properties();

		
		return prop1.getProperty(str);
	}
	



}
