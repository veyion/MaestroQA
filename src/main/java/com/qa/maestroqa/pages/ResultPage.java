package com.qa.maestroqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.maestroqa.base.BasePage;
import com.qa.maestroqa.utils.ElementUtil;

public class ResultPage extends BasePage {
	private WebDriver driver;
	private By bookAdemo = By.xpath("//div[@class='custom_cont']");
	public ResultPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public boolean getBookAdemo() {
	elementUtil.waitForElementPresent(bookAdemo, 3);
   return  elementUtil.getElement(bookAdemo).isEnabled();
	}
}
