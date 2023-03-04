package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		String name = "rahul";
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);
		String text1 = driver.findElement(By.tagName("p")).getText();
		System.out.println(text1);
		Assert.assertEquals(text1, "You are successfully logged in.");
		String text2=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text2);
		Assert.assertEquals(text2,"Hello "+ name +",");
		
				
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();


	}

}
