package Muharram;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGGroups {
	@BeforeClass(alwaysRun=true)
	public void login(){Reporter.log("login",true);}
	
	@Test(priority=1,groups={"user","smoke"})
	public void creatUser(){Reporter.log("creatUser",true);}

	@Test(priority=1,groups={"user"},enabled=false)
	public void editUser(){Reporter.log("editUser",true);}
	
	@Test(priority=1,groups={"user","smoke"})
	public void deletUser(){Reporter.log("deletUser",true);}
	
	@Test(priority=1,groups={"product","smoke"})
	public void creatProduct(){Reporter.log("createProduct",true);}
	
	@Test(priority=1,groups={"product"})
	public void deleteProduct(){Reporter.log("deleteProduct",true);}
	
	

}
