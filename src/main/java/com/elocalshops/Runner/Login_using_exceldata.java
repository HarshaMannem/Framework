package com.elocalshops.Runner;

import org.testng.annotations.Test;

import com.elocalshops.ReusableComponents.Base;
import com.elocalshops.Utilities.ExcelDriver;
import com.relevantcodes.extentreports.LogStatus;

public class Login_using_exceldata extends Base {
	@Test
	public void login_using_exceldata()
	{

		homepage.login_button();
		log.info("Login page opened");
		String name=ExcelDriver.UserName();
		String password=ExcelDriver.password();
		loginpage.Login(name, password);
	    log.info("Clicked on login");
	    test.log(LogStatus.PASS, "Login is done from excelsheet user data");
	}

}
