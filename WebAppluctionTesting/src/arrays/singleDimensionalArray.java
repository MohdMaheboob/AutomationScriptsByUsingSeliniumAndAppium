package arrays;

public class singleDimensionalArray {
	public static void main(String[] args) {
		int ArrayA[] = new int [3];
		ArrayA[0]=10;
		ArrayA[1]=30;
		ArrayA[2]=12;
		System.err.println(ArrayA[2]);
			}
	}

/*
 * package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\webApplicationTestin\\Library\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("http://google.com");
		driver.navigate().to("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("laddu");
		driver.findElement(By.id("pass")).sendKeys("gfgg");
		driver.findElement(By.name("login")).click();
		
		
	}

}

 * 
 * 
 * 
 */