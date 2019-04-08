package pom.xamplifylive.xamplifylive;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

public class EmailTemplate {

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
/*
//MH-1//

		WebElement element = driver.findElement(By.xpath(properties.getProperty("email_hover")));
		Thread.sleep(8000);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		WebElement subelement = driver.findElement(By.xpath(properties.getProperty("create_email_temp")));
		action.moveToElement(subelement);
		action.click();
		action.perform();
		
		Thread.sleep(5000);

//BasicTemplate//		
		
		WebElement Basic = driver.findElement(By.xpath(properties.getProperty("Basic_click")));
		Basic.click();
		Thread.sleep(15000);

		
		WebElement BasicEcom = driver.findElement(By.xpath(properties.getProperty("Basic_Ecommerce")));
		action.moveToElement(BasicEcom).build().perform();
		BasicEcom.click();
		Thread.sleep(20000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://app.getbee.io/v19.02.25.1344/index.html']")));
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/bee-app/div/div/div/div[2]/div[1]/div/div[2]/button")).click();
		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		DatabaseQueries data = new DatabaseQueries();
		String query = properties.getProperty("query.getEmailTemplates");// .replaceAll(":emailId",propertieserties.getproperty("user.name"));
		List<String> campaignNames = data.listNames(query, "name");
		String campaignNameFromproperties = properties.getProperty("BasicEcom_data").toLowerCase();
		driver.findElement(By.xpath(properties.getProperty("BasicEcom_temp_name"))).sendKeys(properties.getProperty("BasicEcom_data"));
		Thread.sleep(5000);
		if (campaignNames.indexOf(campaignNameFromproperties) > -1) 
		{
			driver.findElement(By.xpath(properties.getProperty("BasicEcom_temp_name"))).clear();
			driver.findElement(By.xpath(properties.getProperty("BasicEcom_temp_name")))
			.sendKeys(properties.getProperty("BasicEcom_data") + "_" + System.currentTimeMillis());
			Thread.sleep(25000);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//[@type='submit' and @id='save']")).click();*/
	
//MH-2//
		
		WebElement element1 = driver.findElement(By.xpath(properties.getProperty("email_hover")));
		Thread.sleep(8000);
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).perform();
				
		WebElement subelement1 = driver.findElement(By.xpath(properties.getProperty("create_email_temp")));
		action1.moveToElement(subelement1);
		action1.click();
		action1.perform();
				
		Thread.sleep(5000);
			
//VideoTemplate//		
		
		WebElement video = driver.findElement(By.xpath(properties.getProperty("Basic_video_click")));
		video.click();
		Thread.sleep(15000);

		WebElement videoEcomm = driver.findElement(By.xpath(properties.getProperty("Basic_Video")));
		action1.moveToElement(videoEcomm).build().perform();
		videoEcomm.click();
		Thread.sleep(20000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://app.getbee.io/v19.02.25.1344/index.html']")));
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/bee-app/div/div/div/div[2]/div[1]/div/div[2]/button")).click();
		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		DatabaseQueries data2 = new DatabaseQueries();
		String query2 = properties.getProperty("query.getEmailTemplates");// .replaceAll(":emailId",propertieserties.getproperty("user.name"));
		List<String> campaignNames2 = data2.listNames(query2, "name");
		String campaignNameFromproperties2 = properties.getProperty("BasicVideo_data").toLowerCase();
		driver.findElement(By.xpath(properties.getProperty("BasicVideo_temp_name")))
				.sendKeys(properties.getProperty("BasicVideo_data"));
		Thread.sleep(5000);
		if (campaignNames2.indexOf(campaignNameFromproperties2) > -1) {
			driver.findElement(By.xpath(properties.getProperty("BasicVideo_temp_name"))).clear();
			driver.findElement(By.xpath(properties.getProperty("BasicVideo_temp_name")))
					.sendKeys(properties.getProperty("BasicVideo_data") + "_" + System.currentTimeMillis());
			Thread.sleep(25000);
		}
		
		driver.findElement(By.xpath(properties.getProperty("BasicEcom_save"))).click();
		Thread.sleep(5000);
		

//EMAILCO-BRANDING//

		Thread.sleep(8000);
		WebElement element3 = driver.findElement(By.xpath(properties.getProperty("email_hover")));
		Thread.sleep(8000);
		Actions action3 = new Actions(driver);
		action3.moveToElement(element3).perform();
		WebElement subelement3 = driver.findElement(By.xpath(properties.getProperty("create_email_temp")));
		action3.moveToElement(subelement3);
		action3.click();
		action3.perform();
		Thread.sleep(8000);
	//	WebElement we_basic3 = driver.findElement(By.cssSelector(properties.getProperty("Email_CO_Click")));
	//	we_basic3.click();

		Thread.sleep(15000);

		//Actions basic3 = new Actions(driver);
		WebElement wbasic3 = driver.findElement(By.xpath(properties.getProperty("Basic_Video")));
		action3.moveToElement(wbasic3).build().perform();
		wbasic3.click();
		Thread.sleep(50000);

		driver.switchTo().defaultContent();
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='btn btn-primary ng-binding ng-scope']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='https://app.getbee.io/v18.12.18.0923/index.html']")));
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/bee-app/div/div/div/div[2]/div[1]/div/div[2]/button")).click();
		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		DatabaseQueries data3 = new DatabaseQueries();
		String query5i3 = properties.getProperty("query.getEmailTemplates");// .replaceAll(":emailId",propertieserties.getproperty("user.name"));
		List<String> campaignNames3 = data3.listNames(query5i3, "name");
		String campaignNameFromproperties3 = properties.getProperty("Email_Cobrand_data").toLowerCase();
		driver.findElement(By.xpath(properties.getProperty("BasicVideo_temp_name")))
				.sendKeys(properties.getProperty("Email_Cobrand_data"));
		Thread.sleep(5000);
		if (campaignNames3.indexOf(campaignNameFromproperties3) > -1) {
			driver.findElement(By.xpath(properties.getProperty("BasicVideo_temp_name"))).clear();
			driver.findElement(By.xpath(properties.getProperty("BasicVideo_temp_name")))
					.sendKeys(properties.getProperty("Email_Cobrand_data") + "_" + System.currentTimeMillis());
			Thread.sleep(25000);
		}

		driver.findElement(By.xpath(properties.getProperty("BasicEcom_save"))).click();
		
		Thread.sleep(5000);

