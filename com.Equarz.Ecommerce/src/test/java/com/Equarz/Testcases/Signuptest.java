package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Signupfunctionality;
import com.Utils.Signup;
import com.base.Testbase;

public class Signuptest extends Testbase{
	
		
		Signupfunctionality sf;
		
		public  void SignupTest()
		{
			Super();
		
		}
		private void Super() {
			// TODO Auto-generated method stub
			
		}
		@BeforeMethod
		public void initialize()
		{
			Setup();
			sf=new Signupfunctionality(driver);
			
			
		}
		@Test
		(dataProvider = "setdata",dataProviderClass = Signup.class)
		public void verifyurl(String firstname,String lastname,String Email,String phone,String password,String cpassword) throws InterruptedException
		{
			sf.validateSignup(firstname,lastname,Email,phone,password,cpassword);
			String url=driver.getCurrentUrl();
			Assert.assertEquals("http://e-quarz.com/customer/auth/sign-up", url);
		}
		@AfterMethod
		public void teardown()
		{
			//driver.close();
		}
	}



