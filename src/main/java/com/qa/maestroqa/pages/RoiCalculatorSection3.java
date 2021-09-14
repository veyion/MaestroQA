package com.qa.maestroqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.maestroqa.base.BasePage;
import com.qa.maestroqa.utils.ElementUtil;

public class RoiCalculatorSection3 extends BasePage{
	private WebDriver driver;
	private By firstCallSlider = By.xpath("//input[@id='60a5132efd59d92724aa56af']");
	private By currentAhtTypeBox = By.xpath("//input[@id='60a5132efd59d92724aa56a6']");
	private By supportTicketTypeBox = By.xpath("//input[@id='60a5132efd59d92724aa56b8']");
	private By nextButton = By.xpath("//button[@id='60a5132ffd59d92724aa580b']");

	
	public RoiCalculatorSection3(WebDriver driver) {
		this.driver = driver;
			elementUtil = new ElementUtil(driver);
	}
	
	public RoiCalculatorSection3 moveAlertSlider() {
		elementUtil.doActionsDragAndDropByRight(firstCallSlider);
		return new RoiCalculatorSection3(driver);
	}
	
	
	public RoiCalculatorSection3 typeInCurrentAhtTypeBox(String random) {
		elementUtil.doSendKeys(currentAhtTypeBox, random);
		return new RoiCalculatorSection3(driver);
	}
	
	public RoiCalculatorSection3 typeInSupportTicketTypeBox(String random) {
		elementUtil.doSendKeys(supportTicketTypeBox, random);
		return new RoiCalculatorSection3(driver);
	}
	 public RoiCalculatorSection4 clickNext() {
	    	elementUtil.doClick(nextButton);;
			return new RoiCalculatorSection4(driver);
	    }
	
}
