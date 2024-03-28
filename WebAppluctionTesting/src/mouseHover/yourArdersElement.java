package mouseHover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class yourArdersElement {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "./browsers/geckodriver.exe");
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		String YourOrderApplication="http://amazon.in";
		
	    //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get(YourOrderApplication);
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		
		//id="nav-link-accountLis"-Hello SignIn element property
		
		By HelloSignInLocator=By.xpath("//a[@id='nav-link-accountList']");
		WebElement helloSignIn=driver.findElement(HelloSignInLocator);
		String text= helloSignIn.getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		//mouse Hover Operation be performed on "Hello SignIn"Elment
		
		
		Actions helloSignInAction=new Actions(driver);
		helloSignInAction.moveToElement(helloSignIn).build().perform();
		Thread.sleep(2000);
		
		//your orders element Test
		// Locater-LinkText
		//selector- your Orders
		By yourOrderslocator=By.linkText("Your Orders");
		WebElement yourOrders=driver.findElement(yourOrderslocator);
		
		yourOrders.click();
		
		String text2= yourOrders.getText();
		System.out.println(text2);
	} 

}
