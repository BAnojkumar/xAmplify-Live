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

public class uploadcontent 
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
		Thread.sleep(8000);

//UploadClick//
		driver.findElement(By.xpath(properties.getProperty("UploadContent"))).click();
		Thread.sleep(10000);

//Browse//
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("cBrowse_click"))).click();

		Thread.sleep(3000); 

		Runtime.getRuntime().exec(properties.getProperty("cAutoIt")); 
		System.out.println("successfully uploaded the Content from local");
		Thread.sleep(8000);
		
//UploadClick-1//
		driver.findElement(By.xpath(properties.getProperty("UploadContent"))).click();
		Thread.sleep(10000);	
		
//DropBox//
		
		driver.findElement(By.xpath(properties.getProperty("cdropbox_click"))).click();

		Thread.sleep(5000);

		Set<String> hashset3 = (HashSet<String>) driver.getWindowHandles();
		List<String> list3 = new ArrayList<String>(hashset3);
		System.out.println(list3.toString());

		Thread.sleep(8000);

		driver.switchTo().window(list3.get(1));
		System.out.println(list3.get(1));

		Thread.sleep(20000);				
	
		driver.findElement(By.xpath(properties.getProperty("vdropbox_signin"))).click();


		WebElement emailidElement = driver.findElement(By.xpath(properties.getProperty("vdrop_box_username_click"))); 
		emailidElement.sendKeys(properties.getProperty("vdrop_box_username"));
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_next_click"))).click();

		Thread.sleep(3000);

		WebElement EmailpwdElement = driver.findElement(By.name(properties.getProperty("vdrop_box_pwd_click"))); 
		EmailpwdElement.sendKeys(properties.getProperty("vdrop_box_pwd"));
		driver.findElement(By.xpath(properties.getProperty("vdrop_box_pwd_next"))).click();

		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("cdropbox_item_select"))).click();
		driver.findElement(By.xpath(properties.getProperty("cdrop_box_choose"))).click();

		Thread.sleep(8000);

		driver.switchTo().window(list3.get(0));

		driver.findElement(By.xpath(properties.getProperty("cdrop_box_after_home"))).click();
		System.out.println("successfully uploaded the Content from DropBox");
		Thread.sleep(5000);
		
//UploadClick-2//
		driver.findElement(By.xpath(properties.getProperty("UploadContent"))).click();
		Thread.sleep(10000);
		
//Box//
		driver.findElement(By.xpath(properties.getProperty("cbox_click"))).click();

		Set<String> hashset4 = (HashSet<String>) driver.getWindowHandles();
		List<String> list4 = new ArrayList<String>(hashset4);
		System.out.println(list4.toString());

		Thread.sleep(5000);

		driver.switchTo().window(list4.get(1));
		System.out.println(list4.get(1));

		Thread.sleep(12000);
		
		WebElement EmailidElement1 = driver.findElement(By.name(properties.getProperty("vbox_login"))); 
		EmailidElement1.sendKeys(properties.getProperty("vbox_Username"));

		driver.findElement(By.xpath(properties.getProperty("vbox_login_submit"))).click();

		Thread.sleep(3000);

		WebElement EmailpwdElement1 = driver.findElement(By.name(properties.getProperty("vbox_pwd_click"))); 
		EmailpwdElement1.sendKeys(properties.getProperty("vbox_pwd"));

		driver.findElement(By.xpath(properties.getProperty("vbox_submit"))).click();

		Thread.sleep(12000);

		WebElement radio2=driver.findElement(By.xpath(properties.getProperty("cbox_item_radio")));
		radio2.click();

		driver.findElement(By.xpath(properties.getProperty("cbox_item_select"))).click();

		Thread.sleep(5000);

		driver.switchTo().window(list4.get(0));

		driver.findElement(By.xpath(properties.getProperty("cbox_after_home"))).click();
		System.out.println("successfully uploaded the Content from Box");
		Thread.sleep(10000);
	
//UploadClick-2//
		driver.findElement(By.xpath(properties.getProperty("UploadContent"))).click();
		Thread.sleep(10000);

//GoogleDrive//
		driver.findElement(By.xpath(properties.getProperty("GD_Content_click"))).click();
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

		driver.findElement(By.xpath(properties.getProperty("GD_content"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("GD_Content_select"))).click();
		System.out.println("successfully uploaded the Content from google drive");
		}
		else 
		{
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
			driver.switchTo().frame(2);

			System.out.println("successfully switched the frame");
			Thread.sleep(8000);

			driver.findElement(By.xpath(properties.getProperty("GD_content"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("GD_Content_select"))).click();
			System.out.println("successfully uploaded the Content from google drive");
		}
		
		Thread.sleep(3000);
		driver.close();
	}
}
