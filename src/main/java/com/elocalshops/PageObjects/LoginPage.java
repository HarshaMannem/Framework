package com.elocalshops.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.elocalshops.UIstore.LoginPageUI;

public class LoginPage {
		public WebDriver driver;
		//Mapping the driver to the current driver which is in use
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
		//Logging in to the Website
		public void Login(String name,String password)
		{
			username().sendKeys(name);
			password().sendKeys(password);
			login().click();
		}
		//To click on the Forget password
		public void forget_password()
		{
			forget().click();
		}
		//To create the new account
		public void new_account_creation()
		{
			create().click();
		}
		//Returning the WebElements elements  
		public WebElement username()
		{
			return driver.findElement(LoginPageUI.name);
		}
		
		public WebElement password()
		{
			return driver.findElement(LoginPageUI.pass);
		}
		public WebElement login()
		{
			return driver.findElement(LoginPageUI.sign_in);
		}
		public WebElement forget()
		{
			return driver.findElement(LoginPageUI.forget_password);
		}
		public WebElement create()
		{
			return driver.findElement(LoginPageUI.create_account);
		}
	}