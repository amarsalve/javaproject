package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{


public static void captureSelectedValue(WebElement wb,String value) {
	
	 new Select(wb).selectByVisibleText(value);
}

public static String capturevalue(WebElement day ) {
	// TODO Auto-generated method stub
	return new Select(day).getFirstSelectedOption().getText();
}
}
