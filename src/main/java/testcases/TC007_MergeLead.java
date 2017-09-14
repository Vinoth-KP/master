package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import pages.MergeLeadsPage;
import pages.MyLeads;
import wrappers.GenericWrappers;
import wrappers.ProjectWrappers;

public class TC007_MergeLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC007_MergeLead";
		testDescription = "Login and Merge Lead by using Lead ID and Verify it";
		authors = "VinothKP";
		category = "Regression";
		browserName = "chrome";
		dataSheetName = "TC007_MergeLead";		
	}
	
	@Test(dataProvider="fetchData")
	public void MergeLead(String uName, String pwd, String FLead,String LLead) throws InterruptedException{
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickMergeLead()
		.clickFromLeadIcon()							 
		 .typeLeadID(FLead)
		 .clickFindLeadToSearch()
		 .clickFirstLeadReturnMerge()		 
		 .clickToLeadIcon()		 	
		 .typeLeadID(LLead)
		 .clickFindLeadToSearch()
		 .clickFirstLeadReturnMerge()			
		 .clickMerge()		 
		 .clickFindLead()
		 .typeLeadID(FLead)
		 .clickFindLeadToSearch()
		 .VerifyNoRecords();
		 
		 
		
		
		
		
		
	}
}















