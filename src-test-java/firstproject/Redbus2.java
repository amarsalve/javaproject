package firstproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		
		driver.manage().window().maximize();

		List<WebElement> countryList = driver.findElements(By.xpath("//span[@class='flag-name']"));
		int count = countryList.size();
		for (int i = 0; i <= count; i++) {
			WebElement countrynew = countryList.get(i);
			String countryNameact = countrynew.getText();
			System.out.println(countryNameact);
		}
		

	}

}
