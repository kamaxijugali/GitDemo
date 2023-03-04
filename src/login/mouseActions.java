package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		Actions mouse = new Actions(driver);
		
		mouse.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).click().build().perform();

		
		mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HELLO").doubleClick().build().perform();
		Thread.sleep(2000);
		
		
		
		

	}

}
