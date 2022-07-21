package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchtheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("/*http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		//ctrl+2+l  ctrl+2 popup use down arrow choose sec option press enter
				 //Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("dina");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("hari");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("dinahari");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Marketing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description field....");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mails2dinahari.s@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop = new Select(state);
		drop.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GROW WITH LEAF");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DINAHARI");
		driver.findElement(By.className("smallSubmit")).click();
		//step 21 resulting title page...
		System.out.println(driver.getTitle());




		 //handle the dropdown

	    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		 //ctrl+2+l findElement returns WebElement

		Select drop1=new Select(source);
		//Select By visible text
				//drop1.selectByVisibleText("Conference");
				 //Select By value
				// drop1.selectByValue("LEAD_DIRECTMAIL");
				 //Select by index
		drop1.selectByIndex(8);

		

		
		
              }

}
