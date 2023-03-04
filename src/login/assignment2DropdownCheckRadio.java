package login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2DropdownCheckRadio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Kamaxi Jugali");
		driver.findElement(By.name("email")).sendKeys("kamaxi.mjugali@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password1234");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
		Select genderDropdown = new Select(gender);
		genderDropdown.selectByVisibleText("Female");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("11-11-2011");
		driver.findElement(By.cssSelector(".btn-success")).click();
		
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-600)");
		//System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]/strong")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText().split("\n")[1]);
		
		/*List <WebElement> texts=driver.findElements(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]"));
		
		for (WebElement sucessString:texts)
		{
			if (sucessString.getText().contains("Success"))
			{
				System.out.println (sucessString.getText());
				System.out.println();
			}
		}*/
		
				
		
		
	}

}
