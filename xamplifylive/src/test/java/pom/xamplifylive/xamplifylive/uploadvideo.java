package pom.xamplifylive.xamplifylive;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class uploadvideo 
	{
	
	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile.readPropertyFile("datafile.properties");

public static void main(String[] args) throws InterruptedException, IOException, SQLException 
		
	{

		driver.manage().window().maximize();
		driver.get(properties.getProperty("Baseurl"));
		driver.findElement(By.xpath(properties.getProperty("Loginclick1"))).click();
		Thread.sleep(10000);

//Login//
		WebElement usernameElement = driver.findElement(By.xpath(properties.getProperty("GusernameClick")));
		WebElement passwordElement = driver.findElement(By.xpath(properties.getProperty("GpasswordClick")));
		usernameElement.sendKeys(properties.getProperty("Gusername"));
		passwordElement.sendKeys(properties.getProperty("Gpassword"));
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("Gsubmit"))).click();
		Thread.sleep(3000);
		
//MouseHover//		
		
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Upload_Click"))).click();
		Thread.sleep(10000);

//Browse//		
		driver.findElement(By.xpath(properties.getProperty("vBrowse_click"))).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec(properties.getProperty("AutoIt")); 
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("vBrowse_Upload"))).click();
		Thread.sleep(15000);
		driver.findElement(By.linkText(properties.getProperty("vBrowse_Home_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();
		System.out.println("successfully uploaded the video from local");
		Thread.sleep(10000);

//MouseHover-1//		
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));
		Actions act1 = new Actions(driver);
		act1.moveToElement(ele1).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Upload_Click"))).click();
		Thread.sleep(10000);

//WebCam//	
		driver.findElement(By.xpath(properties.getProperty("webclick"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("camclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("record"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("stop"))).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[contains(text(),'Upload')]")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();	
		driver.findElement(By.xpath(properties.getProperty("crossclick"))).click();
		System.out.println("successfully Done with webcam");
		Thread.sleep(6000);

//DropBox//	
		driver.findElement(By.xpath(properties.getProperty("vdropbox_click"))).click();

		Set<String> hashset = (HashSet<String>) driver.getWindowHandles();
		List<String> list = new ArrayList<String>(hashset);
		System.out.println(list.toString());

		Thread.sleep(5000);

		driver.switchTo().window(list.get(1));
		System.out.println(list.get(1));

		Thread.sleep(17000);

		driver.findElement(By.xpath(properties.getProperty("vdropbox_signin"))).click();


		WebElement emailidElement = driver.findElement(By.xpath(properties.getProperty("vdrop_box_username_click"))); 
		emailidElement.sendKeys(properties.getProperty("vdrop_box_username"));
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_next_click"))).click();

		Thread.sleep(3000);

		WebElement EmailpwdElement = driver.findElement(By.name(properties.getProperty("vdrop_box_pwd_click"))); 
		EmailpwdElement.sendKeys(properties.getProperty("vdrop_box_pwd"));
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_pwd_next"))).click();

		Thread.sleep(20000);				

		driver.findElement(By.className(properties.getProperty("vdrop_box_item_select"))).click();
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_choose"))).click();

		Thread.sleep(8000);

		driver.switchTo().window(list.get(0));

		driver.findElement(By.xpath(properties.getProperty("vBrowse_Home_click1"))).click();
		driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();
		System.out.println("successfully uploaded the video from DropBox");

		Thread.sleep(10000);
		
//MouseHover-2//		
		
		WebElement ele2 = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));
		Actions act2 = new Actions(driver);
		act2.moveToElement(ele2).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Upload_Click"))).click();
		Thread.sleep(10000);
		
//Box//
		
		driver.findElement(By.xpath(properties.getProperty("vbox_click"))).click();

		Set<String> hashset1 = (HashSet<String>) driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(hashset1);
		System.out.println(list1.toString());

		Thread.sleep(5000);

		driver.switchTo().window(list1.get(1));
		System.out.println(list1.get(1));

		Thread.sleep(17000);

		WebElement EmailidElement1 = driver.findElement(By.name(properties.getProperty("vbox_login"))); 
		EmailidElement1.sendKeys(properties.getProperty("vbox_Username"));
		driver.findElement(By.xpath(properties.getProperty("vbox_login_submit"))).click();

		Thread.sleep(3000);

		WebElement EmailpwdElement1 = driver.findElement(By.name(properties.getProperty("vbox_pwd_click"))); 
		EmailpwdElement1.sendKeys(properties.getProperty("vbox_pwd"));

		driver.findElement(By.xpath(properties.getProperty("vbox_submit"))).click();

		Thread.sleep(12000);

		WebElement radio1=driver.findElement(By.xpath(properties.getProperty("vbox_item_radio")));
		radio1.click();

		driver.findElement(By.xpath(properties.getProperty("vbox_item_select"))).click();

		Thread.sleep(5000);

		driver.switchTo().window(list1.get(0));

		driver.findElement(By.linkText(properties.getProperty("vBrowse_Home_click"))).click();
		driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();
		System.out.println("successfully uploaded the video from Box");
		Thread.sleep(10000);
	
//MouseHover-3//		
		
		WebElement ele3 = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));
		Actions act3 = new Actions(driver);
		act3.moveToElement(ele3).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Upload_Click"))).click();
		Thread.sleep(10000);
		
//GoogleDrive//
		
		driver.findElement(By.xpath(properties.getProperty("GD_click"))).click();
		Thread.sleep(5000);

		Set<String> hashset2 = (HashSet<String>) driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(hashset2);
		System.out.println(list2.toString());
		System.out.println("size of current windows " + list2.size());
		if(Integer.valueOf(list2.size())==2) 
		{

		Set<String> hashset21 = (HashSet<String>) driver.getWindowHandles();
		List<String> list21 = new ArrayList<String>(hashset21);
		System.out.println(list21.toString());

		Thread.sleep(5000);

		driver.switchTo().window(list21.get(1));
		System.out.println("Google drive window" +list21.get(1));
		System.out.println("switched to googledrive window");
		Thread.sleep(3000);

		WebElement EmailidElement2 = driver.findElement(By.id(properties.getProperty("GD_username_click")));
		EmailidElement2.sendKeys(properties.getProperty("GD_username"));

		driver.findElement(By.xpath(properties.getProperty("GD_Next"))).click();

		Thread.sleep(3000);

		WebElement PwdElement2 = driver.findElement(By.xpath(properties.getProperty("GD_pwd_click")));
		PwdElement2.sendKeys(properties.getProperty(("GD_pwd")));

		driver.findElement(By.xpath(properties.getProperty("GD_Next1"))).click();
		Thread.sleep(4000);
		driver.switchTo().window(list2.get(0));
		Thread.sleep(10000);

		driver.switchTo().frame(2);

		System.out.println("successfully switched the frame");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("GD_video"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("GD_video_select"))).click();
		System.out.println("successfully uploaded the video from google drive");
		}
		else 
		{
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
			driver.switchTo().frame(2);

			System.out.println("successfully switched the frame");
			Thread.sleep(8000);

			driver.findElement(By.xpath(properties.getProperty("GD_video"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("GD_video_select"))).click();
			System.out.println("successfully uploaded the video from google drive");
		}
		Thread.sleep(3000);
		driver.close();
	}
}
