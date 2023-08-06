package WebElementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
WebElement pune=driver.findElement(By.name("radiooptions"));
boolean a=pune.isDisplayed();
System.out.println(a);
boolean b=pune.isEnabled();
System.out.println(b);
boolean c=pune.isSelected();
System.out.println(c);
pune.click();
boolean d=pune.isSelected();
System.out.println(d);
	}

}