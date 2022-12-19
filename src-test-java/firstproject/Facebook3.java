package firstproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");

	}
}
