package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:/www.facebook.com");
WebElement wb=driver.findElement(By.name("email"));
wb.sendKeys("amar");

System.out.println(wb.isDisplayed());
System.out.println(wb.isEnabled());
System.out.println(wb.getText());
wb.click();


	}

}
