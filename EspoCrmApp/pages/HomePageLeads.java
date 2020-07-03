package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Then;

public class HomePageLeads extends ProjectSpecificMethods{

	public HomePageLeads(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);
	}		

	@FindBy(how=How.XPATH,using="//span[text()='Leads']")
	public WebElement eleLeads;
	
	public LeadsPage clickLeads(){
		click(eleLeads);
		return new LeadsPage(driver, node, test);
	}

	
	

}










