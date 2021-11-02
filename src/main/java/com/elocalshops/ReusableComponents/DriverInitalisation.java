package com.elocalshops.ReusableComponents;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitalisation {
	public static WebDriver driver;
	public static Logger log=Logger.getLogger(DriverInitalisation.class.getName());

	public static WebDriver intializedriver(WebDriver driver,String browser) 
	{   
		
		log.info("Driver Setup");
		
		if(browser.equals("chrome"))
		{   
			log.info("Google browser");
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumNew\\Framework\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			log.info("Initialization of Driver");
			
		
		}
		else if(browser.equals("firefox"))
		{   
			log.info("Firefox browser");
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumNew\\HARSHA\\eclipse-workspace\\End2End\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			log.info("Initialization of Driver");
			
		}
		else if(browser.equals("edge"))
		{
			log.info("Edge browser");
			System.setProperty("webdriver.edge.driver","D:\\SeleniumNew\\HARSHA\\eclipse-workspace\\End2End\\driver\\msedgedriver.exe");
			driver=new EdgeDriver();
			log.info("Initialization of Driver");
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	} 

}
