package firstproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkbox1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");
WebElement wb=driver.findElement(By.id("checkbox1"));
boolean a=wb.isDisplayed();
System.out.println(a);
boolean b=wb.isEnabled();
System.out.println(b);
boolean c=wb.isSelected();
System.out.println(c);
wb.click();
boolean d=wb.isSelected();
System.out.println(d);
Thread.sleep(4000);
wb.clear();
	}

}
