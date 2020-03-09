package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class search {
	WebDriver driver;
	By searchchbar=By.id("src");
	By searchba=By.id("dest");
	By searchb=By.xpath("//*[@id=\"search\"]/div/div[3]/div/label");
	By searchbe=By.xpath("//*[@id=\"search\"]/div/div[4]/div/label");
	By searchbtn=By.xpath("//*[@id=\"search_btn\"]");
	
	  public  search(WebDriver driver)
	   {
		   this.driver=driver;
	   }
	
	public void  Search_searchbar(String a) {
		driver.findElement(searchchbar).sendKeys(a);
	}
	public void  Search_searchba(String b) {
		driver.findElement(searchba).sendKeys(b);
	}
	public void  Search_searchb() {
		driver.findElement(searchb).click();
	}
	
	public void  Search_searchbe() {
		driver.findElement(searchbe).click();
	}
	
	public void Search_searchbtn()  {
		driver.findElement(searchbtn).click();
		
	}

}



