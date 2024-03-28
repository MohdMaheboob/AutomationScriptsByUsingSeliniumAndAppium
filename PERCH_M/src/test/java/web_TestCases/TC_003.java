package web_TestCases;

import org.testng.annotations.Test;

import perch_TestCasess.ScreenRecorderUtil;
import perch_Web_Pageobjects.Perch_Web_Application;

public class TC_003 extends Perch_Web_Application {
	
	@Test
	public void web() throws Exception {
	
	ScreenRecorderUtil.startRecord("AddUser");
	
	
	Perch_Web_Application P =new Perch_Web_Application();
	
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
	
	P.AddUser();
	Thread.sleep(3000);
	
	P.AdduserL();
	Thread.sleep(3000);

	P.EnterFullName("Mohd Maheboob");
	Thread.sleep(3000);
	
	P.EnterEMPId("SG21461");
	Thread.sleep(3000);
	
	P.EntermailU("Mohammed@gmail.com");
	Thread.sleep(3000);
	
	P.Selectgenderu();
	Thread.sleep(3000);
	
	P.SelectgroupS();
	Thread.sleep(3000);
	
	P.SelectroleT();
	Thread.sleep(3000);
	
	P.SelectlocationH();
	Thread.sleep(3000);
	
	P.EnterDOBU("04/15/2000");
	Thread.sleep(3000);
	
	P.SelctbranchM();
	Thread.sleep(3000);
	
	P.DOJU("02/02/2024");
	Thread.sleep(3000); 
	
	P.AdduserL();
	Thread.sleep(3000);
	
	ScreenRecorderUtil.stopRecord();
}
	}
