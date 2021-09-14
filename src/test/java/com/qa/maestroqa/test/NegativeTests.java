package com.qa.maestroqa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.maestroqa.base.BaseTest;
import com.qa.maestroqa.pages.RoiCalculatorSection1;

public class NegativeTests extends BaseTest  {

	
	@Test
	public void qaGradersIsLeftBlankTest() {
		//negative test to make sure that when left empty it stays in section 1
		RoiCalculatorSection1 rcs1 = new RoiCalculatorSection1(driver);
		rcs1.typeInNumberOfQaGradersTextBox(" ").typeInNumberOfCxTeamSize("1")
		.typeInNumberOfSupportAgentsTextBox("3").clickNext();
		boolean test = rcs1.isNumberOfQAGradersDisplayed();
		Assert.assertEquals(test, true);
				
	}
	
	@Test
	public void cxTeamSizeIsLeftBlankTest() {
		//negative test to make sure that when left empty it stays in section 1
		RoiCalculatorSection1 rcs1 = new RoiCalculatorSection1(driver);
		rcs1.typeInNumberOfQaGradersTextBox("323").typeInNumberOfCxTeamSize("")
	 .typeInNumberOfSupportAgentsTextBox("3").clickNext();
		boolean test = rcs1.isNumberOfCxTeamSizeDisplayed();
		Assert.assertEquals(test, true);
				
	}
	
	@Test
	public void supportAgentTextBoxLeftBlankTest() {
		//negative test to make sure that when textbox of support agent is left empty it stays in section 1
		RoiCalculatorSection1 rcs1 = new RoiCalculatorSection1(driver);
		rcs1.typeInNumberOfQaGradersTextBox("323").typeInNumberOfCxTeamSize("1")
	 .typeInNumberOfSupportAgentsTextBox("").clickNext();
		boolean test = rcs1.isNumberOfSupportAgentsDisplayed();
		Assert.assertEquals(test, true);
				
	}
	
}
