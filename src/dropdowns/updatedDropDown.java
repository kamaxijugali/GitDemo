package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class updatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Documents\\E_Drive\\Techm_backup\\Learning\\Selenium\\chromedriver_win32_version_111\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
	//	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		for (int i=0; i<=4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();*/
		
		driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);

		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

		i++;

		}*/

		 
		//*****************************************************************************************************   
		   driver.get("https://www.spicejet.com"); 
		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
