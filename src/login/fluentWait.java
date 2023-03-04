package login;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		driver.findElement(By.cssSelector("#start button")).click();
		
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement foo = w.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			    if (driver.findElement(By.cssSelector("#finish h4")).isDisplayed())
			    {
			       return driver.findElement(By.cssSelector("#finish h4"));
			    }
			    else
			    	return null;
			     }
			   });
		System.out.println(driver.findElement(By.cssSelector("#finish h4")).getText());
	}

}
