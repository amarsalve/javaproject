package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nonstatic {
public boolean abc()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	String a=driver.getTitle();
	if(a.endsWith("up"))
	{
		return true;
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method is started");
Nonstatic obj=new Nonstatic();
boolean c=obj.abc();
System.out.println(c);
if(c)
{
	System.out.println("test case is pass");
	
}
else {
	System.out.println("test case is fail");
}
System.out.println("main method is closed");
	}

}
