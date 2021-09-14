package com.qa.maestroqa.base;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.maestroqa.utils.ElementUtil;
import com.qa.maestroqa.utils.JavaScriptUtil;


public class BaseTest {

	public WebDriver driver;

	public BasePage basePage;
	public Properties prop;
    private By cookieButton = By.xpath("//*[@id='hs-eu-confirmation-button']");
    private By acceptAndClose = By.xpath("//a[@class='gdrp-accept']");
    		// <a class="gdrp-accept" href="javascript:void(0);">Accept and Close</a>
    @BeforeMethod
	public void setUp() {
		basePage = new BasePage();
	      driver  = basePage.init_driver();
          driver.findElement(cookieButton).click();
	      JavaScriptUtil jsu = new JavaScriptUtil(driver);
          jsu.scrollPageHalfWayDown();
           ElementUtil eu = new ElementUtil(driver);
			driver.switchTo().frame(0);


          
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
