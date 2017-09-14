package pages;

import java.util.Set;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class FindLeadsPage extends ProjectWrappers {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitlePartially("Find Leads")){
			reportStep("This is not Find Lead", "FAIL");
		}
	}	
	
	

	public FindLeadsPage typeCompanyName(String data){
		enterByXpath(prop.getProperty("FindLead.CompanyName.Xpath"), data);	
		return this;
	}
	
	public FindLeadsPage typeFirstName(String data){
		enterByXpath(prop.getProperty("FindLead.FirstName.Xpath"),data);	
		return this;
	}
	
	public FindLeadsPage typeLastName(String data){
		enterByXpath(prop.getProperty("FindLead.LastName.Xpath"),data);	
		return this;
	}
	
	public FindLeadsPage clickFindLeadToSearch() throws InterruptedException{
		clickByXpath(prop.getProperty("FindLead.Button.Xpath")); Thread.sleep(5000);	    
		return this;
	}
	public MergeLeadsPage clickFindLeadForMerge() throws InterruptedException{
		clickByXpath(prop.getProperty("FindLead.Button.Xpath")); Thread.sleep(5000);	
		return new MergeLeadsPage(driver, test);
	}
	public ViewLeadPage clickFirstLead(){
		clickByXpath(prop.getProperty("FindLead.FirstLead.Xpath"));	
		return new ViewLeadPage(driver, test);
	}
	
	public MergeLeadsPage SwitchtoPrentWindow()
	{
		switchToParentWindow();
		return new MergeLeadsPage(driver, test);
		
	}	
	public MergeLeadsPage clickFirstLeadReturnMerge(){
		clickByXpathNoSnap(prop.getProperty("FindLead.FirstLead.Xpath"));	
		
		return SwitchtoPrentWindow();
	}
	
	public FindLeadsPage clickEmailTab(){
		clickByXpath(prop.getProperty("FindLead.EmailTab.Xpath"));	
		return this;
	}
	
	public FindLeadsPage typeEmaiId(String data){
		enterByXpath(prop.getProperty("FinLead.InputEmail.Xpath"),data);	
		return this;
	}
	
	public FindLeadsPage clickPhoneTab(){
		clickByXpath(prop.getProperty("FindLead.PhoneTab.Xpath"));	
		return this;
	}
	
	public FindLeadsPage typePhoneNo(String data){
		enterByName(prop.getProperty("FindLead.InputPhone.Name"),data);	
		return this;
	}
	public FindLeadsPage typeLeadID(String data){
		enterByXpath(prop.getProperty("FindLead.InpuLeadID.Xpath"),data);	
		return this;
	}
	
	public FindLeadsPage  CaptureFindLeadName(){
		String getFirstName=getTextByXpath(prop.getProperty("FinLead.FindLeadName.Xpath"));
		firstResLead=getFirstName;
		return this ;
	}
	
	public FindLeadsPage  CaptureFirstLeadID(){
		String getFirstId=getTextByXpath(prop.getProperty("FindLead.FirstLead.Xpath"));
		firstResLeadID=getFirstId;
		return this ;
	}
	
	public FindLeadsPage  VerifyNoRecords(){
		verifyTextByXpath(prop.getProperty("FindLead.PageInfo.Xpath"), "No records to display");
		return this ;
	}

	



















}
