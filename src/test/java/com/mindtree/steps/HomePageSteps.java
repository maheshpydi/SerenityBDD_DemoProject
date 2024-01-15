package com.mindtree.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.mindtree.pageObjects.HomePage;

public class HomePageSteps {
    HomePage homePage=new HomePage();
	public void isLocatorDisplayed(WebElement signOut) {
	Assert.assertTrue("element not dispalyed",homePage.isLocatorDisplayed(signOut)); 
		 
		
	}
	public void clickOnElement(WebElement selectingFishProduct) {
		homePage.clickOnElement(selectingFishProduct);
			
		
	}

}
