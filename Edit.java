package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//label[text()='Enter your email address']")).sendKeys("Enter your email address");
        driver.findElement(By.id("email")).sendKeys("mails2dinahari.s@gmail.com",Keys.TAB);
        driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/following::label")).sendKeys("a text and press keyboard tab");
        driver.findElement(By.xpath("//label[text()=' a text and press keyboard tab']/following::input[1]")).sendKeys("dinahari",Keys.TAB);
        System.out.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]/label")).getText());
        String attribute = driver.findElement(By.name("username")).getAttribute("value");
        System.out.println(attribute);
        driver.findElement(By.xpath("//div[contains(@class,'large-6 small-12 columns')]//following::label[4]")).sendKeys("Clear the text");
        driver.findElement(By.xpath("//input[@name='username']")).clear();
        driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/label[5]")).sendKeys("Confirm that edit field is disabled");
        System.out.println(driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/input[5]")).isEnabled());
        
        
        
        
        
        
        
	

}
}
