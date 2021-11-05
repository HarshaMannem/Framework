package com.elocalshops.ReusableComponents;

import java.io.IOException;
import java.util.Properties;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.elocalshops.PageObjects.FictionNovelsPage;
import com.elocalshops.PageObjects.HomePage;
import com.elocalshops.PageObjects.LoginPage;
import com.elocalshops.Utilities.ConfigProperty;
import com.elocalshops.Utilities.ExcelDriver;
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
		public static FictionNovelsPage books;
		
		
		
		@BeforeSuite
		public  void beforeClass()
		{   
			report=ExtentFactory.getInstance();
			test=report.startTest("TestReport");
		}

	    @BeforeClass
	    public void DriverSetup() throws IOException
	    {   
	 
	    	String browsername=ConfigProperty.getBrowsername();
	    	driver=DriverInitalisation.intializedriver(driver,browsername);
	    	homepage=new HomePage(driver);
	    	loginpage=new LoginPage(driver);
	    	books=new FictionNovelsPage(driver);
	    }
		
	    @BeforeMethod
	    public void beforeMethod() throws IOException
	    {
	    	log.info("Opening url");
	    	String url=ConfigProperty.getUrl();
			driver.get(url);
			log.info("Url opened");
			ExcelDriver.WorkBookSetup();
			log.info("Excel WorkBook Setup is done");
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
