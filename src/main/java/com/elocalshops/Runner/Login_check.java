package com.elocalshops.Runner;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.elocalshops.ReusableComponents.Base;
import com.relevantcodes.extentreports.LogStatus;


public class Login_check extends Base {
	
  

	@Test(dataProvider="getData")
	
	public void Login_to_Site(String name,String password) throws IOException 
	{   
	
		homepage.login_button();
		log.info("Login page opened");
		loginpage.Login(name, password);
	    log.info("Clicked on login");
	    test.log(LogStatus.PASS, "Login is done");
	    
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		
		data[0][0]="Harsha";
		data[0][1]="pass";
		
		
		return data;
	}
   

}
