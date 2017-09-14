package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class EditLeadPage extends ProjectWrappers {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Lead", "FAIL");
		}
	}	

	
	public EditLeadPage EditCompanyName(String data){
		enterById(prop.getProperty("EditLead.CompanyName.Id"), data);	
		return this;
	}
	
	
	public ViewLeadPage clickUpdate() {
		clickByXpath(prop.getProperty("EditLead.Update.Xpath")); 	
		return new ViewLeadPage(driver, test);
	}
	
	





















}
