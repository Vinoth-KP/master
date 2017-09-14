package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC006_DeleteLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC006_DeleteLead";
		testDescription = "Login and Delete Lead by using MObile Nummber and Verify the Delete Lead";
		authors = "VinothKP";
		category = "Regression";
		browserName = "chrome";
		dataSheetName = "TC006_DeleteLead";		
	}
	
	@Test(dataProvider="fetchData")
	public void DeleteLead(String uName, String pwd, String comp,String Mob) throws InterruptedException{
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickFindLead()
		.clickPhoneTab()
		.typePhoneNo(Mob)		
		.clickFindLeadToSearch()
		.CaptureFirstLeadID()
		.clickFirstLead()
		.clickDelete()
		.clickFindLead()
		.typeLeadID(firstResLeadID)
		.clickFindLeadToSearch()
		.VerifyNoRecords();
		
		
	}
}















