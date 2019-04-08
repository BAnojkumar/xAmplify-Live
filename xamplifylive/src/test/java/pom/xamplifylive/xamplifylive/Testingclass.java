package pom.xamplifylive.xamplifylive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Testingclass {

public static void main(String[] args) throws InterruptedException, Throwable {
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("user-data-dir=/path/to/the/saved/profileDir");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver2.exe");
		WebDriver driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
		driver.get("https://release.xamplify.io/");
Thread.sleep(4000);		
		driver.findElement(By.xpath("//a[@class='loginTF']")).click();
Thread.sleep(4000);
		
		WebElement usernameElement = driver.findElement(By.name("username")); 
		WebElement passwordElement = driver.findElement(By.name("password"));
		usernameElement.sendKeys("anojkumarbedadha55@gmail.com");
		passwordElement.sendKeys("Xamplify@11");
		driver.findElement(By.id("submitBitton")).click();

Thread.sleep(5000);
		
		WebElement ele7=driver.findElement(By.xpath("//a[@href='javascript:;']//i[@class='fa fa-cloud-upload']"));//hover_uploadcontent
		Actions act6=new Actions(driver);
		act6.moveToElement(ele7).perform();
		driver.findElement(By.xpath("//span[contains(text(),'Manage Videos')]")).click();

Thread.sleep(8000);
		WebElement Video_search = driver.findElement(By.xpath("//input[@placeholder='Search for a Video']")); 
		Video_search.sendKeys("Ready for Automation");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
Thread.sleep(20000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-manage-video[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/a[1]/i[1]")).click();
Thread.sleep(10000);

		Select dropdown = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-manage-video[1]/div[1]/app-edit-video[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/select[1]")));
		dropdown.selectByVisibleText("Entertainment");

		WebElement Video_Tag = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-manage-video[1]/div[1]/app-edit-video[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/tag-input[1]/div[1]/div[1]")); 
		Video_Tag.sendKeys("NewYorkCity");
		Video_Tag.sendKeys(Keys.ENTER);
 
		WebElement Edit_radio=driver.findElement(By.xpath("//input[@value='2']"));
		Edit_radio.click();

		driver.findElement(By.xpath("//input[@id='ownFileuplad']")).click();
Thread.sleep(8000);
		Runtime.getRuntime().exec("C:\\Users\\anojk\\Desktop\\thumbnail.exe"); //D:\\Selenium\\Files\\thumbnailupload.exe
Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='portlet box blue']//div[@class='col-xs-12 caption p01']")).click();
Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='bootstrap-switch bootstrap-switch-wrapper bootstrap-switch-animate bootstrap-switch-off bootstrap-switch-small']//span[@class='bootstrap-switch-label']")).click();

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-manage-video[1]/div[1]/app-edit-video[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[9]/div[1]/switch[1]/div[1]/div[1]/span[2]")).click();
Thread.sleep(5000);
		driver.findElement(By.xpath("//h4[contains(text(),'Call to Action')]")).click();
Thread.sleep(4000);
		driver.findElement(By.className("bootstrap-switch-container ng-trigger ng-trigger-statusChange")).click();
Thread.sleep(5000);	
		driver.findElement(By.xpath("//img[@id='myBtn']")).click();
Thread.sleep(8000);	
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		
}
	}
