package login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignmentExplicitWaitLoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(15));
						
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[@class=\"customradio\"][2]")).click();
		

		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement element = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		Select dropdown = new Select(element);
		dropdown.selectByValue("consult");
		
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
		//div[@class="col-lg-3"]/h1
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"col-lg-3\"]/h1")));
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class=\"card h-100\"]"));
		
		for (int i =0;i<elements.size();i++)
		{
			driver.findElements(By.xpath("//div[@class=\"card h-100\"]/div/button")).get(i).click();			
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)");
		
		driver.findElement(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")).click();
		driver.findElement(By.cssSelector(".btn-success")).click();
		
	}
		

}
