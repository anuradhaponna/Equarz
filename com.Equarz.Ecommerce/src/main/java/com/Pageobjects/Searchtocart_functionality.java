package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Homepage;

public class Searchtocart_functionality {
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	@FindBy(xpath="//button[@class='input-group-append-overlay search_button']")
	WebElement searchbtn;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/hp-247-g8-laptop-amd-athlon-p-3045b-hd-14-inches355cm-hd-8gb-ram-ddr4-1tb-hddwindows-11-home-w11-sl-one-year-warranty-bl']")
	WebElement product;
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;
	public Searchtocart_functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public Homepage validateProduct1() throws InterruptedException
	{
		//popclose.click();
		search.sendKeys(props.getProperty("Product"));
		searchbtn.click();

		addtocart.click();
		
		return new Homepage();
	}

}



