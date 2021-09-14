package com.qa.maestroqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.maestroqa.base.BasePage;
import com.qa.maestroqa.utils.ElementUtil;

public class RoiCalculatorSection1 extends BasePage{
	private WebDriver driver;
	private By numberOfQaGradersTextBox = By.xpath("//input[@placeholder='# of QA Graders']");
    private By numberOfSupportAgentsTextBox = By.xpath("//input[@placeholder='# of Support Agents']");
	private By cxTeamSize = By.xpath("//input[@id='60a5132efd59d92724aa568b']");
    private By rampUpAgentSlider = By.xpath("//input[@id='60a5132efd59d92724aa5694']");
    private By nextButton = By.xpath("//button[@id='60a5132ffd59d92724aa5809']");
	
	public RoiCalculatorSection1(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public RoiCalculatorSection1 typeInNumberOfQaGradersTextBox(String random) {
		elementUtil.doSendKeys(numberOfQaGradersTextBox, random);
		return new RoiCalculatorSection1(driver);
	}

	public RoiCalculatorSection1 typeInNumberOfSupportAgentsTextBox(String random) {
		elementUtil.doSendKeys(numberOfSupportAgentsTextBox, random);
		return new RoiCalculatorSection1(driver);
	}
	public RoiCalculatorSection1 typeInNumberOfCxTeamSize(String random) {
		elementUtil.doSendKeys(cxTeamSize, random);
		return new RoiCalculatorSection1(driver);
	}
	
	public RoiCalculatorSection1 moveAlertSlider() {
		elementUtil.doActionsDragAndDropByRight(rampUpAgentSlider);
		return new RoiCalculatorSection1(driver);
	}
    public RoiCalculatorSection2 clickNext() {
    	elementUtil.doClick(nextButton);;
		return new RoiCalculatorSection2(driver);
    }
    
    public boolean isNumberOfQAGradersDisplayed() {
    	//checks if the textbox is displayed
    	elementUtil.waitForElementPresent(numberOfQaGradersTextBox, 3);
       return  elementUtil.getElement(numberOfQaGradersTextBox).isEnabled();
    	}
    public boolean isNumberOfCxTeamSizeDisplayed() {
    	//checks if the textbox is displayed
    	elementUtil.waitForElementPresent(cxTeamSize, 3);
       return  elementUtil.getElement(cxTeamSize).isEnabled();
    	}
    
    public boolean isNumberOfSupportAgentsDisplayed() {
    	//checks if the textbox is displayed
    	elementUtil.waitForElementPresent(numberOfSupportAgentsTextBox, 3);
       return  elementUtil.getElement(numberOfSupportAgentsTextBox).isEnabled();
    	}

	
}
