package perch_TestCasess;


import org.testng.annotations.Test;

import perch_pageobjects.Perch_Sprint_1;


public class PER_001 extends Perch_Sprint_1{

	
	
	@Test
	public void run() throws Exception {
		
		
		ScreenRecorderUtil.startRecord("Main");
		
		
		Perch_Sprint_1 p = new  Perch_Sprint_1();
		
		Thread.sleep(5000);
		
		p.Perch_Skip();
		Thread.sleep(2000);
		
		p.Nextbutton1();
		Thread.sleep(2000);
		
		p.Perch_Prev();
		Thread.sleep(2000);
		
		p.Nextbutton2();
		Thread.sleep(2000);
		
		p.Nextsecondbutton();
		Thread.sleep(2000);
		
		p.LetsGetsStarted();
		Thread.sleep(2000);
		
		p.Email("mohammed.m@smartgig.tech");
		Thread.sleep(2000);
		
		p.Siginbutton();
		Thread.sleep(30000);
		
		p.SwiptoCheckIn();
		Thread.sleep(2000);

		p.SwiptoCheckOuT();
		Thread.sleep(2000);

		
		ScreenRecorderUtil.stopRecord();
		
	}
	
	
	
}
