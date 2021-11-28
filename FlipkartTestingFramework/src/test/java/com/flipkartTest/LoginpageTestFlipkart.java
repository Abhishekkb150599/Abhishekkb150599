package com.flipkartTest;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.flipkartbase.FlipkartBase;
import com.flipkart.DashBoardPages;
import com.flipkart.LoginPageFlipkart;


@Test
public class LoginpageTestFlipkart extends FlipkartBase {
	DashBoardPages dp;
	LoginPageFlipkart lp ;
	
	public void setUp() {
		initialize();
		lp=new LoginPageFlipkart();
	}
	@Test
	public void validateTitleTest() {
		String expectedTitle = "Flipkart";
		String actualTitle = lp.validateTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		}
@Test
	
	public void validateLoginTest() {
		
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		dp=lp.validateLogin(username, password);
		if(dp!=null) {
			AssertJUnit.assertTrue(true);
		}else {
			AssertJUnit.assertTrue(false);
		}
		
		
		
		
	}

	
}
