package com.Infionic_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Infionic_Automation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./browsers/geckodriver.exe");

		WebDriver driver;

		String Appilcatin = "https://ies-hrms.azurewebsites.net/";

		driver = new FirefoxDriver();

		// Delete the Cookies
		driver.manage().deleteAllCookies();

		// Tacking the time to page load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Manage the time
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get(Appilcatin);

		// Navigating the Infionic Application

		By UserNameLocator = By.id("UserName");

		WebElement UserName = driver.findElement(UserNameLocator);

		UserName.sendKeys("21461");

		By PasswordLocator = By.id("Password");

		WebElement Password = driver.findElement(PasswordLocator);

		Password.sendKeys("Demo@123");

		// Clicking the logout button

		By btnLogInLocator = By.xpath("//input[@id='btnLogIn']");

		WebElement btnLogIn = driver.findElement(btnLogInLocator);

		btnLogIn.click();

		// Action the menuIcon

		By menuIconLocator = By.xpath("//div[@class='menuIcon']");
		WebElement menuIcon = driver.findElement(menuIconLocator);

		Actions menuIconAction = new Actions(driver);
		menuIconAction.moveToElement(menuIcon).build().perform();
		// Thread.sleep(1000);

		// clicking the Dashboard Locator

		By DashboardLocator = By.xpath("//div[text()='Dashboard']");

		WebElement Dashboard = driver.findElement(DashboardLocator);
		Thread.sleep(4000);

		Dashboard.click();

		// Navigating back

		// driver.navigate().back();

		// Action the menuIcon

		By menuIconLocator1 = By.xpath("//div[@class='menuIcon']");
		WebElement menuIcon1 = driver.findElement(menuIconLocator1);

		Actions menuIconAction1 = new Actions(driver);
		menuIconAction1.moveToElement(menuIcon1).build().perform();
		// Thread.sleep(1000);

		// clicking the HR Locator

		By menuNameLocator = By.xpath("//div[text()='HR']");

		WebElement menuName = driver.findElement(menuNameLocator);
		Thread.sleep(4000);

		menuName.click();
		//System.out.println("manu icon clicked");
		//// div[text()='Employee']

//		By EmployeeLocator = By.xpath("//div[text()='Employee']");
//		WebElement Employee = driver.findElement(EmployeeLocator);
//		thread.
//		
		
		try {
			 driver.findElement(By.xpath("//div[text()='Payroll']")).click();
			 Thread.sleep(5000);
			 
			 
			System.out.println("Payroll clicked");
			}catch(Exception e) {
				System.out.println("Exception :"+e);
				
			}
		try {
			 driver.findElement(By.xpath("//div[text()='Employee']")).click();
			 
			System.out.println("Emplayee clicked");
			}catch(Exception e) {
				System.out.println("Exception :"+e);
				
			}
		
		 
		 
		

		//driver.navigate().back();

		
		  By PayrollLocator=By.xpath("//div[text()='Payroll']"); WebElement
		  payroll=driver.findElement(PayrollLocator); payroll.click();
		  
		  driver.navigate().back();
		  
		  
		  By LeavesLocator=By.xpath("//div[text()='Leaves']"); WebElement
		  Leaves=driver.findElement(LeavesLocator); Leaves.click();
		  
		  driver.navigate().back();
		  
		  
		  By ReportsLocator=By.xpath("//div[text()='Reports']"); WebElement
		  Reports=driver.findElement(ReportsLocator); Reports.click();
		  
		  driver.navigate().back();
		  
		  
		  By PositionLocator=By.xpath("//div[text()='Positions']"); WebElement
		  Position=driver.findElement(PositionLocator); Position.click();
		  
		  driver.navigate().back();
		  
		  
		  By VacancyLocator=By.xpath("//div[text()='Vacancy']"); WebElement
		  Vacancy=driver.findElement(VacancyLocator); Vacancy.click();
		  
		  driver.navigate().back();
		  
		  By CompensatoryLocator=By.xpath("div[text()='Compensatory Off']"); WebElement
		  Compensatory=driver.findElement(CompensatoryLocator); Compensatory.click();
		  
		  driver.navigate().back();
		  
		  
		  By CompenentLocator=By.xpath("//div[text()='Component Configuration']");
		  WebElement Compenent=driver.findElement(CompenentLocator); Compenent.click();
		  
		  driver.navigate().back();
		  
		  
		  By HeadofdeportmentLocator=By.xpath("//div[text()='Head Of Department']");
		  WebElement Headofdeportment=driver.findElement(HeadofdeportmentLocator);
		  Headofdeportment.click();
		  
		  driver.navigate().back();
		  
		  
		  By HolidaysLocator=By.xpath("//div[text()='Holidays']"); WebElement
		  Holidays=driver.findElement(HolidaysLocator); Holidays.click();
		  
		  driver.navigate().back();
		  
		  
		  By BiometricLocator=By.xpath("//div[text()='Biometric']"); WebElement
		  Biometric=driver.findElement(BiometricLocator); Biometric.click();
		  
		  driver.navigate().back();
		  
		  
		  
		  By EmpPermissionsLocator=By.xpath("//div[text()='Employee Permissions']");
		  WebElement EmpPermissions=driver.findElement(EmpPermissionsLocator);
		  EmpPermissions.click();
		  
		  driver.navigate().back();
		  
		  
		  
		  By ManageshiftwkofLocator=By.xpath("//div[text()='Manage shift - weekoff']");
		  WebElement Manageshiftwkof=driver.findElement(ManageshiftwkofLocator);
		  Manageshiftwkof.click();
		  
		  driver.navigate().back();
		  
		  By SalaryAdvncLocator=By.xpath("//div[text()='Salary Advance']"); WebElement
		  SalaryAdvnc=driver.findElement(SalaryAdvncLocator); SalaryAdvnc.click();
		  
		  driver.navigate().back();
		  
		  
		  
		  By ImportantClientdLocator=By.xpath("//div[text()='Import Client Data']");
		  WebElement ImportantClientd=driver.findElement(ImportantClientdLocator);
		  ImportantClientd.click();
		  
		  driver.navigate().back();
		  
		  
		  By AdminLocator=By.xpath("//div[text()='Admin']"); WebElement
		  Admin=driver.findElement(AdminLocator); Admin.click();
		  
		  driver.navigate().back();
		 

		// driver.quit();

	}

}
