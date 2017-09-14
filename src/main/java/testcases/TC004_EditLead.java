package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC004_EditLead extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC004_EditLead";
		testDescription = "Login and Edit Lead by CompanyName";
		authors = "VinothKP";
		category = "Regression";
		browserName = "chrome";
		dataSheetName = "TC004_EditLead";		
	}
	
	@Test(dataProvider="fetchData")
	public void EditLead(String uName, String pwd, String comp,String fName,String lName,String changeComp) throws InterruptedException{
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.clickCrmSfa()
		.clickLead()
		.clickFindLead()
		.typeCompanyName(comp)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickFindLeadToSearch()
		.clickFirstLead()
		.clickEdit()
		.EditCompanyName(changeComp)
		.clickUpdate()
		.verifyCompanyName(changeComp);
	}
}















