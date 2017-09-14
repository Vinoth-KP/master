package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MergeLeadsPage extends ProjectWrappers {

	public MergeLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Lead", "FAIL");
		}
	}	

	public FindLeadsPage clickFromLeadIcon(){

		clickByXpath(prop.getProperty("MergeLeads.FromLeadIcon.Xpath"));	  		
		return SwitchtoFindLeadWindow();
	}


	public FindLeadsPage SwitchtoFindLeadWindow()
	{
		switchToLastWindow();
		return new FindLeadsPage(driver, test);

	}	



	public FindLeadsPage clickToLeadIcon(){
		clickByXpath(prop.getProperty("MergeLeads.ToLeadIcon.Xpath"));					
		return SwitchtoFindLeadWindow();
	}

	public ViewLeadPage clickMerge(){
		clickByLinkNoSnap(prop.getProperty("MergeLeads.MergeButton.Link"));			
		return clickMergeAlert();
	}

	public ViewLeadPage clickMergeAlert(){		
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}






















}
