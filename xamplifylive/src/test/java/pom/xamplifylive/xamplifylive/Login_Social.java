package pom.xamplifylive.xamplifylive;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login_Social {
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("datafile.properties");
	
@Test(priority=1)
	public void homePage() throws InterruptedException
	{

		driver.manage().window().maximize();
		driver.get(properties.getProperty("Baseurl")); 								
		driver.findElement(By.className(properties.getProperty("Loginclick1"))).click();
	}

@Test(priority=2,enabled=false)
	public void facebook() throws InterruptedException
	{
Thread.sleep(8000);	
	driver.findElement(By.xpath(properties.getProperty("FbClick"))).click();
Thread.sleep(5000);
		WebElement fbUserName = driver.findElement(By.xpath(properties.getProperty("Fbemailclick")));
		fbUserName.sendKeys(properties.getProperty("Fbmailid"));
		WebElement fbPwd = driver.findElement(By.xpath(properties.getProperty("Fbpwdclick")));
		fbPwd.sendKeys(properties.getProperty("Fbpwd"));
		driver.findElement(By.xpath(properties.getProperty("Fbsignin"))).click();
Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Logoutclick"))).click();
Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Logout"))).click();
Thread.sleep(5000);
//		driver.findElement(By.className("loginTF")).click();
	}

@Test(priority=3,enabled=false)
	public void twitter() throws InterruptedException
	{
Thread.sleep(5000);		
	driver.findElement(By.xpath(properties.getProperty("TwitterClick"))).click();
Thread.sleep(5000);
		WebElement TUserName = driver.findElement(By.xpath(properties.getProperty("TUsernameClick")));
		TUserName.sendKeys(properties.getProperty("TUsername"));
		WebElement TPwd = driver.findElement(By.xpath(properties.getProperty("TPwdClick")));
		TPwd.sendKeys(properties.getProperty("Tpwd"));
		driver.findElement(By.xpath(properties.getProperty("TSubmit"))).click();
Thread.sleep(5000);
		WebElement Tverify = driver.findElement(By.xpath(properties.getProperty("Tverifyclick")));
		Tverify.sendKeys(properties.getProperty("Tverfiy"));
Thread.sleep(3000);
		driver.findElement(By.id(properties.getProperty("verifysubmit"))).click();
Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Logoutclick"))).click();
Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Logout"))).click();
Thread.sleep(5000);
//		driver.findElement(By.className("loginTF")).click();
	}

@Test(priority=4,enabled=false)
	public void Linkedin() throws InterruptedException
	{
Thread.sleep(5000);		
	driver.findElement(By.xpath(properties.getProperty("LIClick"))).click();
Thread.sleep(5000);
		WebElement LUserName = driver.findElement(By.id(properties.getProperty("LUserNameclick")));
		LUserName.sendKeys(properties.getProperty("LUserName"));
		WebElement LPwd = driver.findElement(By.id(properties.getProperty("Lpwdclick")));
		LPwd.sendKeys(properties.getProperty("Lpwd"));
		driver.findElement(By.xpath(properties.getProperty("LSubmit"))).click();
Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Logoutclick"))).click();
Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Logout"))).click();
Thread.sleep(5000);
//		driver.findElement(By.className("loginTF")).click();
	}

@Test(priority=5,enabled=false)
public void Google() throws InterruptedException
{
Thread.sleep(5000);		
driver.findElement(By.xpath(properties.getProperty("GAClick"))).click();
Thread.sleep(5000);
	WebElement LUserName = driver.findElement(By.id(properties.getProperty("GAUsernameClick")));
	LUserName.sendKeys(properties.getProperty("GAUserName"));
Thread.sleep(4000);	
	driver.findElement(By.id((properties.getProperty("GANext")))).click();
Thread.sleep(4000);		
	WebElement LPwd = driver.findElement(By.xpath(properties.getProperty("GApwdclick")));
	LPwd.sendKeys(properties.getProperty("GApwd"));
Thread.sleep(4000);	
	driver.findElement(By.xpath(properties.getProperty("GANext2"))).click();
Thread.sleep(10000);
	driver.findElement(By.xpath(properties.getProperty("Logoutclick"))).click();
Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("Logout"))).click();
Thread.sleep(5000);
//	driver.findElement(By.className(prop.getProperty("Loginclick1"))).click();
}

@Test(priority=6,enabled=true)
	public void general_login() throws InterruptedException
	{
	
Thread.sleep(5000);
		WebElement usernameElement = driver.findElement(By.name(properties.getProperty("GusernameClick"))); 
		WebElement passwordElement = driver.findElement(By.name(properties.getProperty("GpasswordClick")));
		usernameElement.sendKeys(properties.getProperty("Gusername"));
		passwordElement.sendKeys(properties.getProperty("Gpassword"));
		driver.findElement(By.id(properties.getProperty("Gsubmit"))).click();
Thread.sleep(10000);
	}
}





