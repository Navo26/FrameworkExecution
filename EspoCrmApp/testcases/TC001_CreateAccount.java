package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateAccount extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "CreateAccount";
		testDescription = "Creating New Accounts";
		nodes = "Leads";
		authors = "TestLeaf";
		category = "Smoke";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void createAcc(String data) throws InterruptedException {
		new LoginPage(driver, node, test)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickAccounts()
		.clickCreateAccount()
		.enterName(data)
		.clickSave()
		.verifyName(data);
			
	}


}





