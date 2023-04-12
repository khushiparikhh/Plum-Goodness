package testBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebTestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public WebTestBase()
	{
		try 
		{
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"//properties//config.properties");
			//reads input bytes from the files
			prop=new Properties();
			prop.load(fileInputStream);
		}
		catch (Exception e) {
			e.printStackTrace();
			//prints this throwable and its backtrack to the standard error stream.
		}
	}
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KDP\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver =new ChromeDriver(options);
		 
		 driver.navigate().to(prop.getProperty("url"));
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.manage().deleteAllCookies();
	}
}