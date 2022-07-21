package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://en-gb.facebook.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.findElement(By.partialLinkText("Create New Account")).click();
	   driver.findElement(By.name("firstname")).sendKeys("dinahari");
	   driver.findElement(By.name("lastname")).sendKeys("selvaraj");
	   driver.findElement(By.name("reg_email__")).sendKeys("mails2dinahari.s@gmail.com");
	   driver.findElement(By.id("password_step_input")).sendKeys("dina");
	   driver.findElement(By.id("day")).sendKeys("21");
	   driver.findElement(By.id("month")).sendKeys("may");
	   driver.findElement(By.id("year")).sendKeys("1997");
	   driver.findElement(By.xpath("//label[text()='Female']")).click();
	   
	   
	   
	   
	   
	   
	   
	   
	   

	}

}
