package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC005_DuplicateLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC005_DuplicateLead";
		testDescription = "Login and Verify Dupicate Lead by using FirstName";
		authors = "VinothKP";
		category = "Regression";
		browserName = "chrome";
		dataSheetName = "TC005_DuplicateLead";		
	}
	
	@Test(dataProvider="fetchData")
	public void DuplicateLead(String uName, String pwd, String comp,String emailId) throws InterruptedException{
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickFindLead()
		.clickEmailTab()
		.typeEmaiId(emailId)		
		.clickFindLeadToSearch()
		.CaptureFindLeadName()
		.clickFirstLead()
		.clickDuplicate()
		.clickCreateLead()
		.verifyFirstName(firstResLead);
		
	}
}















