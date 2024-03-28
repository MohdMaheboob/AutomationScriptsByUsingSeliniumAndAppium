package perch_pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import perch_TestCasess.BaseClass_Perch;

public class Perch_Sprint_1  extends BaseClass_Perch {

	 

	public Perch_Sprint_1() {

	
		PageFactory.initElements(driver, this);
		
		
	}

	//android.widget.TextView[@text="Skip" and @class="android.widget.TextView"]


	
    // //android.widget.TextView[@text="Skip"]

	@AndroidFindBy(xpath = "")
	WebElement Skip;
	

	  // //android.view.ViewGroup[@content-desc="Next"]
	  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Next\"]/com.horcrux.svg.SvgView") 
	  WebElement Next;
	 

	

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Prev\"]")
	WebElement Prev;

	

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Next\"]")
	WebElement firstNext;

	

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Next\"]")
	WebElement Nextsecond;

	

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Lets Get Started\"]")
	WebElement LetsGetsStarted;

	

	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Your Email Address\"]")
	WebElement emailfield;

	

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Sign In\"]")
	WebElement SignIn;
	
	//Home Page Functionality
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")
	WebElement SwiptoCheck;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]")
	WebElement SwiptoCheckOut;
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	WebElement HolidyasScroll;
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")
	WebElement BirthdaysANDAnniversaries;
	
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"See more\"])[1]")
	WebElement HolidaysSeeMore;
	
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"See more\"])[2]")
	WebElement BirthdaysANDAnniversariesSeeMore;
	
	
	@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"MyProfile\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]")
	WebElement MyProfile;
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	WebElement FabButton;
	
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.google.android.providers.media.module:id/icon_thumbnail\"])[3]")
	WebElement photo;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Personal Info\"]")
	WebElement PersonalInfo;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Contact Info\"]")
	WebElement ContactInfo;
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"9797979464\"]")
	WebElement EnterNumber;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Update\"]")
	WebElement Updatedbutton;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Address Info\"]")
	WebElement AddressInfo;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Address Line 1\"]/android.view.ViewGroup")
	WebElement Address1;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Address Line 2\"]/android.view.ViewGroup")
	WebElement Address2;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"City\"]/android.view.ViewGroup")
	WebElement City;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"State/Province\"]/android.view.ViewGroup")
	WebElement State;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Postal Code\"]/android.view.ViewGroup")
	WebElement Pincod;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Country\"]/android.view.ViewGroup")
	WebElement Country;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Next\"]")
	WebElement NextButton;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Same as permanent address\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
	WebElement CheckBox;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Address Line 1\"]/android.view.ViewGroup")
	WebElement Address11;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Address Line 2\"]/android.view.ViewGroup")
	WebElement Address22;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"City\"]/android.view.ViewGroup")
	WebElement City1;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"State/Province\"]/android.view.ViewGroup")
	WebElement State1;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Postal Code\"]/android.view.ViewGroup")
	WebElement Pincod1;
	
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Country\"]/android.view.ViewGroup")
	WebElement Country1;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Update\"]")
	WebElement UpdateButton;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	WebElement PersnonalInfoBack;
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	WebElement MyprofilBack;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Feed\"]")
	WebElement Feed;
	
	
	//(//android.view.ViewGroup[@content-desc="Like"])[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]
	// //android.view.ViewGroup[@content-desc="Like"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]
	// //android.view.ViewGroup[@content-desc="Like"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]
	//(//android.view.ViewGroup[@content-desc="Like"])[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]
	//(//android.view.ViewGroup[@content-desc="Like"])[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView
	
//	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Like\"])[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]")
//	WebElement LikeIcon1;
	
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Like\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]")
	WebElement LikeIcon2;
	
	
