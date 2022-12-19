package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.PageClass;
import UtilsLayer.HandleDropDown;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageClass extends BaseClass {
	@Given("user is on register page")
	public void user_is_on_register_page() {
	  BaseClass.init();
	}

	@When("user enter valid firstname and lastname and usernameand password and DOB")
	public void user_enter_valid_firstname_and_lastname_and_usernameand_password_and_dob() {
	   PageClass reg=new PageClass();
	  reg.registeruser("amar", "salve", "amarsalve470@gmail.com", "amar123", "16", "Dec","1993" );
	System.out.println(  HandleDropDown.capturevalue(reg.getDay()));
	System.out.println(  HandleDropDown.capturevalue(reg.getMonth()));
	System.out.println(  HandleDropDown.capturevalue(reg.getYear()));
	}

	@Then("user click on Sign up button")
	public void user_click_on_sign_up_button() {
		System.out.println(driver.getCurrentUrl());
	    
	}

}
