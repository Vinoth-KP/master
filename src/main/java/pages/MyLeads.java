package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MyLeads extends ProjectWrappers {

	public MyLeads(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not My Leads", "FAIL");
		}
	}	

	public CreateLeadPage clickCreateLead(){
		clickByLink(prop.getProperty("MyLeads.CreateLead.Link"));	
		return new CreateLeadPage(driver, test);
	}
	
	public FindLeadsPage clickFindLead(){
		clickByLink(prop.getProperty("MyLeads.FindLeads.Link"));	
		return new FindLeadsPage(driver, test);
	}
	
	public ViewLeadPage clickMergeButton(){
		clickByLinkNoSnap(prop.getProperty("MergeLeads.MergeButton.Link"));	
	//	this.driver.switchTo().alert().accept();		
		return new ViewLeadPage(driver, test);
	}
	
	public MergeLeadsPage clickMergeLead(){
		clickByLink(prop.getProperty("MyLeads.MergeLead.Lnik"));	
			
		return new MergeLeadsPage(driver, test);
	}
	
	
	
	





















}
