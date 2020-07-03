package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPageLeads;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC002_CreateLead extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "CreateLead";
		testDescription = "Creating Leads";
		nodes = "Leads";
		authors = "TestLeaf";
		category = "Smoke";
		dataSheetName = "TC002";
	}

	@Test(dataProvider = "fetchData")
	public void createAcc(String fName,String lName) throws InterruptedException {
		new LoginPageLeads(driver, node, test)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickLeads()
		.clickCreateLeads()
		.enterSalName()
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSave()
		.verifySalName(fName);
	}


}





