package com.vtiger.stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends BaseDefination {
	LoginPage lp;
	HomePage hp;
@Given("user should navigate url {string}")
public void user_should_navigate_url(String string) throws Exception 
	{
		LauchApp();   
}
@Then("login page should be appear")
public void login_page_should_be_appear() {
	lp = new LoginPage(driver);
	lp.username_display();
}
@When("user enters valid userid and valid password")
public void user_enters_valid_userid_and_valid_password() {
	lp.enterusername("admin");
	lp.enterpassword("admin");
}
@When("user enters invalid userid and invalid password")
public void user_enters_invalid_userid_and_invalid_password() {
	lp.enterusername("admin123");
	lp.enterpassword("admin123");
}

@When("user enters invalid userid {string} and invalid password {string}")
public void user_enters_invalid_userid_and_invalid_password(String userid, String pwd) {
	lp.enterusername(userid);
	lp.enterpassword(pwd);
}
@When("user enters invalid userid {string} and invalid password {string} and click login")
public void user_enters_invalid_userid_and_invalid_password_and_click_login(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
   List<List<String>>data = dataTable.asLists();
   lp.enterusername(data.get(0).get(0));
   lp.enterpassword(data.get(0).get(1));
   lp.clickLoginButton();
   
   
}

@When("click on login button")
public void click_on_login_button() {
	lp.clickLoginButton();
}
@Then("user should be navigated to home page")
public void user_should_be_navigated_to_home_page() 
{
	hp = new HomePage(driver);
	
	
}
@Then("can see logout link appear on top right corner")
public void can_see_logout_link_appear_on_top_right_corner() {
	hp.clickLogout();
	driver.quit();
}




}
