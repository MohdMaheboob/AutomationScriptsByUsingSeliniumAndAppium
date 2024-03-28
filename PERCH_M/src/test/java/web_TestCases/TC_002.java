package web_TestCases;

import org.testng.annotations.Test;

import perch_TestCasess.ScreenRecorderUtil;
import perch_Web_Pageobjects.Perch_Web_Application;

public class TC_002 extends Perch_Web_Application {
	
	@Test
public void web() throws Exception {
		
		ScreenRecorderUtil.startRecord("Finding users by group & roe By the way & editing user.");
		
		
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
		
		P.GroupIconweb();
		Thread.sleep(2000);
		
		//P.GroupScroleorclick();
		Thread.sleep(2000);
		P.CardGroup();
		Thread.sleep(2000);
		
		P.ClickOnroleName();
		Thread.sleep(2000);
		
		P.ClickOnRoleEmail();
		Thread.sleep(2000);
		
		P.EdittheUser();
		Thread.sleep(2000);
		
		P.Selectgenderu();
		Thread.sleep(3000);
		
		P.SelectgroupS();
		Thread.sleep(3000);
		
		P.SelectroleT();
		Thread.sleep(3000);
		
		P.SelectlocationH();
		Thread.sleep(3000);
		
		P.Updateusers();
		Thread.sleep(60000);
		
		//P.Editcancel();
		//Thread.sleep(2000);
		
		
		ScreenRecorderUtil.stopRecord();
		

}
}