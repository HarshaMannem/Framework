package com.elocalshops.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {
	public  static Properties prop;
	public static String getBrowsername() throws IOException
	{   
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\SeleniumNew\\Framework\\src\\main\\resources\\config.properties");
		prop.load(fis);
		String name=prop.getProperty("browser");
		System.out.println(name);
		return name;
	}
	public static String getUrl()
	{   
	
		String urlname=prop.getProperty("url");
		return urlname;
	}

}
