package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxSelectionRegularExpIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://www.booking.com/flights/index.html");
		//driver.findElement(By.cssSelector(".InputCheckbox-module__field___lH8uR")).click();
		
		System.out.println(driver.findElement(By.cssSelector("span[class*=\"module__field___lH8uR\"]")).isSelected());
		driver.findElement(By.cssSelector("span[class*=\"module__field___lH8uR\"]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("span[class*=\"module__field___lH8uR\"]")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("span[class*=\"module__field___lH8uR\"]")).isSelected());
		

	}

}