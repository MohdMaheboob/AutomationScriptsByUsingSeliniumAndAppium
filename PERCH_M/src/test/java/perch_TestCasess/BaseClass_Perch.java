package perch_TestCasess;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass_Perch {
	
	
	
	
	
	 public static WebDriver driver;
	 
	@BeforeTest
	public void Setup() throws Exception
	{
		
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		
		dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\MohammedMaheboob\\Downloads\\app-release 7.apk");
		
		URL url = new URL("http://localhost:4723/wd/hub/");
		
		driver = new  AndroidDriver<>(url, dc);
		
		
		
	}
	//@AfterTest
//	public void TearDown() {
//		
//		driver.quit();
//		
//		
//	}

}
