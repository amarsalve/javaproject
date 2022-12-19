package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		//firstname
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.click();
		firstname.sendKeys("Amar");
		
		//surname
			WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
			surname.click();
			surname.sendKeys("Salve");
			
		
		
	}

}
