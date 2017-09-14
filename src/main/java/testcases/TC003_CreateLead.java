package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC003_CreateLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC003_CreateLead";
		testDescription = "Login and Create a Create Lead";
		authors = "VinothKP";
		category = "Regression";
		browserName = "firefox";
		dataSheetName = "TC003";		
	}
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName, String pwd, String Comp,String FName,String LName){
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickCreateLead()
		.typeCompanyName(Comp)
		.typeFirstName(FName)
		.typeLastName(LName)
		.clickSubmitLead()
		.verifyFirstName(FName);
	}
}















