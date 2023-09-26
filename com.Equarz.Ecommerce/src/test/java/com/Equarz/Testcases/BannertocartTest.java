package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.BannertoCart_functionality;
import com.base.Testbase;

public class BannertocartTest extends Testbase {
	

		BannertoCart_functionality pf1;
		
			
			 BannertocartTest()
			{
					
				super();
			}
			@BeforeMethod
			public void initialize()
			{
				
				Setup();
				pf1=new BannertoCart_functionality (driver);
				
			}
			@Test
			public void verifyurl() throws InterruptedException
			{
				pf1.validateProduct14();
				String url=driver.getCurrentUrl();
				Assert.assertEquals("http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX", url);
			}
			
			
			@AfterMethod
			public void teardown()
			{
				//driver.close();
			}
		}




