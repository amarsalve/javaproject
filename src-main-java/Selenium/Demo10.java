package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://en.wikipedia.org/wiki/Main_Page");
	String a=driver.getCurrentUrl();
	int b=a.length();
	System.out.println(b);
	Thread.sleep(5000);
	driver.navigate().to("https://www.amazon.com/");
	//capture url
	String c=driver.getCurrentUrl();
	System.out.println(c);
	Thread.sleep(5000);
	//navigate back
	driver.navigate().back();
	//capture title and
	//it title contains the wikipedia keyword then revers it.
	String d=driver.getTitle();
	if(d.equals("Wikipedia"))
	{
		char[]abc=d.toCharArray();
		for(int i=abc.length-1;i>=0;i--)
		{
			System.out.println(abc[i]);
			
		}
		System.out.println(abc);
		System.out.println("Title test case is pass");
	}
	else {
		System.out.println("Title test case is fail");
		
	}
	
	}

}
