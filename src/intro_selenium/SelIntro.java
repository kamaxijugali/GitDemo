package intro_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelIntro {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulsheetyacademy.com");
		//driver.get("https://www.amazon.in");
		
			
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