//VIDEOCO-BRANDING//

		Thread.sleep(8000);
		WebElement element4 = driver.findElement(By.xpath(properties.getProperty("email_hover")));
		Thread.sleep(8000);
		Actions action4 = new Actions(driver);
		action4.moveToElement(element4).perform();
		WebElement subelement4 = driver.findElement(By.xpath(properties.getProperty("create_email_temp")));
		action4.moveToElement(subelement4);
		action4.click();
		action4.perform();
		Thread.sleep(8000);
		WebElement we_basic4 = driver.findElement(By.cssSelector(properties.getProperty("Video_CO_Click")));
		we_basic4.click();

		Thread.sleep(15000);

		//Actions basic4 = new Actions(driver);
		WebElement wbasic4 = driver.findElement(By.xpath(properties.getProperty("Basic_Video")));
		action4.moveToElement(wbasic4).build().perform();
		wbasic4.click();
		Thread.sleep(50000);

		driver.switchTo().defaultContent();
//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='btn btn-primary ng-binding ng-scope']")));
		driver.switchTo().frame(
				driver.findElement(By.xpath("//iframe[@src='https://app.getbee.io/v18.12.18.0923/index.html']")));
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/bee-app/div/div/div/div[2]/div[1]/div/div[2]/button")).click();
		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		DatabaseQueries data4 = new DatabaseQueries();
		String query5i4 = properties.getProperty("query.getEmailTemplates");// .replaceAll(":emailId",propertieserties.getproperty("user.name"));
		List<String> campaignNames4 = data4.listNames(query5i4, "name");
		String campaignNameFromproperties4 = properties.getProperty("Video_Cobrand_data").toLowerCase();
		driver.findElement(By.xpath(properties.getProperty("BasicVideo_temp_name")))
				.sendKeys(properties.getProperty("Video_Cobrand_data"));
		Thread.sleep(5000);
		if (campaignNames4.indexOf(campaignNameFromproperties4) > -1) {
			driver.findElement(By.xpath(properties.getProperty("BasicVideo_temp_name"))).clear();
			driver.findElement(By.xpath(properties.getProperty("BasicVideo_temp_name")))
					.sendKeys(properties.getProperty("Video_Cobrand_data") + "_" + System.currentTimeMillis());
			Thread.sleep(25000);
		}

		driver.findElement(By.xpath(properties.getProperty("BasicEcom_save"))).click();
		
		Thread.sleep(5000);

