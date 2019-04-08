package pom.xamplifylive.xamplifylive;

import java.io.IOException;
import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class ExplicitWait {
	static WebDriver driver = Instance.getInstance();

	static Properties properties = PropertiesFile.readPropertyFile("datafile.properties");

	public static void main(String[] args) throws InterruptedException, IOException, SQLException 
	{

		driver.manage().window().maximize();
		driver.get("https://xamplify.io/");
		driver.findElement(By.xpath("//a[@class='loginTF']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10000);
		
		WebElement usernameElement;
		usernameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));
		usernameElement.sendKeys("dtejashwini@stratapps.com");
		
		WebElement passwordElement;
		passwordElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']")));
		passwordElement.sendKeys("Xamplify@11");
		
		WebElement lg;
		lg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/form[1]/button[1]")));
		lg.click();
		
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("email_hover"))));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		WebElement subelement;
		subelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("create_email_temp"))));
		action.moveToElement(subelement);
		action.click();
		action.perform();
		
		WebElement Basic;
		Basic = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("Basic_click"))));
		Basic.click();
			
		WebElement BasicEcom;
		BasicEcom = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("Basic_Ecommerce"))));
		action.moveToElement(BasicEcom).build().perform();
		BasicEcom.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://app.getbee.io/v18.12.18.0923/index.html']")));
		
		WebElement cl;
		cl= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/bee-app/div/div/div/div[2]/div[1]/div/div[2]/button")));
		cl.click();
		driver.switchTo().defaultContent();
	}
}

	
	
