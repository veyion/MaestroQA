package com.qa.maestroqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.maestroqa.base.BasePage;
import com.qa.maestroqa.utils.ElementUtil;

public class RoiCalculatorSection2 extends BasePage {
	private WebDriver driver;
	private By perWeekSlider = By.xpath("//*[@id='60a5132efd59d92724aa569d']");
    private By nextButton = By.xpath("//button[@id='60a5132ffd59d92724aa580a']");

 
	public RoiCalculatorSection2(WebDriver driver) {
		this.driver = driver;
		 elementUtil = new ElementUtil(driver);
	}

	public RoiCalculatorSection2 moveAlertSlider() {
		elementUtil.doActionsDragAndDropByRight(perWeekSlider);
		return new RoiCalculatorSection2(driver);
	}
	  public RoiCalculatorSection3 clickNext() {
	    	elementUtil.doClick(nextButton);;
			return new RoiCalculatorSection3(driver);
	    }

}
