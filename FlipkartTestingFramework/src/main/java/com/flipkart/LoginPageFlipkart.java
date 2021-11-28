package com.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkartbase.FlipkartBase;
import com.flipkart.DashBoardPages;

public class LoginPageFlipkart extends FlipkartBase {

	public LoginPageFlipkart() {
		PageFactory.initElements(driver, this);
		;
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")
	WebElement username;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input")
	WebElement password;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[4]/button/span")
	WebElement login;

	public String validateTitle() {
		return driver.getTitle();
	}

	public DashBoardPages validateLogin(String a, String b) {
		username.sendKeys(a);
		password.sendKeys(b);
		login.click();
		return new DashBoardPages();

	}

}
