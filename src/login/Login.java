package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		String s = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(s);

		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("John@rsa.com");
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("John@gmail.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345667");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*=\"pass\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
		
		
		
		
	}

}
