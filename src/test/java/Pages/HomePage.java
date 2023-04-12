package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class HomePage extends WebTestBase{
	@FindBy(id = "searchfeild")
    WebElement usersearch;
	//search text box on the initial page of the website
	
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void userSearchClick(){
        usersearch.click();
    }
	

	}
