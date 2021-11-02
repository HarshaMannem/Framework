package com.elocalshops.UIstore;

import org.openqa.selenium.By;

public class LoginPageUI {
	
	//Locator to locate the UserName box in the LoginPageUi
	public static By name=By.cssSelector("input[name='customer[email]']");
	
	//Locator to locate the password box in the LoginPageUi
	public static By pass=By.cssSelector("input[type='password']");
	
	//Locator to locate the Sign_in button in the LoginPageUi
	public static By sign_in=By.cssSelector("button.button-primary.form-action--submit.mdc-ripple-surface.mdc-ripple-upgraded");
	
	//Locator to locate the create_account button in LoginPageUi
	public static By create_account=By.xpath("//*[@id='customer_register_link']");
	
	//Locator to locate the forget password element in the LoginPageUi
	public static By forget_password=By.xpath("//*[@id='customer_login']/div[4]/div/span[2]/a");
	
	

}
