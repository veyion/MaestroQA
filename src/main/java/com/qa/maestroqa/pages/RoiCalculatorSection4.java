package com.qa.maestroqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qa.maestroqa.base.BasePage;
import com.qa.maestroqa.utils.ElementUtil;

public class RoiCalculatorSection4 extends BasePage {
	private WebDriver driver;
	private By FirstNameTypeBox = By.xpath("//input[@aria-label='First Name']");
	private By LastNameTypeBox = By.xpath("//input[@aria-label='Last Name']");
	private By emailTextBox =By.xpath("//input[@aria-label='Email']");
	private By agentTextBox = By.xpath("//input[@placeholder='# of Agents']")	;
	private By nextButton = By.xpath("//a[@id='leadBtn60a5132efd59d92724aa56c1']");
	private By zeroTo20 = By.xpath("//*[text()='0-20']");
    private By acceptAndClose = By.xpath("//a[@class='gdrp-accept']");

	public RoiCalculatorSection4(WebDriver driver) {
		this.driver = driver;
			elementUtil = new ElementUtil(driver);
	}
	
	public RoiCalculatorSection4 typeInFirstNameTypeBox(String random) {
		elementUtil.doSendKeys(FirstNameTypeBox, random);
		return new RoiCalculatorSection4(driver);
	}
	
	public RoiCalculatorSection4 typeInLastNameTypeBox(String random) {
		elementUtil.doSendKeys(LastNameTypeBox, random);
		return new RoiCalculatorSection4(driver);
	}
	
	public RoiCalculatorSection4 typeInEmailTypeBox(String random) {
		elementUtil.doSendKeys(emailTextBox, random);
		return new RoiCalculatorSection4(driver);
	}
	
	public RoiCalculatorSection4 typeInAgentTypeBox() {
		for(int i=0;i<5;i++) {
			elementUtil.doClick(agentTextBox);
		}
		elementUtil.doClick(zeroTo20);
		return new RoiCalculatorSection4(driver);
	}
	
	public void clickNext() {
		elementUtil.doClick(nextButton);
	}
	
	 public RoiCalculatorSection4 clickClose() {
	    	elementUtil.doClick(acceptAndClose);;
			return new RoiCalculatorSection4(driver);
	    }
	 
	
	
	
	
}
