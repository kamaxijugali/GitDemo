package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators3GettingPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String passwordText = getPassword(driver);
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys(passwordText);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
		

		Thread.sleep(3000);
		String text1 = driver.findElement(By.tagName("p")).getText();
		System.out.println(text1);
		Assert.assertEquals(text1, "You are successfully logged in.");
		String text2=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text2);
		Assert.assertEquals(text2,"Hello "+ name +",");
		
				
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		String resetText=driver.findElement(By.cssSelector("form p")).getText();
		String passwordText= resetText.split("'")[1];
		return (passwordText);
		
	}

}
