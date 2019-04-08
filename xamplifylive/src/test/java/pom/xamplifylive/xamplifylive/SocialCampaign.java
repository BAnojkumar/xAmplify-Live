package pom.xamplifylive.xamplifylive;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SocialCampaign {

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

		//MH//

		WebElement ele = driver.findElement(By.xpath(properties.getProperty("campaign_hover")));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("createcamp"))).click();
		Thread.sleep(10000);

		//Social_Camp//

		driver.findElement(By.xpath(properties.getProperty("socialcamp"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manageacc"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manageselect"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("managesave"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("select_all"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("bootstrap"))).click();
		Thread.sleep(5000);
		
		DatabaseQueries data = new DatabaseQueries();
		List<String> campaignNames = new ArrayList<String>();
		String query = properties.getProperty("query.getCampaignName").replaceAll(":emailId",properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
		campaignNames.add(resultSet.getString("campaign_name").toLowerCase());
		}
		String campaignNameFromproperties = properties.getProperty("Campdata").toLowerCase();

		driver.findElement(By.xpath(properties.getProperty("CampName"))).sendKeys(properties.getProperty("Campdata"));	
		Thread.sleep(5000);
		if(campaignNames.indexOf(campaignNameFromproperties)>-1) {
		driver.findElement(By.xpath(properties.getProperty("CampName"))).clear();
		driver.findElement(By.xpath(properties.getProperty("CampName"))).sendKeys(properties.getProperty("Campdata")+"_"+System.currentTimeMillis());	
		}
		
		/*WebElement campname=driver.findElement(By.xpath(properties.getProperty("CampName")));
		campname.sendKeys(properties.getProperty("Campdata"));*/
		Thread.sleep(4000);
		WebElement happen=driver.findElement(By.xpath(properties.getProperty("whappen")));
		happen.sendKeys(properties.getProperty("whappendata"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("whappenimage"))).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec(properties.getProperty("ScAutoit")); 
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("whappenimage"))).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec(properties.getProperty("ScAutoit1"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("whappenimage"))).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec(properties.getProperty("ScAutoit2"));
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Customize"))).click();
		
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		if( driver.findElement(By.xpath("//div[@class='col-sm-12 dashboard-stat2 p0 clearfix']//div[2]//div[1]//div[1]//img[2]")).isDisplayed())
			{ 
		System.out.println("Element is Visible");
		
		WebElement tweet=driver.findElement(By.xpath(properties.getProperty("tweettext")));
		tweet.clear();
		tweet.sendKeys(properties.getProperty("tweettext1"));
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,920)");
		Thread.sleep(3000);
		}
			else
			{ 
				System.out.println("Element is InVisible"); 
		WebElement tweet=driver.findElement(By.xpath(properties.getProperty("tweettext")));
		tweet.clear();
		tweet.sendKeys(properties.getProperty("tweettext1"));
			}
		
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,920)");
	
	Thread.sleep(3000);
		
		/*driver.findElement(By.xpath(properties.getProperty("iclose1"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("iclose2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("iclose3"))).click();
		Thread.sleep(4000);*/
		driver.findElement(By.xpath("//div[@class='page-container']//li[7]//a[1]")).click(); 
		Thread.sleep(3000);
		WebElement part1=driver.findElement(By.xpath(properties.getProperty("partnerclick")));
		part1.click();
		Thread.sleep(4000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-720)");
		
		driver.findElement(By.xpath(properties.getProperty("postnowclick"))).click();
	}
}