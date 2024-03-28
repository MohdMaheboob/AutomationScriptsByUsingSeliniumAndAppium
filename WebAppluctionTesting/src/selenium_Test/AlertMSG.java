package selenium_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertMSG {
	
	
	public static void main(String[] args) {
		
		 WebDriver driver;
			
			String Applicationurl="https://www.selenium.dev/documentation/webdriver/interactions/alerts/";
			
			System.setProperty("webdriver.gecko.driver", "./browsers/geckodriver.exe");
			
			
			driver=new FirefoxDriver();
			
			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			
			driver.get(Applicationurl);
			
			
			//to click on "see an example alert" link
			driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/p[2]/a")).click();
			//Thread.sleep(5000);

			//to read msg from alert
			String msg=driver.switchTo().alert().getText();
			System.out.println(msg);
			//Thread.sleep(4000);

			//to close popup
			driver.switchTo().alert().accept();
			//Thread.sleep(5000);

			//to click on "see a sample confirm"
			driver.findElement(By.linkText("See a sample confirm")).click();
			
			/*
			//to read msg from alert
					String PopUp=driver.switchTo().alert().getText();
					System.out.println(PopUp);
					//Thread.sleep(4000);
					
					driver.switchTo().alert().accept();

	*/
			
		
		
		
	}

}
