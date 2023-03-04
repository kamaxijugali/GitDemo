package login;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWaitAddCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
						
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// button[text()="ADD TO CART"]
		// h4.product-name
		Thread.sleep(3000);

		String[] itemsNeeded = { "Cucumber", "Tomato", "Beans", "Brocolli" };
		List<String> itemsNeededArrayList = Arrays.asList(itemsNeeded);
		addItems(driver, itemsNeededArrayList);
		
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoCode")));
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
}


	public static void addItems(WebDriver driver, List<String> itemsNeededArrayList) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText().split("-")[0].trim();
			// System.out.println(name);

			// div[@class=\"product-action\"]/button
			// button[@text()=\"ADD TO CART\"]

			if (itemsNeededArrayList.contains(name)) {
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button[@type=\"button\"]")).get(i)
						.click();
				System.out.println(name);
				j++;
			}

			if (j == products.size()) {
				break;
			}

		}

	}

}
