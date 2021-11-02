package com.elocalshops.ReusableComponents;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.elocalshops.PageObjects.HomePage;
import com.elocalshops.PageObjects.LoginPage;
import com.elocalshops.Utilities.ExtentFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class Base {
		public static WebDriver driver;
		public static Logger log=Logger.getLogger(Base.class.getName());
		public  static Properties prop;
		public  static ExtentTest test;
		public static  ExtentReports report;
		public String testname;
		public static HomePage homepage;
		public static LoginPage loginpage;
		
		
		
		@BeforeSuite
		public  void beforeClass()
		{   
			report=ExtentFactory.getInstance();
			test=report.startTest("TestReport");
		}

	    @BeforeClass
	    public void DriverSetup() throws IOException
	    {   
	    	prop=new Properties();
			FileInputStream fis=new FileInputStream("D:\\SeleniumNew\\Framework\\src\\main\\resources\\config.properties");
			prop.load(fis);
			String browsername=prop.getProperty("browser");
	    	driver=DriverInitalisation.intializedriver(driver,browsername);
	    	homepage=new HomePage(driver);
	    	loginpage=new LoginPage(driver);
	    }
		
	    @BeforeMethod
	    public void beforeMethod()
	    {
	    	log.info("Opening url");
			driver.get(prop.getProperty("url"));
			log.info("Url opened");
	    }
	    @AfterClass
		 public void afterClass()
		 {  
	    	
	    	driver.quit();
	    	log.info("Driver Closed");
	    }
		 
		
		 @AfterSuite
			public void afterSuite()
			{
				report.endTest(test);
				report.flush();
				
			}
		
		    
		    
	 

}
