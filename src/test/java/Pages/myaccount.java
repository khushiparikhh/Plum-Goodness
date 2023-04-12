package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utility;

public class myaccount extends WebTestBase{
	@FindBy(id = "Capa_1")
    WebElement accountTitle;
	//WebElements are found by @FindBy Annotation

    @FindBy(id = "searchfeild")
    WebElement searchTextBox;

   @FindBy(xpath = "//*[@id=\"searchModal\"]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div/div[2]/a")
    WebElement searchBtn;
    
   @FindBy(className = "title")
    WebElement searchTitle;
  
    @FindBy (xpath = "//*[@id=\"featured-collection-template--15121372938300__3db694fd-7636-4497-9460-50a299545216\"]/div/div/div/div[3]/div/a/img")
    WebElement abc;
    //dropdown1
    
    @FindBy (xpath = "//*[@id=\"shopify-section-sidebar-filter\"]/div/div[1]/div/ul/li[3]/a" )
    WebElement def;
    //Optionselection
    
    @FindBy(name = "contact[email]")
    WebElement hover;

    @FindBy(xpath = "//i[@class='fa fa-youtube-play']")
    WebElement youtubeOption;
    
    @FindBy(xpath = "//i[@class='fa fa-instagram fa-lg']")
    WebElement instagramOption;
    
    @FindBy(linkText = "careers")
    WebElement careerOption;
    
    @FindBy(xpath = "//img[@alt='Plum Goodness']")
    WebElement logoSign;
     
    public myaccount() {
        PageFactory.initElements(driver, this);
        //static initelements method of page factory class for initializing webElement
    }
    public String getTextOFMYAccountPage() {
    	return accountTitle.getText();
    }
    public void search() {
    	searchTextBox.click();
    	searchTextBox.sendKeys("15% Vitamin C Face Serum with Mandarin | For Glowing Skin | Fragrance Free | Suits all skin types | 3ml Mini");
    	searchTextBox.sendKeys(Keys.ENTER);
    	searchTextBox.click();
    	searchBtn.click();    		
    }
    
   
    public void mouseHover(){
       Utility.mouseHover(driver,hover);
    }
    
    public void scrollDownMethod() {
        Utility.scrollDownByElement(driver, youtubeOption);
        youtubeOption.click();
    }
    
    public void scrollUpMethod() {
        Utility.scrollUp(driver, logoSign);
    }

    public void windowHandle(){
       Utility.scrollDownByElement(driver, instagramOption);
        //youtubeOption.click();
         instagramOption.click();
    	//careerOption.click();
        Utility.switchToWindows(driver);
    }

   
    public void getCookiesHandle(){
        Utility.getCookies();
    }
}