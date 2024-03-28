package perch_Web_Pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
	
	
	
	public static WebDriver driver;
	
	//String Application="https://perch-dev-admin.smartgig.tech/";
	String Application="https://perch-test-admin.smartgig.tech/";
	//String Application="https://perch-prod-admin.smartgig.tech/";
	
	public String Application2="https://outlook.office.com/mail/";
	
	@BeforeClass
	public void Setup() throws InterruptedException {
	 
		System.setProperty("webdriver.edge.driver","./BrowserFiles/msedgedriver.exe");
		
		driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get(Application);
		Thread.sleep(7000);
		

	}
	
	
	  @AfterMethod public void teardown() { driver.quit(); }
	 

	

}
