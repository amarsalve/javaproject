package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/");
java.util.List<WebElement> ls=driver.findElements(By.tagName("a"));
ls.size();
System.out.println(ls.size());

	}

}
