package pom.xamplifylive.xamplifylive;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class Managevideos {

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
		WebElement ele7=driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));
		Actions act6=new Actions(driver);
		act6.moveToElement(ele7).perform();
		driver.findElement(By.xpath(properties.getProperty("Managevideo_Click"))).click();
		Thread.sleep(8000);	
		
		driver.findElement(By.xpath(properties.getProperty("video_delete"))).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("video_delete_confirm"))).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("delete_after_home"))).click();
		Thread.sleep(8000);
		
		//MH-2//
		WebElement ele8=driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));
		Actions act7=new Actions(driver);
		act7.moveToElement(ele8).perform();
		driver.findElement(By.xpath(properties.getProperty("Managevideo_Click"))).click();

		Thread.sleep(8000);
		WebElement Video_search = driver.findElement(By.xpath(properties.getProperty("video_search"))); 
		Video_search.sendKeys(properties.getProperty("Name_Input")); // name change//
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();
		Thread.sleep(8000);			
		driver.findElement(By.xpath(properties.getProperty("analytics_click"))).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("Manage_video_click"))).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("Edit_video"))).click();

		Thread.sleep(10000);

		Select dropdown = new Select(driver.findElement(By.xpath(properties.getProperty("Edit_category"))));
		dropdown.selectByVisibleText(properties.getProperty("Category_Name"));

		WebElement Video_Tag = driver.findElement(By.xpath(properties.getProperty("Edit_tag"))); 
		Video_Tag.sendKeys(properties.getProperty("Edit-Name"));
		Video_Tag.sendKeys(Keys.ENTER);

		WebElement Edit_radio=driver.findElement(By.xpath(properties.getProperty("Edit_radio")));
		Edit_radio.click();

		driver.findElement(By.xpath(properties.getProperty("Image_upload"))).click();
		Thread.sleep(8000);
		Runtime.getRuntime().exec(properties.getProperty("MvAutoIt")); 
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Appearance_click"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Appearance_button"))).click();

		driver.findElement(By.xpath(properties.getProperty("AllowSharing"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("CalltoAction"))).click();
		Thread.sleep(4000);
		driver.findElement(By.className(properties.getProperty("BootStrap"))).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("UpArrow"))).click();
		Thread.sleep(8000);	
		driver.findElement(By.xpath(properties.getProperty("UpdateInfo"))).click();	
		Thread.sleep(8000);		
		
		//MH-3//
		WebElement ele9=driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));
		Actions act8=new Actions(driver);
		act8.moveToElement(ele9).perform();
		driver.findElement(By.xpath(properties.getProperty("Managevideo_Click"))).click();
		Thread.sleep(8000);

		//		Select dropdown_sort1 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-manage-video[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/select[1]")));
		//		dropdown_sort1.selectByVisibleText("Title (A-Z)");
		//
		//		Select dropdown_sort2 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-manage-video[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/select[1]")));
		//		dropdown_sort2.selectByVisibleText("Title (Z-A)");
		//	
		//		Select dropdown_sort3 = new Select(driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/app-manage-video[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/select[1]")));
		//		dropdown_sort3.selectByVisibleText("Upload Date (ASC)");

		Select dropdown_sort4 = new Select(driver.findElement(By.xpath(properties.getProperty("Sortbyclick"))));
		dropdown_sort4.selectByVisibleText(properties.getProperty("Sortitem"));

		Thread.sleep(10000);

		Select dropdown_cat = new Select(driver.findElement(By.xpath(properties.getProperty("Cat"))));
		dropdown_cat.selectByVisibleText(properties.getProperty("Catselect"));	

		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Gridview"))).click();
		Thread.sleep(8000);	
		driver.findElement(By.xpath(properties.getProperty("listview"))).click();
		Thread.sleep(11000);
		WebElement Video_search1 = driver.findElement(By.xpath(properties.getProperty("video_search")));
		Video_search1.sendKeys(properties.getProperty("Name_Input"));
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Campaignclick"))).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("cdrop_box_after_home"))).click();
		Thread.sleep(5000);
		driver.close();
	}
}


