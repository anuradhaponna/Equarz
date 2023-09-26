package com.Equarz.Testcases;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Searchtocart_functionality;

public class SearchtocartTest {
Searchtocart_functionality pf1;
	
	public SearchtocartTest()
	{
			
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf1=new Searchtocart_functionality (driver);
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf1.validateProduct1();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/hp-laptop-15-amd-ryzen-3-7320u-156-inch396cm-fhd-micro-edge-laptop8gb-ram512gb-ssdamd-radeon-graphicsdual-speakersalexan", url);
	}
	
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}


}
