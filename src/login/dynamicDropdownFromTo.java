package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdownFromTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://www.makemytrip.com/");

		
		////input[@placeholder="Airport or city"]
		//driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]")).sendKeys("Ben");
		
		driver.findElement(By.cssSelector("//input[@id='return']")).isEnabled();
		
		
	}

}
