package login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// .autocomplete-container p

		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		/*
		 * driver.findElement(By.id("autosuggest")).sendKeys("aus"); Thread.sleep(1000);
		 * 
		 * List<WebElement> options =
		 * driver.findElements(By.cssSelector(".ui-menu-item a"));
		 * 
		 * 
		 * Thread.sleep(2000); for (WebElement option : options) { if
		 * (option.getText().equalsIgnoreCase("Australia")) { option.click(); break; }
		 * 
		 * }
		 */

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("bel");

		//Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

/*		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("Belgium"))

			{

				//option.click();
				System.out.println(option.getText());
				option.click();
				break;

			}

		}*/
		
		for (int i=0; i<options.size();i++) {
			
			if (options.get(i).getText().equalsIgnoreCase("Belgium"))
			{
				System.out.println(options.get(i).getText());
				options.get(i).click();
				break;
			}
		}
		
		//driver.navigate().to("https://www.booking.com/flights/index.html");
		//driver.findElement(By.cssSelector(".InputCheckbox-module__field___lH8uR")).click();
		//driver.findElement(By.cssSelector("span[class*=\"module__field___lH8uR\"]")).click();
		
	}

};