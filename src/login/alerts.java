package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys("Kamaxi");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("name")).sendKeys("Jugali");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
	}

}
