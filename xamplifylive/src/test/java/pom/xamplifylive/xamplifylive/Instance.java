package pom.xamplifylive.xamplifylive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Instance {

public static WebDriver driver;

  public static WebDriver getInstance()
  {
    if (driver == null) 
    {
    	
    	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver2.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("use-fake-ui-for-media-stream"); 
    	driver = new ChromeDriver(options);
    	
    }
    return driver;
  }
}
