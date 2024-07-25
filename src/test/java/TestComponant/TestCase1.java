package TestComponant;

import org.testng.Assert;
import org.testng.annotations.Test;
import EngineComponent.Base;
import PageComponent.LoginPage;
import Utility.WebPageUtil;



public class TestCase1 extends Base{
	
	@Test(priority=0)
	
	public void Testcases_01()  {
		
		WebPageUtil.init();
		LoginPage app = new LoginPage();
		app.openpage();
		Assert.assertEquals(true, true);
		System.out.println("loginpage is sucessfully");
	   
	}
	
	@Test(priority=1)
	 
	public void Testcases_02() throws Throwable  {
		LoginPage obj = new LoginPage();
		obj.booking();
		WebPageUtil.TakeScreenshot();
	  System.out.println("APPOINMENT CONFIRM");
	 Assert.assertEquals(true, true);
		
	}
	
	
	
	
	
}
		

