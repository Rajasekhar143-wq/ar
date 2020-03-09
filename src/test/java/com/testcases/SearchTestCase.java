package com.testcases;

import javax.naming.directory.SearchResult;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.wrapperex;
import com.pages.search;



public class SearchTestCase extends wrapperex {
	@BeforeClass  //use before method//
	public void startUp() 
	{
	 launchApplication("Chrome","http://redbus.in");	
	}
	@Test
	public void search2()
	{
		search sc= new search(driver);
		sc.Search_searchbar("chennai");
		sc.Search_searchba("hyderabad");
		sc.Search_searchb();
		sc.Search_searchbe();
		sc.Search_searchbtn();
		
	}

}
