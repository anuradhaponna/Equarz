package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Hometocart_functionality;
import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class HometocartTest extends Testbase{
	Hometocart_functionality pf1;
	Login_Functionality lp1;
	public HometocartTest()
	{
			
		super();
	}
	@BeforeMethod
	public void initialize()
	{
		
		Setup();
		pf1=new Hometocart_functionality (driver);
		lp1=new Login_Functionality(driver);
		//lp1.validateLogin();
		
	}
	@Test
	public void verifyurl() throws InterruptedException
	{
		pf1.validateProduct3();
		lp1.validateLogin();
		//String url=driver.getCurrentUrl();
		
		
		
		//Assert.assertEquals("http://e-quarz.com/product/avro-furniture-set-of-2-plastic-chairs-matt-and-gloss-pattern-plastic-chairs-for-home-living-room-bearing-capacity-up-to", url);
	}
	
	
	@AfterMethod 
	public void teardown()
	{
		//driver.close();
	}

}



