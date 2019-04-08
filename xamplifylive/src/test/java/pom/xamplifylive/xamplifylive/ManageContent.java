package pom.xamplifylive.xamplifylive;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

public class ManageContent 
{
	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile.readPropertyFile("datafile.properties");


	public static void main(String[] args) throws InterruptedException, IOException, SQLException 
	{
		driver.manage().window().maximize();
		driver.get("https://xamplify.io/");
		driver.findElement(By.xpath("//a[@class='loginTF']")).click();
		Thread.sleep(10000);

		WebElement usernameElement = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passwordElement = driver.findElement(By.xpath("//input[@id='password']"));
		usernameElement.sendKeys("dtejashwini@stratapps.com");
		passwordElement.sendKeys("Xamplify@11");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[2]/form[1]/button[1]"))
		.click();
		Thread.sleep(8000);

		//MH-1//
		WebElement ele8=driver.findElement(By.xpath(properties.getProperty(("Content_Mousehover"))));
		Actions act7=new Actions(driver);
		act7.moveToElement(ele8).perform();
		driver.findElement(By.xpath(properties.getProperty("Mcontent1"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mdelete"))).click();
		driver.findElement(By.xpath(properties.getProperty("mdelconfirm"))).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("mdisplay"))).click();
		Thread.sleep(5000);	

		//MH-2//
		WebElement ele9=driver.findElement(By.xpath(properties.getProperty(("Content_Mousehover"))));
		Actions act8=new Actions(driver);
		act8.moveToElement(ele9).perform();
		driver.findElement(By.xpath(properties.getProperty("Mcontent1"))).click();


		Thread.sleep(8000);

		//	Select dropdown_Content1 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-content-management[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/select[1]")));
		//	dropdown_Content1.selectByVisibleText("File Name (A-Z)");

		//	Select dropdown_Content2 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-content-management[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/select[1]")));
		//	dropdown_Content2.selectByVisibleText("File Name (Z-A)");

		//	Select dropdown_Content3 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-content-management[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/select[1]")));
		//	dropdown_Content3.selectByVisibleText("Upload Date (ASC)");

		Select dropdown_Content4 = new Select(driver.findElement(By.xpath(properties.getProperty("mSortbyclick"))));
		dropdown_Content4.selectByVisibleText(properties.getProperty("mSortitem"));

		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("mgrid"))).click();
		Thread.sleep(8000);
		//MH-3//
		WebElement ele10=driver.findElement(By.xpath(properties.getProperty(("Content_Mousehover"))));
		Actions act9=new Actions(driver);
		act9.moveToElement(ele10).perform();
		driver.findElement(By.xpath(properties.getProperty("Mcontent"))).click();

		Thread.sleep(13000);
		WebElement Content_search = driver.findElement(By.xpath(properties.getProperty("msearch"))); 
		Content_search.sendKeys(properties.getProperty("msearchdata"));
		driver.findElement(By.xpath(properties.getProperty("msearchclick"))).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("mpreview"))).click();
		Thread.sleep(5000);
		driver.close();
	}
}


