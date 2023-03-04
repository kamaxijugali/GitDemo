package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		WebElement target =  driver.findElement(By.cssSelector("#droppable"));
		Actions mouse= new Actions(driver);
		mouse.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
		

	}

}
