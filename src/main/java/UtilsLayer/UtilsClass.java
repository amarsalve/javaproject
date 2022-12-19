package UtilsLayer;



import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {
	public static void enterData(WebElement wb,String value) {
		if((wb.isDisplayed())&&(wb.isEnabled())) {
			wb.sendKeys(value);
		}
	}

	
		
	}

	
		
	

