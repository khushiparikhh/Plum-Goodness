package testCase;

import org.testng.annotations.*;
//anotations - lines of code which control how the method below them will be executed.
import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.myaccount;
import testBase.WebTestBase;


public class TC01 extends WebTestBase {
	 Pages.myaccount  myaccount;
	HomePage homePage;
	LoginPage loginPage;
	
	public TC01()
	{
		super();
	}
	
	
    @BeforeMethod
    public void beforeMethod(){
    	//will execute prior to each method in test case
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myaccount = new Pages.myaccount();
    }
   

 @Test
    public void verifyCookiesHandle(){
         SoftAssert softAssert = new SoftAssert();
         myaccount.getCookiesHandle();
         softAssert.assertAll();
     }
     
     
     @Test
     public void verifyMouseHover(){
         SoftAssert softAssert = new SoftAssert();
         myaccount.mouseHover();
         softAssert.assertAll();
 	}
   

    @Test
    public void verifyScrollDown(){
        SoftAssert softAssert = new SoftAssert();
        myaccount.scrollDownMethod();
        softAssert.assertAll();
    }

   @Test
    public void verifyGetWindowHandle(){
        SoftAssert softAssert = new SoftAssert();
        myaccount.windowHandle();
        softAssert.assertAll();
    }

    @Test

	public void verifyScrollUp(){
	SoftAssert softAssert = new SoftAssert();
	myaccount.scrollUpMethod();
	softAssert.assertAll();
	}
    
   
   @Test
    public void verifySearchBar(){
        SoftAssert softAssert = new SoftAssert();
        myaccount.search();
        softAssert.assertAll();
    }
    
    
    @Test
    public void verifyLoginWithValidCredential(){
        SoftAssert softAssert = new SoftAssert();
        homePage.userSearchClick();
        loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        softAssert.assertAll();
    }
    
   
    
    @AfterMethod
    public void afterMethod(){
    	//will execute after each method in test case.
        driver.close();
    }
    
 
 
    
     

}
