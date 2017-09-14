package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class CreateLeadPage extends ProjectWrappers {

	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead", "FAIL");
		}
	}	

	public CreateLeadPage typeCompanyName(String data){
		enterById(prop.getProperty("CreateLead.CompanyName.Id"), data);	
		return this;
	}
	
	public CreateLeadPage typeFirstName(String data){
		enterById(prop.getProperty("CreateLead.FirstName.Id"),data);	
		return this;
	}
	
	public CreateLeadPage typeLastName(String data){
		enterById(prop.getProperty("CreateLead.LastName.Id"),data);	
		return this;
	}
	
	public ViewLeadPage clickSubmitLead(){
		clickByClassName(prop.getProperty("CreateLead.SubmitButton.Class"));	
		return new ViewLeadPage(driver, test);
	}
	
	





















}
