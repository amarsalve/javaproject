package ListWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://prafpawar11.github.io/emptable.html");
		List<WebElement> cols=driver.findElements(By.xpath("html/body/table/tbody/tr/th"));
		System.out.println(cols.size());
		List<WebElement> rows=driver.findElements(By.xpath("html/body/table/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> data=driver.findElements(By.xpath("html/body/table/tbody/tr/td"));
		System.out.println(data.size());
		for(WebElement abc:cols)
		{
			System.out.println("table heading is"+abc.getText());
		}
		System.out.println("--------------------------------");
		for(int i=0;i<data.size();i++)
		{
			String a=data.get(i).getText();
			System.out.println(a);
		}
	}

}
