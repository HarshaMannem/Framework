package com.elocalshops.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.elocalshops.UIstore.HomePageUI;

public class HomePage {
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}
	//Method to click on the login icon visible on the HomePageUI
	public void login_button() 
	{
		loginIcon().click();
	}
	//Method to search the product in the search bar by entering the product name
	public void searchProducts(String pname)
	{
		search_Box().sendKeys(pname);
		search_button().click();
	}
	
	//Returning the all the elements  in the HomepageUI
	
	public WebElement loginIcon()
	{
		return driver.findElement(HomePageUI.login);
	}
	public WebElement search_Box()
	{
		return driver.findElement(HomePageUI.searchBox);
	}
	
	public WebElement search_button()
	{
		return driver.findElement(HomePageUI.searchButton);
	}

}
