package com.qa.maestroqa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.maestroqa.base.BaseTest;
import com.qa.maestroqa.pages.ResultPage;
import com.qa.maestroqa.pages.RoiCalculatorSection1;
import com.qa.maestroqa.pages.RoiCalculatorSection2;
import com.qa.maestroqa.utils.JavaScriptUtil;

public class MainTest extends BaseTest {

	
@Test
public void flowOfRoiCalculatorTest() throws InterruptedException {
	RoiCalculatorSection1 rcs1 = new RoiCalculatorSection1(driver);
	ResultPage rs = new ResultPage(driver);

	JavaScriptUtil jsu = new JavaScriptUtil(driver);
	rcs1.moveAlertSlider().typeInNumberOfCxTeamSize("23").typeInNumberOfQaGradersTextBox("15")
	.typeInNumberOfSupportAgentsTextBox("23").clickNext().     
	moveAlertSlider().clickNext().moveAlertSlider()
     .typeInCurrentAhtTypeBox("3").typeInSupportTicketTypeBox("3")
     .clickNext().clickClose().typeInFirstNameTypeBox("random")
     .typeInLastNameTypeBox("random").typeInAgentTypeBox().typeInEmailTypeBox("dsd@agent.com")
      .clickNext();
	boolean text =rs.getBookAdemo();
	System.out.println(text);
	Assert.assertEquals(text, true);
	
	/* does the flow of all the 4 sections first it switches to frame
	then it does every action per section  even moving the sliders
	*
	*/
	 
}



	
	
}
