package perch_TestCasess;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass_PER {
	
	
	
	public WebDriver driver;
	
     @BeforeTest
	 public void setup()throws MalformedURLException, InterruptedException
		{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
	    dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\MohammedMaheboob\\Downloads\\app-releaseja 6.apk");
		
		URL url = new URL("http://localhost:4723/wd/hub/");
		
		  driver = new AndroidDriver<>(url, dc); // Assign the AndroidDriver to the class-level driver
		  Thread.sleep(6000);
		  
		  
		// AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		
	   }
		
		//@AfterTest
//		public void teardown() {
//			
//			if (driver != null) {
//	          driver.quit();
//	   	driver.quit();
//				
//			// }
	//
//			
//		}
     
     
     
//     @BeforeTest
// 	public void setup() throws MalformedURLException {
//         DesiredCapabilities dc = new DesiredCapabilities();
//         dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
//         dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//         dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0"); // Make sure to provide a String value
//         dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
//         dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\SmartGig\\Downloads\\slanNewAPK 1.apk");
//  
//         URL url = new URL("http://localhost:4723/wd/hub");
//         driver = new AndroidDriver<>(url, dc); // Assign the AndroidDriver to the class-level driver
//     }
//  
//     
//     
     
     
     
     
     
	   }


