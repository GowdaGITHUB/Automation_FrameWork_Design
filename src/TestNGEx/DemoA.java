package TestNGEx;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoA {
	@BeforeClass
	public void openAPP(){
		Reporter.log("openApp", true);
	}
	@AfterClass
	public void closeApp(){
		Reporter.log("closeApp", true);
	}

	@BeforeMethod
	public void login(){
		Reporter.log("Login", true);
	}
	@AfterMethod
	public void Logout(){
		Reporter.log("Logout", true);
	}
	@Test(priority=-1)
	public void createUser() {
		Reporter.log("createUser",true);
	}
	@Test(invocationCount=3)
	public void editUser() {
		Reporter.log("editUser",true);
	}
	@Test(priority=1,invocationCount=0)
	public void deleteUser() {
		Reporter.log("deleteUser",true);
	}
}