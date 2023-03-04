package login;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//button[text()="ADD TO CART"]
		//h4.product-name
		Thread.sleep(3000);
		
		String[] itemsNeeded = {"Cucumber", "Tomato", "Beans", "Brocolli"};
		List itemsNeededArrayList = Arrays.asList(itemsNeeded);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		int j=0;
		for (int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText().split("-")[0].trim();
			//System.out.println(name);
			
			//div[@class=\"product-action\"]/button
			//button[@text()=\"ADD TO CART\"]
			
			if (itemsNeededArrayList.contains(name))
			{
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button[@type=\"button\"]")).get(i).click();	
				System.out.println(name);
				j++;
			}
			
			if (j==products.size())
			{
				break;
			}
			
		}
						
	}
	
	

}
