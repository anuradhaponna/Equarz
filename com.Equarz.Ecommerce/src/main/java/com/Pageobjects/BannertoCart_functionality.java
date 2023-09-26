package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Homepage;
import com.base.Testbase;

public class BannertoCart_functionality  extends Testbase {
	
		@FindBy(xpath="//img[@class='d-block w-100 __slide-img']")      //banner
		WebElement ban;
		@FindBy(xpath="//a[@href='http://e-quarz.com/product/jodhpuri-blazer-for-men-black-formal-casual-svSGUX']")
		WebElement prod;
		@FindBy(xpath="//span[text()='Add to cart']")
		WebElement addtocart;
		public BannertoCart_functionality(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public Homepage validateProduct14() throws InterruptedException
		{
			//popclose.click();
			ban.click();
			prod.click();
			addtocart.click();
			
			return new Homepage();
		}

	}



