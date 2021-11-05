package com.elocalshops.PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
	public void click_on_fictionNovels_form_books()
	{
		Actions a=new Actions(driver);
		a.moveToElement(Books()).pause(1000).moveToElement(Fictionbooks()).click().build().perform();
		
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
	
	public WebElement Books()
	{
		return driver.findElement(HomePageUI.books);
	}
	
	public WebElement Fictionbooks()
	{
		return driver.findElement(HomePageUI.fictbooks);
	}

}