//	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Like\"])[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]")
//	WebElement UnLike1;
	
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Like\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]")
	WebElement UnLike2;
	
	
	@FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Comment\"])[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
	WebElement Comments;
	
	@FindBy(xpath = "//android.widget.EditText[@text=\"Add your comment\"]")
	WebElement AddyourCommetText;
	
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]")
	WebElement SendButton;
	
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	WebElement PostBack;
	
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/com.horcrux.svg.SvgView")
	WebElement FeedFabButton;
	
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	WebElement Cancel;
	
	
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/com.horcrux.svg.SvgView")
	WebElement FeedFabButton1;
	
	
	
	@FindBy(xpath = "//android.widget.EditText[@text=\"What's on your mind?\"]")
	WebElement Adddtext;
	
	
	@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	WebElement PostButton;
	
	
	
	
	
	
	
	
	
	
	
	
	

	// Objects
	
     public void Perch_Skip() throws InterruptedException {
		
	
		try {
			Skip.click();
		}catch( NullPointerException e) {
			System.out.println(e);
			
		}
		
		driver.navigate().back();

	}
	
	
     public void Nextbutton1() {

 		//Next.click();

 		
 	}
     
     
     public void Perch_Prev() {

 		Prev.click();
 		System.out.println("click on prev button");
 	}
     
     
     public void Nextbutton2() {

 		firstNext.click();
 		System.out.println("click next button");

 	}
     
     public void Nextsecondbutton() {

 		Nextsecond.click();

 		System.out.println("click on next button");
 	}
     
     public void LetsGetsStarted() {

 		LetsGetsStarted.click();
 		System.out.println("click on lets gets");
 	}
     
     public void Email(String Email) {

 		emailfield.sendKeys(Email);
 		System.out.println("Enter email");
 	}
     
     public void Siginbutton() {
 		
 		
 		SignIn.click();
 		System.out.println("click on sign in button");
 	}
   
     // Home page
     
     public void SwiptoCheckIn() {
    	 
    	
    	 
    	 
    	 // Perform swipe gesture from one point to another
    	 
    	 TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
    	 touchAction.longPress(PointOption.point(100, 500)).moveTo(PointOption.point(100, 200)).release().perform();
                    
         SwiptoCheck.click();
                    
    	 
     }
     
	public void SwiptoCheckOuT() {
		
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		touchAction.longPress(PointOption.point(100, 500)).moveTo(PointOption.point(100, 200)).release().perform();
		
		
		
		
         SwiptoCheckOut.click();
	}
	
	
	
	public void HolidyasScrolL() {
		
		
		
		
		
		 // Perform scroll gesture
        int startX = driver.manage().window().getSize().width / 2;
        int startY = driver.manage().window().getSize().height * 4 / 5;
        int endY = driver.manage().window().getSize().height / 5;

        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        touchAction.press(PointOption.point(startX, startY))
                   .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                   .moveTo(PointOption.point(startX, endY))
                   .release()
                   .perform();
        
        HolidyasScroll.click();
		
	}
	
	


     public void BirthdaysANDAnniversariesscrolL() {
		
    	 
    	 
    	 // Perform scroll gesture
         int startX = driver.manage().window().getSize().width / 2;
         int startY = driver.manage().window().getSize().height * 4 / 5;
         int endY = driver.manage().window().getSize().height / 5;
         TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
         touchAction.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();
         
         BirthdaysANDAnniversaries.click();
    	 
	    }

     public void HolidaysSeeMorE() {
    	 
    	 HolidaysSeeMore.click();
    	 
    	 // Perform scroll gesture
         int startX = driver.manage().window().getSize().width / 2;
         int startY = driver.manage().window().getSize().height * 4 / 5;
         int endY = driver.manage().window().getSize().height / 5;

         TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
         touchAction.press(PointOption.point(startX, startY))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();
 		
	    }
     
     
     public void BirthdaysANDAnniversariesSeeMore() {
 		
	    }
     
     public void MyProfile() {
 		
	    }
     
     public void FabButton() {
 		
	    }
     
     public void photo() {
 		
	    }
     
     public void PersonalInfo() {
 		
	    }
     
     
     public void ContactInfo() {
 		
	    }
     
     
     public void EnterNumber() {
 		
	    }
     
     
     public void Updatedbutton() {
 		
	    }
     
     
     public void AddressInfo() {
 		
	    }
     
     
     public void Address1() {
 		
	    }
     
     
     public void Address2() {
 		
	    }
     
     
     public void City() {
 		
	    }
     
     public void  State() {
 		
	    }
     
     public void Pincod() {
 		
	    }
     
     public void Country() {
 		
	    }
     
     public void NextButton() {
 		
	    }
     
     public void CheckBox() {
 		
	    }
     
     public void Address11() {
 		
	    }
     
     public void Address22() {
 		
	    }
     
     public void City1() {
 		
	    }
     
     public void State1() {
 		
	    }
     
     public void Pincod1() {
 		
	    }
     
     public void Country1() {
 		
	    }
     
     public void UpdateButton() {
 		
	    }
     
     public void PersnonalInfoBack() {
    	 
     }
     public void MyprofilBack () {
    	 
     }
     
     public void Feed() {
 		
	    }
     
     public void LikeIcon2() {
 		
	    }
     
     public void UnLike2() {
 		
	    }
     
     public void Comments() {
 		
	    }
     
     public void AddyourCommetText() {
 		
	    }
     
     public void SendButton() {
 		
	    }
     
     public void PostBack() {
  		
	    }
     
    
     
     public void FeedFabButton() {
  		
	    }
     
     public void Cancel() {
  		
	    }
     
     public void FeedFabButton1() {
  		
	    }
     
     public void Adddtext() {
  		
	    }
     
     public void PostButton() {
  		
	    }


}
