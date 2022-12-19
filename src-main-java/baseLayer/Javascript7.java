package baseLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript7 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stus
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com");
Javascript7.enterData("email,Selenium Testing");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('email').value='testing';");


	}
	private static void enterData(String string) {
		// TODO Auto-generated method stub
		{
			
	}
	

	}

	
		
	}


