package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.utilities.CommonFunctions;

public class LoginPage {
	//Page  object Model  >> design pattern
	
	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user_name")
	WebElement tb_username;
	
	@FindBy(name = "user_password")
	WebElement tb_password;
	
	@FindBy( name = "Login")
	WebElement btn_Login;
	
	/*
	  public void Login(String Userid, String pwd)
	{
//		driver.findElement(tb_username).clear();
//		driver.findElement(tb_username).sendKeys(Userid);
//		driver.findElement(tb_password).clear();
//		driver.findElement(tb_password).sendKeys(pwd);
//		driver.findElement(btn_Login).click();
	}
	 */
	
/*
	By tb_username = By.name("user_name");
	By tb_password = By.name("user_password");
	By btn_Login = By.name("Login");
	public void Login(String Userid, String pwd)
	{
		tb_username.clear();
		tb_username.sendKeys(Userid);
		tb_password.clear();
		tb_password.sendKeys(pwd);
		btn_Login.click();
	}
 */
	
	public void Login(String Userid, String pwd)
	{	
		CommonFunctions.EnterValue(driver, tb_username, Userid);
		CommonFunctions.EnterValue(driver, tb_password, pwd);
		CommonFunctions.CLickElement(driver, btn_Login);

	}
	public void enterusername(String Userid)
	{
		CommonFunctions.EnterValue(driver, tb_username, Userid);
	}

	public void enterpassword(String pwd)
	{
		CommonFunctions.EnterValue(driver, tb_password, pwd);
	}
	public void clickLoginButton()
	{
		CommonFunctions.CLickElement(driver, btn_Login);
	}
	public boolean username_display()
	{
		return tb_username.isDisplayed();
	}
}
