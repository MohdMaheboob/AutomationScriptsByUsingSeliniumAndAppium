package web_TestCases;

import org.testng.annotations.Test;

import perch_TestCasess.ScreenRecorderUtil;
import perch_Web_Pageobjects.Perch_Web_Application;

public class TC_001 extends Perch_Web_Application {
	
	@Test
	public void web() throws Exception {
		
		ScreenRecorderUtil.startRecord("creategrop & role");
		
		
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
		
		//P.AddUser();
		// create and cancel
		P.GroupIconweb();
		Thread.sleep(2000);
		P.GroupScroleorclick();
		Thread.sleep(2000);
		P.GroupEntername("Testing Group");
		Thread.sleep(2000);
		P.DescriptionGroup("Testing Demo");
		Thread.sleep(2000);
		P.ButtonCancel();
		Thread.sleep(2000);
		// create done
		P.GroupScroleorclick();
		Thread.sleep(2000);
		P.GroupEntername("Testing Group");
		Thread.sleep(2000);
		P.DescriptionGroup("Testing Demo");
		Thread.sleep(2000);
		P.Buttoncreate();
		Thread.sleep(6000);
		
		// create role and cancel
		P.CardGroup();
		Thread.sleep(2000);
		P.AddRolebutton();
		Thread.sleep(2000);
		P.Rolename("Testing Role");
		Thread.sleep(2000);
		P.RoleDescription("Role demo");
		Thread.sleep(2000);
		P.CancelRolebutton();
		Thread.sleep(2000);
		// create role done
		P.AddRolebutton();
		Thread.sleep(2000);
		P.Rolename("Testing Role");
		Thread.sleep(2000);
		P.RoleDescription("Role demo");
		Thread.sleep(2000);
		P.CreateRoleButton();
		Thread.sleep(2000);
		
	
		
		ScreenRecorderUtil.stopRecord();
	}

}
