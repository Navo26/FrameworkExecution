package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPageLeads extends ProjectSpecificMethods{
	
	public LoginPageLeads(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="field-userName")
	public WebElement eleUserName ;
	
	public LoginPageLeads enterUserName(){
		clearAndType(eleUserName, "admin");
		return this;
	}
	
	
	@FindBy(how=How.ID,using="field-password")
	public WebElement elepasswrd ;
	
	public LoginPageLeads enterPassword(){
		clearAndType(elepasswrd, "admin");
		return this;
	}
	 
	 
	@FindBy(how=How.ID,using="btn-login")
	private WebElement eleLogin;	
	
	
	@Given("Click on the Login")
	public HomePageLeads clickLogin() {
		click(eleLogin);
		return new HomePageLeads(driver, node, test);		
	}
	
	
	
}
