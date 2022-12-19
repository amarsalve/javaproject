package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nonstatic4 {
public boolean abc()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	String a=driver.getTitle();
	if(a.contains("Facebook"))
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
Nonstatic4 obj=new Nonstatic4();
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