//DefaultTemplate//

		WebElement elementd = driver.findElement(By.xpath(properties.getProperty("email_hover")));
		Thread.sleep(5000);
		Actions actiond = new Actions(driver);
		actiond.moveToElement(elementd).perform();
		WebElement subelementd = driver.findElement(By.xpath(properties.getProperty("create_email_temp")));
		actiond.moveToElement(subelementd);
		actiond.click();
		actiond.perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("default"))).click();
		Thread.sleep(5000);
		//Actions default1 = new Actions(driver);
		WebElement def_ele = driver.findElement(By.xpath(properties.getProperty("default1_path")));
		action1.moveToElement(def_ele).build().perform();
		def_ele.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("default1_preview"))).click();
		Thread.sleep(5000);
		//Actions default2 = new Actions(driver);
		WebElement def_ele2 = driver.findElement(By.xpath(properties.getProperty("default2_path")));
		action1.moveToElement(def_ele2).build().perform();
		def_ele2.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("default2_preview"))).click();
		Thread.sleep(5000);
		//Actions default3 = new Actions(driver);
		WebElement def_ele3 = driver.findElement(By.xpath(properties.getProperty("default3_path")));
		action1.moveToElement(def_ele3).build().perform();
		def_ele3.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("default3_preview"))).click();
		Thread.sleep(5000);

//Upload_Custom//

		WebElement upld_cstm = driver.findElement(By.xpath(properties.getProperty("upload_custom")));
		upld_cstm.click();
		Thread.sleep(3000);
		//Actions upld_tmp1 = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(properties.getProperty("upld_create_temp")));
		action1.moveToElement(we).build().perform();
		we.click();
		Thread.sleep(5000);

		DatabaseQueries data1 = new DatabaseQueries();
		String query5 = properties.getProperty("query.getEmailTemplates");// .replaceAll(":emailId",properties.getproperty("user.name"));
		List<String> campaignNames1 = data1.listNames(query5, "name");
		String campaignNameFromproperties1 = properties.getProperty("upld_tmp_name_senddata").toLowerCase();

		driver.findElement(By.xpath(properties.getProperty("upld_tmp_name")))
				.sendKeys(properties.getProperty("upld_tmp_name_senddata"));
		Thread.sleep(5000);
		if (campaignNames1.indexOf(campaignNameFromproperties1) > -1) {
			driver.findElement(By.xpath(properties.getProperty("upld_tmp_name"))).clear();
			driver.findElement(By.xpath(properties.getProperty("upld_tmp_name")))
					.sendKeys(properties.getProperty("upld_tmp_name_senddata") + "_" + System.currentTimeMillis());
			Thread.sleep(25000);
		}

//driver.findElement(By.xpath(properties.getproperty("upld_tmp_name"))).sendKeys(properties.getproperty("upld_tmp_name_senddata"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("upld_custmfile_tmp"))).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec(properties.getProperty("uploadTemp"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("upldcustm_save"))).click();
		Thread.sleep(5000);

		WebElement upl_reg = driver.findElement(By.xpath(properties.getProperty("emailhover2")));
		Thread.sleep(5000);
		Actions action_reg = new Actions(driver);
		action_reg.moveToElement(upl_reg).perform();
		WebElement subele_reg = driver.findElement(By.xpath(properties.getProperty("create_email_temp2")));
		action_reg.moveToElement(subele_reg);
		action_reg.click();
		action_reg.perform();
		Thread.sleep(5000);
		WebElement upl_reg2 = driver.findElement(By.xpath(properties.getProperty("upld_custom2")));
		upl_reg2.click();
		Thread.sleep(5000);
		Actions upld_tmp2 = new Actions(driver);
		WebElement we_up = driver.findElement(By.xpath(properties.getProperty("regular_create_temp")));
		upld_tmp2.moveToElement(we_up).build().perform();
		we_up.click();
		Thread.sleep(5000);

		DatabaseQueries data11 = new DatabaseQueries();
		String query6 = properties.getProperty("query.getEmailTemplates");// .replaceAll(":emailId",properties.getproperty("user.name"));
		List<String> campaignNames11 = data11.listNames(query6, "name");
		String campaignNameFromproperties11 = properties.getProperty("regular_temp_senddata").toLowerCase();

		driver.findElement(By.xpath(properties.getProperty("regular_temp_name")))
				.sendKeys(properties.getProperty("regular_temp_senddata"));
		Thread.sleep(5000);
		if (campaignNames11.indexOf(campaignNameFromproperties11) > -1) {
			driver.findElement(By.xpath(properties.getProperty("regular_temp_name"))).clear();
			driver.findElement(By.xpath(properties.getProperty("regular_temp_name")))
					.sendKeys(properties.getProperty("regular_temp_senddata") + "_" + System.currentTimeMillis());
			Thread.sleep(25000);
		}

//driver.findElement(By.xpath(properties.getproperty("regular_temp_name"))).sendKeys(properties.getproperty("regular_temp_senddata"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("regular_upld_file"))).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec(properties.getProperty("uploadTemp"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("regular_temp_save"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("LogoClick"))).click();
  } 
}
