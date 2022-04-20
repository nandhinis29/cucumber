package org.stepdefenition1;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.pojo.ForgottonPassPojo;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefenition1 extends BaseClass {

	
	@Given("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() throws InterruptedException {
		ForgottonPassPojo f=new ForgottonPassPojo();
		btnClick(f.getBtnFrgtPass());
		Thread.sleep(3000);
	}

	@When("User have to enter email or mobileno")
	public void user_have_to_enter_email_or_mobileno() {
		ForgottonPassPojo f=new ForgottonPassPojo();
		
		fill(f.getTxtSearchBox(), "98989898989");
		
		}

	@Then("User have to click the search button")
	public void user_have_to_click_the_search_button() {
		ForgottonPassPojo f=new ForgottonPassPojo();
		btnClick(f.getBtnSearch());
			}

	
	@When("user have to enter Invalid username and invalid password")
	public void user_have_to_enter_Invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
	  	
		Map<String, String> asMap = d.asMap(String.class, String.class); 		
		String emailID= asMap.get("email"); 
		String password = asMap.get("password"); 		 	
		LoginPojo l = new LoginPojo(); 	
		fill(l.getTxtEmail(), emailID); 
		fill(l.getTxtpass(), password); 		 		 		    
	}

	@When("user have to enter Invalid username and valid password")
	public void user_have_to_enter_Invalid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
	 List<Map<String, String>> asMaps = d.asMaps(); 
	String email = asMaps.get(1).get("email");
	String pass = asMaps.get(1).get("password");
	LoginPojo l = new LoginPojo(); 	
	fill(l.getTxtEmail(), email); 
	fill(l.getTxtpass(), pass); 		 		 		    

	
	
	}


	

	@When("User Click login button")
	public void user_Click_login_button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);

	}

	@Then("User should be in invalid Credentials page")
	public void user_should_be_in_invalid_Credentials_page() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("hgh", url.contains("https://www.facebook.com/login/"));
	}

}
