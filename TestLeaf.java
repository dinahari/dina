package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeaf {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("dina");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000");
		WebElement industry = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select drop1=new Select(industry);
		drop1.selectByIndex(4);
		WebElement Ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select drop2=new Select(Ownership);
		drop2.selectByVisibleText("S-Corporation");
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select drop3=new Select(Source);
		drop3.selectByValue("LEAD_EMPLOYEE");
		WebElement Marketingcompagin = driver.findElement(By.id("marketingCampaignId"));
		Select drop4=new Select(Marketingcompagin);
		drop4.selectByIndex(7);
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop5=new Select(State);
		drop5.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();//smallSubmit
		
				
				
		
		
	}

}
