package login;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.className("blinkingText")).click();
		
		Set<String> windows=driver.getWindowHandles();
		java.util.Iterator<String> it =windows.iterator();
		String parentId= it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.cssSelector(".im-para.red"));
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
		
		

	}

}
