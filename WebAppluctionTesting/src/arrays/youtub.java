package arrays;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class youtub {
	

	
	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 *  Actions addEmployeeAction=new Actions(driver);
		  
		  
		   addEmployeeAction.sendKeys(Keys.ENTER).build().perform();
		
		 * 
		 * // to initialize the browser
		 * 
		 * 
		 * 
		 * driver.get("http://youtube.com");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 * 
		 * System.setProperty("webdriver.gecko.driver","./browsers\\geckodriver.exe");
		 * 
		 * driver=new FirefoxDriver();
		 * 
		 * 
		 * //create object for search editbox
		 * 
		 * WebElement ele=driver.findElement(By.name("search_query"));
		 * 
		 * //to enter madhukarqait
		 * 
		 * ele.sendKeys("MadhukarQAIT");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * //to press enter key
		 * 
		 * 
		 * driver.findElement(By.linkText("Subscribe")).click();
		 * 
		 * driver.findElement(By.id("identifierId")).sendKeys(
		 * "mummasanimahesh23@gmail.com");
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).
		 * click();
		 */

			
			

			WebDriver driver;

			String Appilcatin = "https://www.youtube.com/";
			
			System.setProperty("webdriver.gecko.driver", "./browsers/geckodriver.exe");


			driver = new FirefoxDriver();

			// Delete the Cookies
			driver.manage().deleteAllCookies();

			// Tacking the time to page load
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Manage the time
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

			driver.get(Appilcatin);


			
			WebElement subcription=driver.findElement(By.xpath("//a[@title='Subscriptions']"));
			subcription.click();
			
			
			
			
			WebElement singIn=driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
			singIn.click();
			
			
			
			
			
			WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
			Email.sendKeys("mummasanimahesh23@gmail.com");
			
			WebElement Password=driver.findElement(By.xpath("//span[text()='Next']"));
     		Password.click();

			
			
			
			 
	}

}

/*
 * //img[@id='btnAddEmployeePosition']
 * 
 * //WebElement AddEMPPosition =
 * driver.findElement(By.xpath("//img[@id='btnAddEmployeePosition']")); //
 * //AddEMPPosition.click(); // //// input[@id='PositionName'] // //WebElement
 * AddEMPPositionName =
 * driver.findElement(By.xpath("//input[@id='PositionName']"));
 * //Thread.sleep(2000); // //AddEMPPositionName.sendKeys("HR");
 * 
 * // select[@id='PositionDivisionId']
 * 
 * //WebElement AddEMPPositionDivisionId =
 * driver.findElement(By.xpath("//select[@id='PositionDivisionId']")); //
 * //AddEMPPositionDivisionId.click(); // //// option[text()='TestDivision
 * (TD)'] // // //WebElement AddEMPPositionDivisionAPI =
 * driver.findElement(By.xpath("//option[text()='TestDivision (TD)']")); //
 * //Thread.sleep(2000); // //AddEMPPositionDivisionAPI.click();
 * 
 * 
 * 
 * WebElement AddEMPPositioninput =
 * driver.findElement(By.xpath("//input[@id='PositionDesignationId-input']"));
 * Thread.sleep(2000);
 * 
 * AddEMPPositioninput.sendKeys("ACCOUNTS (DEP012");
 * 
 * // li[text()='DIRECTOR (DSG067)']
 * 
 * WebElement AddEMPPositionDIRECTOR =
 * driver.findElement(By.xpath("//li[text()='DIRECTOR (DSG067)']"));
 * Thread.sleep(2000);
 * 
 * AddEMPPositionDIRECTOR.click();
 * 
 * WebElement AddEMPPositionPositionCode =
 * driver.findElement(By.xpath("//input[@id='PositionCode']"));
 * Thread.sleep(2000);
 * 
 * AddEMPPositionPositionCode.sendKeys("46323");
 * 
 * // input[@id='ParentId-input']
 * 
 * WebElement AddEMPPositionParentId =
 * driver.findElement(By.xpath("//input[@id='ParentId-input']"));
 * 
 * AddEMPPositionParentId.click();
 * 
 * // li[text()='GD1 (GD)']
 * 
 * WebElement AddEMPPositionParents =
 * driver.findElement(By.xpath("//li[text()='GD1 (GD)']")); Thread.sleep(2000);
 * 
 * AddEMPPositionParents.click();
 * 
 * WebElement AddEMPPositionSave =
 * driver.findElement(By.xpath("//input[@id='btnAddEditPosition']"));
 * Thread.sleep(2000);
 * 
 * AddEMPPositionSave.click();
 * 
 * Alert SaveAlertWindow = driver.switchTo().alert(); // import
 * org.openqa.selenium.Alert;
 * 
 * SaveAlertWindow.accept();
 * 
 * WebElement AddEmployeeTypeId =
 * driver.findElement(By.xpath("//select[@id='EmployeeTypeId']"));
 * 
 * AddEmployeeTypeId.click();
 * 
 * // option[text()='Intern'] WebElement AddEMPIntern =
 * driver.findElement(By.xpath("//option[text()='Intern']"));
 * Thread.sleep(2000);
 * 
 * AddEMPIntern.click();
 * 
 * WebElement AddEMPStatusId =
 * driver.findElement(By.xpath("//select[@id='StatusId']"));
 * 
 * AddEMPStatusId.click();
 * 
 * WebElement AddEMPTrainee =
 * driver.findElement(By.xpath("//option[text()='Trainee']"));
 * Thread.sleep(2000);
 * 
 * AddEMPTrainee.click();
 * 
 * WebElement AddEMPDOB =
 * driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']"));
 * Thread.sleep(2000);
 * 
 * AddEMPDOB.sendKeys("12/10/2023");
 * 
 * WebElement AddEMPJDate =
 * driver.findElement(By.xpath("//input[@id='DateOfJoin_JDate']"));
 * Thread.sleep(2000);
 * 
 * AddEMPJDate.sendKeys("1/9/2023");
 * 
 * // *[@id="PFEligible"] //*[@id="PFEligible"] WebElement AddEMPIsSystemUser =
 * driver.findElement(By.xpath("//*[@id=\"IsSystemUser\"]"));
 * Thread.sleep(2000);
 * 
 * AddEMPIsSystemUser.click();
 */
