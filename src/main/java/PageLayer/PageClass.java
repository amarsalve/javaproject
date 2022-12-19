package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;
import UtilsLayer.UtilsClass;

public class PageClass extends BaseClass{
	
	@FindBy(name="firstname")
	private WebElement fname;
	@FindBy(name="lastname")
	private WebElement lname;
	@FindBy(name="reg_email__")
	private WebElement uname;
	@FindBy(name="reg_passwd__")
	private WebElement pass;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	
	@FindBy(id="year")
	private WebElement year;
	
	public PageClass() {
		PageFactory.initElements(driver,this);
	}
	public void registeruser(String firstname,String lastname,String username,String password,String date,String months,String years) {
		UtilsClass.enterData(fname,firstname);
		UtilsClass.enterData(lname,lastname);
		UtilsClass.enterData(uname,username);
		UtilsClass.enterData(pass,password);
		 HandleDropDown.captureSelectedValue(day, date);
		 HandleDropDown.captureSelectedValue(month, months);
		 HandleDropDown.captureSelectedValue(year, years);
	}
	public WebElement getDay() {
		return day;
	}
	

	
	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}
	
		
	}
		
		
		
		
	
		


