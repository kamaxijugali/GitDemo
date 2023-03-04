package login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignmentCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.cssSelector(".InputCheckbox-module__field___lH8uR")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		
		
		List<WebElement> options = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println(options.size());
		
		//input[placeholder="Enter airport code/city"]
		
	}

}
