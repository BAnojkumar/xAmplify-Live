package pom.xamplifylive.xamplifylive;

//import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basic_uploadcontent
{

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("datafile.properties");

	@BeforeMethod
	public void Content_MouseHover() throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("Content_Mousehover")));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Upload_Click"))).click();
		driver.findElement(By.xpath("//span[@class='hidden-xs'][contains(text(),'Upload Content')]")).click();
		Thread.sleep(10000);

	}

	@Test(priority=1,enabled=true)
	public void web() throws InterruptedException
	{
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
		
	}

	@Test(priority=1,enabled=true)
	public void video_browse() throws IOException, InterruptedException 
	{

		driver.findElement(By.xpath(properties.getProperty("vBrowse_click"))).click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec(properties.getProperty("AutoIt")); 
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("vBrowse_Upload"))).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("vBrowse_Home_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();
		Thread.sleep(10000);

	}

	@Test(priority=2,enabled=true)
	public void video_dropbox() throws IOException, InterruptedException
	{

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

		driver.findElement(By.cssSelector(properties.getProperty("vBrowse_Home_click"))).click();
		driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();

		Thread.sleep(10000);
	}

	@Test(priority=3,enabled=true)
	public void video_box() throws IOException, InterruptedException
	{
		Thread.sleep(5000);

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

		driver.findElement(By.xpath(properties.getProperty("vBrowse_Home_click"))).click();
		driver.findElement(By.xpath(properties.getProperty("vBrowse_popupsave"))).click();

		Thread.sleep(10000);
	}

	@Test(priority=4,enabled=true)
	public void Google_Drive() throws IOException, InterruptedException, IndexOutOfBoundsException
	{
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("GD_click"))).click();
		Thread.sleep(5000);

		Set<String> hashset2 = (HashSet<String>) driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(hashset2);
		System.out.println(list2.toString());
		System.out.println("size of current windows " + list2.size());
		if(list2.size()==2) {

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

			//driver.switchTo().defaultContent();
			//Thread.sleep(5000);

			driver.switchTo().frame(2);

			System.out.println("successfully switched frame");
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id=\':j\']/div/table/tbody/tr/td[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='picker:ap:0']")).click();
			System.out.println("successfully selected the video");
		}
		else {
			driver.switchTo().frame(2);

			System.out.println("Switching successfull");
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id=\':j\']/div/table/tbody/tr/td[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='picker:ap:0']")).click();
			System.out.println("successfully selected the video");
		}	
	}
	
	@Test(priority=4,enabled=false) 
	public void Content_Browse() throws IOException, InterruptedException
	{
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("cBrowse_click"))).click();

		Thread.sleep(3000);

		Runtime.getRuntime().exec(properties.getProperty("cAutoIt")); 
	}

	@Test(priority=5,enabled=false)
	public void Content_Dropbox() throws IOException, InterruptedException
	{
		Thread.sleep(5000);		

		driver.findElement(By.xpath(properties.getProperty("cdropbox_click"))).click();

		Thread.sleep(5000);

		Set<String> hashset3 = (HashSet<String>) driver.getWindowHandles();
		List<String> list3 = new ArrayList<String>(hashset3);
		System.out.println(list3.toString());

		Thread.sleep(8000);

		driver.switchTo().window(list3.get(1));
		System.out.println(list3.get(1));

		Thread.sleep(20000);				

		driver.findElement(By.xpath(properties.getProperty("cdropbox_item_select"))).click();
		driver.findElement(By.xpath(properties.getProperty("cdrop_box_choose"))).click();

		Thread.sleep(8000);

		driver.switchTo().window(list3.get(0));

		driver.findElement(By.xpath(properties.getProperty("cdrop_box_after_home"))).click();

		Thread.sleep(5000);

	}

	@Test(priority=6,enabled=false)
	public void Content_box() throws IOException, InterruptedException
	{
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("cbox_click"))).click();

		Set<String> hashset4 = (HashSet<String>) driver.getWindowHandles();
		List<String> list4 = new ArrayList<String>(hashset4);
		System.out.println(list4.toString());

		Thread.sleep(5000);

		driver.switchTo().window(list4.get(1));
		System.out.println(list4.get(1));

		Thread.sleep(12000);

		WebElement radio2=driver.findElement(By.xpath(properties.getProperty("cbox_item_radio")));
		radio2.click();

		driver.findElement(By.xpath(properties.getProperty("cbox_item_select"))).click();

		Thread.sleep(5000);

		driver.switchTo().window(list4.get(0));

		driver.findElement(By.xpath(properties.getProperty("cbox_after_home"))).click();

		Thread.sleep(10000);
	}
}






