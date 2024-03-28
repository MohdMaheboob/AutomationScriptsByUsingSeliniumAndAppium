package web_TestCases;

import org.testng.annotations.Test;

import perch_TestCasess.ScreenRecorderUtil;
import perch_Web_Pageobjects.Perch_Web_Application;

public class TC_001_1  extends Perch_Web_Application {
	
	
	
	@Test
	public void web() throws Exception {
		
		ScreenRecorderUtil.startRecord("Location & Branch");
		
		
		Perch_Web_Application P=new Perch_Web_Application();
		Thread.sleep(2000);
		
		P.Mailw("mohammed.m@Smartgig.tech");
		Thread.sleep(2000);
		
		P.Signin();
		Thread.sleep(3000);
		
		driver.get(Application2);
		
		Thread.sleep(2000);
		
		P.Emailoutlook();
		Thread.sleep(2000);
		
		P.Openperch();
		Thread.sleep(3000);
		
		P.IconLocation();
		Thread.sleep(2000);
		
		P.AddlocationBu();
		Thread.sleep(2000);
		
		P.LocationNmae("Testing Demo");
		Thread.sleep(2000);
		
		P.AddLocationB();
		Thread.sleep(2000);
		
		P.Locationcard();
		Thread.sleep(2000);
		
		P.AddBranchicon();
		Thread.sleep(2000);
		
		P.AddBranchB();
		Thread.sleep(2000);
		
		P.BranchnameEnter("Hyderabad");
		Thread.sleep(2000);
		
		P.EnterAddressline1("Hyderabad");
		Thread.sleep(2000);
		
		P.EnterCityname("Attapur");
		Thread.sleep(2000);
		
		P.EnterStateNema("Telangana");
		Thread.sleep(2000);
		
		P.Entercountryname("INDIA");
		Thread.sleep(2000);
		
		P.Enterpicode("500048");
		Thread.sleep(2000);
		
		P.EnterBrachemail("perch@gmail.com");
		Thread.sleep(2000);
		
		P.EnterContactno("9704224205");
		Thread.sleep(2000);
		
		P.AddBranchB();
		Thread.sleep(2000);
		
		
		
		
		ScreenRecorderUtil.stopRecord();

}
}
