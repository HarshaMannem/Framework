package com.elocalshops.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.elocalshops.UIstore.FictionBooksUI;


public class FictionNovelsPage {
	public WebDriver driver;

	public FictionNovelsPage(WebDriver driver)
	{
		this.driver=driver;  //Mapping the driver to the current driver which is in use
	}
	public void Add_book_harry()
	{
		Harrybook().click();
	}
	public void Add_book_dharma()
	{
		book2().click();
	}
	public void adding_to_cart()
	{
		Addtocart().click();
	}
	
	//Returning the all the elements  in the HomepageUI
	
		public WebElement Harrybook()
		{
			return driver.findElement(FictionBooksUI.bookid);
		}
		public WebElement book2()
		{
			return driver.findElement(FictionBooksUI.bookid1);
		}
		
		public WebElement book3()
		{
			return driver.findElement(FictionBooksUI.bookid2);
		}
		
		public WebElement Addtocart()
		{
			return driver.findElement(FictionBooksUI.AddtoCart);
		}


}
