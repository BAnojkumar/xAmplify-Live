package pom.xamplifylive.xamplifylive;

import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PartnerLogin {

	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile.readPropertyFile("datafile.properties");
	
@Test(priority=0)
	public void partner_login() throws InterruptedException
	{
	
	driver.manage().window().maximize();
	driver.get("https://release.xamplify.io/");
	driver.findElement(By.xpath("//*[@id=\"bs-navbar-collapse-1\"]/ul[2]/li[1]/a")).click();
	
Thread.sleep(5000);

	WebElement usernameElement = driver.findElement(By.name("username")); 
	WebElement passwordElement = driver.findElement(By.name("password"));
	usernameElement.sendKeys("gayatrialla11@gmail.com");
	passwordElement.sendKeys("Xamplify@11");
Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='submitBitton']")).click();
	}

@Test(priority=1,enabled=false)
	public void partner_campaigns() throws InterruptedException
	{
Thread.sleep(10000);	
	WebElement ele=driver.findElement(By.xpath("//body[@class='login page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid page-sidebar-closed-hide-logo']/app-root[@ng-version='4.3.6']/app-home/div[@class='page-container']/app-leftsidebar/div[@class='page-sidebar-wrapper']/div[@class='page-sidebar navbar-collapse collapse']/ul[@class='page-sidebar-menu page-sidebar-menu-hover-submenu']/li[3]/a[1]")); 	
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[@href='/home/campaigns/partner/all']")).click();
	}

@Test(priority=2,enabled=false)
	public void redistribute() throws InterruptedException
	{
Thread.sleep(5000);
	driver.findElement(By.xpath("//tbody//tr[1]//td[5]//div[1]//a[2]//i[1]")).click();
Thread.sleep(5000);	
	driver.findElement(By.xpath("//a[@class='pull-right btn btn-primary btn-sm']")).click();
Thread.sleep(5000);
	WebElement Sub=driver.findElement(By.xpath("//input[@id='subjectLine']"));
Thread.sleep(3000);	
	Sub.clear();
	Sub.sendKeys("Vendor Campaign Redistribute");
Thread.sleep(3000);
	WebElement Pre=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-edit-partner-campaigns[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/fieldset[1]/form[1]/div[5]/input[1]"));
Thread.sleep(3000);
	Pre.clear();
	Pre.sendKeys("Automated");
Thread.sleep(3000);	
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-edit-partner-campaigns[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/fieldset[1]/form[1]/div[6]/div[1]/div[1]/div[1]/div[1]/switch[1]/div[1]/div[1]/span[2]")).click();
Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-edit-partner-campaigns[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/fieldset[1]/form[1]/div[7]/div[1]/div[1]/div[1]/div[1]/switch[1]/div[1]/div[1]/span[2]")).click();
	driver.findElement(By.xpath("//div[@class='col-xs-5']//button[1]")).click();
Thread.sleep(3000);	
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-edit-partner-campaigns[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/fieldset[2]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/input[1]")).click();
	}

@Test(priority=3,enabled=false)
	public void auto_email() throws InterruptedException
	{
Thread.sleep(3000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-edit-partner-campaigns[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/div[1]/div[3]/div[2]/a[1]")).click();
Thread.sleep(4000);
	Select dropdown_sort = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-edit-partner-campaigns[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/div[1]/div[3]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/select[1]")));
	dropdown_sort.selectByVisibleText("Email is not opened");
Thread.sleep(5000);
	WebElement Sub1=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-edit-partner-campaigns[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/div[1]/div[1]/div[3]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/input[1]"));
Thread.sleep(3000);
	Sub1.clear();
	Sub1.sendKeys("Auto Response Email");
Thread.sleep(4000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']")));
	driver.findElement(By.xpath("html/body")).click();
	driver.switchTo().activeElement().sendKeys("Hello Test!");

	driver.switchTo().defaultContent();
Thread.sleep(3000);	
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-edit-partner-campaigns[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/fieldset[1]/div[2]/div[1]/button[2]")).click();

	}
}



