package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class ViewLeadPage extends ProjectWrappers {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead", "FAIL");
		}
	}	

	public ViewLeadPage verifyFirstName(String text){
		verifyTextById(prop.getProperty("ViewLead.FirstName.Id"), text);	
		return this;
	}
	
	public ViewLeadPage verifyCompanyName(String text){
		verifyTextContainsById(prop.getProperty("ViewLead.CompanyName.Id"), text);	
		return this;
	}
	
	public EditLeadPage clickEdit(){
		clickByLink(prop.getProperty("ViewLead.Edit.Link"));	
		return new EditLeadPage(driver, test);
	}
	public DuplicateLeadPage clickDuplicate(){
		clickByLink(prop.getProperty("ViewLead.Duplicate.Link"));	
		return new DuplicateLeadPage(driver, test);
	}
	public MyLeads clickDelete(){
		clickByClassName(prop.getProperty("ViewLead.Delete.Class"));	
		return new MyLeads(driver, test);
	}
	public FindLeadsPage clickFindLead(){
		clickByLink(prop.getProperty("ViewLead.FindLead.Link"));	
		return new FindLeadsPage(driver, test);
	}
	
	
	
	





















}
