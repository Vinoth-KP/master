package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MyHomePage extends ProjectWrappers {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not MyHome Page", "FAIL");
		}
	}	
	
	public MyLeads clickLead(){
		clickByLink(prop.getProperty("MyHome.Leads.Link"));	
		return new MyLeads(driver, test);
	}
	
	
	
	
	





















}
