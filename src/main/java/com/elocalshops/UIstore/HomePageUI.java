package com.elocalshops.UIstore;


import org.openqa.selenium.By;



public class HomePageUI{
	

	//Locator to locate the Login button on HomepageUI
	public static By login=By.xpath("//*[@id=\'site-header-nav\']/nav/ul[2]/li/a");
	
	//Locator to locate the search bar in the HomepageUI
	public static By searchBox=By.xpath("//input[@name='q']");
	
	//Locator to locate the search button in the HomepageUI
	public static By searchButton=By.xpath("//button[@class='live-search-button mdc-ripple-surface mdc-ripple-upgraded']");
	
	//Locator to locate the Books dynamic dropdown
	public static By books=By.xpath("//*[@id='site-header-nav']/nav/ul[1]/li[4]/a");
	
	//Locator to locate fiction books in Books Dropdown
	public static By fictbooks=By.xpath("//*[@id='site-header-nav']/nav/ul[1]/li[4]/ul/li[4]/a");
}
