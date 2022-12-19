package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button4 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver.","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
Thread.sleep(4000);
WebElement wb=driver.findElement(By.tagName("tfgjh46"));
System.out.println(wb.isDisplayed());
System.out.println(wb.isEnabled());
System.out.println(wb.getAttribute("value"));
wb.click();
	}



	}


