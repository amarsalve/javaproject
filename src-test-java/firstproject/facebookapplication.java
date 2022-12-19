package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("wbdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/re");
WebElement wb=driver.findElement(By.id("month"));
Select sel=new Select(wb);
sel.selectByValue("3");
WebElement abc=sel.getFirstSelectedOption();
String a=abc.getText();
System.out.println(a);
}

}
