package selenium_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Infinty {
	WebDriver driver;

	
	//public static void main(String[] args) throws InterruptedException {
		
		@BeforeTest
		public void setup() {
		
		//System.setProperty("webdriver.gecko.driver","./browsers/geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\WebAppluctionTesting\\driver\\chromedriver.exe");

		
	    String Applicationurl="https://infinitylearn.com/";
	    
	   // driver=new FirefoxDriver();
	    
	   driver=new ChromeDriver();
	    
	    driver.get(Applicationurl);
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		}
		@Test(priority=1)
		public void PerformStudy() throws InterruptedException {
	    // in the Application find the locator
	    By StudyMaterialLocator= By.xpath("//a[@id='navbarDropdownMenuLink']");
	    
	    WebElement Study= driver.findElement(StudyMaterialLocator);
	    
	    String Text=Study.getText();
	    System.out.println("the Locatore text is:-"+Text);
	    
	    Actions StudyMaterialAction=new Actions(driver);
	    StudyMaterialAction.moveToElement(Study).build().perform();
	    Thread.sleep(4000);

		}
	    @Test(priority=2)
		public void ClickintheJEE () {
	    
       By JEEMainLocator= By.xpath("//a[text()='JEE Main']");
	    
	    WebElement JEEMain= driver.findElement(JEEMainLocator);
	    JEEMain.click();
	    
	    String JEEText=JEEMain.getText();
	    System.out.println("The Locatore Text is:-"+JEEText);
	    
	    driver.navigate().back();

	    }
	    
		
	    @Test(priority=3)
	    public void  PerformCOURSES() throws InterruptedException {
	    	
	    	  By COURSESLocator= By.xpath("//a[text()=' COURSES ']");
	  	    
	  	    WebElement COURSES= driver.findElement(COURSESLocator);
	  	    
	  	    String COURSESText=COURSES.getText();
	  	    System.out.println("the Locatore text is:-"+COURSESText);
	  	    Thread.sleep(2000);
	  	    
	  	    Actions StudyMaterialAction=new Actions(driver);
	  	    StudyMaterialAction.moveToElement(COURSES).build().perform();
	  	  Thread.sleep(6000);
	    
	    }
	    
	    
	    @Test(priority=4)
	    public void ClickNeet() throws InterruptedException {
	    	
	    	
	    	 By NeetLocator= By.xpath("//a[text()=' NEET ']");
	 	    
	 	    WebElement NEET= driver.findElement(NeetLocator);
	 	   Thread.sleep(6000);
	 	    NEET.click();
	 	   
	 	    
	 	    String NEEText=NEET.getText();
	 	    System.out.println("The Locatore Text is:-"+NEEText);
	 	   // driver.navigate().back();

	    	
	    
	    }
	    @Test(priority=5)
	    public void GoToTHeheme() throws InterruptedException {
	    	
	    	
	    	 By HomeLocator= By.xpath("//a[text()=' NEET ']");
		 	    
		 	    WebElement Home= driver.findElement(HomeLocator);
		 	  // Thread.sleep(6000);
		 	    Home.click();
		 	   
		 	    
		 	    String HomeText=Home.getText();
		 	    System.out.println("The Locatore Text is:-"+HomeText);
		 	    driver.navigate().back();
	    	
	    }
	     
	    @AfterTest
	    public void teardown() {
	    	
	    
	    driver.quit();

		
	}
	}