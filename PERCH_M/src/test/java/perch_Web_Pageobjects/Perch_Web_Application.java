package perch_Web_Pageobjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Perch_Web_Application extends BaseClass{
	
	

	public Perch_Web_Application() // it is a constructor - the class name is similar to
    // Method name(its called as constructor)   
    {
     PageFactory.initElements(driver, this);
     
    }
	
	@FindBy(xpath = "//input[@id='outlined-basic']")
	WebElement EnterEmail;
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-root MuiLoadingButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeSmall MuiButton-containedSizeSmall mb-5 mt-5 w-3/12 p-12 sign-in-button bg-perchBlue hover:bg-perchBlue text-white py-3 px-4 rounded-lg css-ie9c7w-MuiButtonBase-root-MuiButton-root-MuiLoadingButton-root']")
	WebElement ClickonSignin;
	
	
	
	
	@FindBy(xpath = "//div[@class='XG5Jd JtO0E']") 
	WebElement clickoninboxmail;
	  
	  
	@FindBy(xpath = "//a[@target='_blank']") 
	WebElement Openperchbutton;
	
	
	// groupIcon
	  
	 @FindBy (xpath = "//*[@data-testid='GroupsOutlinedIcon']")
	 WebElement WebGroupicon;
	 
	 // create groupbutton
	 @FindBy (xpath = "//button[contains(text(),'Create Group')]")
	 WebElement CreateGroup;
	 
	 @FindBy (xpath = "//input[@id='grid-group-name']")
	 WebElement EntergroupName;
	 
	 @FindBy (xpath = "//textarea[@id='grid-group-description']")
	 WebElement EntergroupDescription;
	 
	 @FindBy (xpath = "//button[contains(text(),'Cancel')]")
	 WebElement Cancelbutton;
	 
	 @FindBy (xpath = "//button[@type='submit']")
	 WebElement Groupcreate;
	 
		/*
		 * Execute JavaScript to scroll up the page
		 * driver.execute_script("window.scrollTo(0, -document.body.scrollHeight);")
		 */
	 // click on group cards
	 @FindBy (xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]")
	 WebElement GroupCard;
	 
	 @FindBy (xpath = "//button[contains(text(),'Create Role')]")
	 WebElement CreateRolebutton;
	 
	 @FindBy (xpath = "//input[@id='grid-role-name']")
	 WebElement EnterRoleName;
	 
	 @FindBy (xpath = "//textarea[@id='grid-role-description']")
	 WebElement EnterroleDescription;
	 
	 @FindBy (xpath = "//button[contains(text(),'Cancel')]")
	 WebElement CancelRole;
	 
	 @FindBy (xpath = "//button[@type='submit']")
	 WebElement CreateRole;
	 
	 
	 // create Branch & Location
	 
	 @FindBy(xpath = "//*[@data-testid='FmdGoodOutlinedIcon']") WebElement locationIcon;
	 
	 public void IconLocation() {
		 
		 Set<String> newwindow =driver.getWindowHandles();
		  
		  Iterator it =newwindow.iterator();
		  
		  String parentId=(String) it.next(); 
		  
		  String childID=(String) it.next();
		  
		  driver.switchTo().window(childID);
		 
		 
		 locationIcon.click();
	 }
	 
	 
	 @FindBy(xpath = "//*[contains(text(),'Add Location')]") WebElement addlocationB;
	 
	 public void AddlocationBu() {
		 
		 addlocationB.click();
	 }
	 
	 
	 @FindBy(xpath = "//*[@id='grid-group-name']") WebElement Enterlocationname;
	 
	 public void LocationNmae(String L) {
		 
		 Enterlocationname.sendKeys(L);
	 }
	 
	 
	 @FindBy(xpath = "//*[@type='submit']") WebElement locationadd;
	 
	 public void AddLocationB() {
		 
		 locationadd.click();
		 
		//sgfcgfc
	 }
	 
	 
	 @FindBy(xpath = "//*[contains(text(),'Testing Demo')]") WebElement clickonlocationcard;
	 
	 public void Locationcard() {
		 
		 clickonlocationcard.click();
	 }
	 
	 
	 @FindBy(xpath = "(//button[contains(text(),'+ Add Branch')])[4]")WebElement clickonaddbranchicon;
	 
	 public void AddBranchicon() {
		 
		 clickonaddbranchicon.click();
		 
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-branchName']")WebElement branchname;
	 
	 public void BranchnameEnter(String BN) {
		 
		 branchname.sendKeys(BN);
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-branchAddress.address1']")WebElement addressline1;
	 
	 public void EnterAddressline1(String AD1) {
		 
		 addressline1.sendKeys(AD1);
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-branchAddress.address2']")WebElement addressline2;
	 
	 public void EnterAddressline2(String AD2) {
		 
		 addressline2.sendKeys(AD2);
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-branchAddress.city']")WebElement cITYname;
	 
	 public void EnterCityname(String CN) {
		 
		 cITYname.sendKeys(CN);
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-branchAddress.state']")WebElement statename;
	 
	 public void EnterStateNema(String SN) {
		 
		 statename.sendKeys(SN);
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-branchAddress.country']")WebElement countryname;
	 
	 public void Entercountryname(String CN) {
		 
		 countryname.sendKeys(CN);
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-branchAddress.pincode']")WebElement pincodeno;
	 
	 public void Enterpicode(String PN) {
		 
		 pincodeno.sendKeys(PN);
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-branchEmail']")WebElement branchemail;
	 
	 public void EnterBrachemail(String EM) {
		 
		 branchemail.sendKeys(EM);
		
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-branchContactNumber']")WebElement contactnumber;
	 
	 public void EnterContactno(String EP) {
		 
		 contactnumber.sendKeys(EP);
	 }
	 
	 
	 @FindBy(xpath = "//button[@type='submit']")WebElement addbranch;
	 
	 public void AddBranchB() {
		 
		 
		 addbranch.click();
		 
	 }
		
	 // Finding users by group vaise & edit user
	 
	 @FindBy (xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/div/div[1]/div[1]")
	 WebElement Clickonrolename;
	 
	 @FindBy (xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div[2]/div/div/div[1]/div[2]")
	 WebElement Clickonrolemail;
	 
	 @FindBy (xpath = "//*[contains(text(),'Edit Details')]")
	 WebElement EditUser;
	 
	 @FindBy (xpath = "//button[contains(text(),'Cancel')]")
	 WebElement Cancelusers;
	 
	 @FindBy(xpath = "//button[contains(text(),'Update')]") WebElement updateuser;
		
		  public void Updateusers() {
			  
			  updateuser.click();
		  }
		 
	 
	 
	 @FindBy(xpath = "//*[@data-testid='AddIcon']")
	WebElement Addusers;
		
		@FindBy(xpath = "//input[@id='grid-first-name']")
		WebElement FullName;
		
		@FindBy(xpath = "//input[@id='grid-last-name']")
		WebElement EnterEMPId;
		
		@FindBy(xpath = "//input[@id='grid-zip']")
		WebElement Entermail;
		
		@FindBy (xpath = "//select[@id='grid-gender']") WebElement selectgender;
		  
		  @FindBy (xpath = "//option[@value='MALE']") WebElement clickMale;
		  
		  @FindBy (xpath = "//select[@id='grid-group']") WebElement selectgroup;
		  
		  @FindBy (xpath = "//option[contains(text(),'Software consultant')]") WebElement clickgroup;
		  
		  @FindBy (xpath = "//select[@id='grid-role']") WebElement selectrole;
		  
		  @FindBy (xpath = "//option[contains(text(),'Fullstack developer')]") WebElement clickrole;
		  
		  @FindBy (xpath = "//select[@id='grid-location']") WebElement selectlocation;
		  
		  @FindBy (xpath = "//option[contains(text(),'Hyderabad')]") WebElement clicklocation;
		  
		  @FindBy (xpath = "//input[@id='grid-dob']") WebElement DOB;
		  
		
		  
		  @FindBy (xpath = "//select[@id='grid-branch']") WebElement selctbranch;
		  
		  @FindBy (xpath = "//option[contains(text(),'madhapur')]") WebElement clickbranch;
		  
		  @FindBy(xpath = "//input[@id='grid-doj']") WebElement DOJ;
		  
		  @FindBy(xpath = "//*[@type='submit']") WebElement Adduser;
		  
		 
		
	
	public void Mailw(String m) {
		
		EnterEmail.sendKeys(m);
		
		System.out.println("Enter valid mail");
	}
	
	public void Signin(){
		
		ClickonSignin.click();
		
		System.out.println("Click on Sign-in");
		
	}
	
	public void AddUser() {
		
		
		  Set<String> newwindow =driver.getWindowHandles();
		  
		  Iterator it =newwindow.iterator();
		  
		  String parentId=(String) it.next(); 
		  
		  String childID=(String) it.next();
		  
		  driver.switchTo().window(childID);
		 
		Addusers.click();
	}
	
	
	
	public void EnterFullName(String N) {
		
		FullName.sendKeys(N);
		
	}
	 
	public void EnterEMPId(String Emp) {
		
		EnterEMPId.sendKeys(Emp);
	}
	
	public void EntermailU(String Mail) {
		
		Entermail.sendKeys(Mail);
	}


	public void Selectgenderu() {
		
		selectgender.click();
		
		clickMale.click();
	}
	
	public void SelectgroupS() {
		
		selectgroup.click();
		
		clickgroup.click();
	}
	
	public void SelectroleT() {
		
		selectrole.click();
		
		clickrole.click();
		
	}
	
	public void SelectlocationH() {
		
		selectlocation.click();
		
		clicklocation.click();
	}
	
	public void EnterDOBU(String B) {
		
		DOB.sendKeys(B);
		
	}
	
	public void SelctbranchM() {
		
		selctbranch.click();
		
		clickbranch.click();
	}
	
	public void DOJU(String j) {
		
		DOJ.sendKeys(j);
	}
	
	public void AdduserL() {
		
		Adduser.click();
	}
	
	
	  public void Emailoutlook() {
		  clickoninboxmail.click(); }
	  
	  public void Openperch() {
		  Openperchbutton.click(); }
	  
	  public void GroupIconweb() {
		  
		  Set<String> newwindow =driver.getWindowHandles();
			
			Iterator it =newwindow.iterator();
			
			String parentId=(String) it.next();
			String childId=(String) it.next();
			
			 
			driver.switchTo().window(childId);
			
			WebGroupicon.click();
		 
	  }
	  public void GroupScroleorclick() {
		  
		  
		  
		 // Execute JavaScript to scroll up the page
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,550)", "");
		  
		  CreateGroup.click();
	  }
	  
	  public void GroupEntername(String Group) {
		  
		  EntergroupName.sendKeys(Group);
		  
	  }
	  
	  public void DescriptionGroup(String Description) {
		  
		  EntergroupDescription.sendKeys(Description);
		  
	  }
	  
	  public void ButtonCancel() {
		  
		  Cancelbutton.click();
		  
	  }
	  
	  public void Buttoncreate() {
		  
		  Groupcreate.click();
	  }
	  
	  public void CardGroup() {
		  
		  GroupCard.click();
	  }
	  
	  public void AddRolebutton() {
		  
		  CreateRolebutton.click();
	  }
	 
	  public void Rolename(String RoleName) {
		  
		  EnterRoleName.sendKeys(RoleName);
	  }
	
	  public void RoleDescription(String enterdescription){
		  
		  EnterroleDescription.sendKeys( enterdescription);
		  
	  }
	
	  public void CancelRolebutton() {
		  CancelRole.click();
	  }
	  
	  public void CreateRoleButton() {
		  CreateRole.click();
	  }
	  
	  public void ClickOnroleName() {
		  
		  Clickonrolename.click();
	  }
	  
	  public void ClickOnRoleEmail() {
		  
		  Clickonrolemail.click();
		  
	  }
	  
	  public void EdittheUser() {
		  
		  EditUser.click();
		  
	  }
	  
	  public void Editcancel() {
		  
		  Cancelusers.click();
		  
	  }
	  
	  

}
