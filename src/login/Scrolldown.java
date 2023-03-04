package login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		int sum = 0;
		
		List<WebElement> table = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		for (int i=0; i<table.size();i++)
		{
			System.out.println(table.get(i).getText());
			sum=sum + Integer.parseInt(table.get(i).getText());
			
		}
		System.out.println(sum);
		int printedValue=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println(printedValue);
		
		Assert.assertEquals(sum, printedValue);
		
		
		
	}

}
