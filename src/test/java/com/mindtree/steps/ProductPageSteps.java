package com.mindtree.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.mindtree.pageObjects.ProductPage;

public class ProductPageSteps {
ProductPage productpage=new ProductPage();
 
 

public void isElementDisplayed(WebElement searchedProduct, String string) {
	 Assert.assertTrue(productpage.isElementDisplayed(searchedProduct,string));
	
}



public void clickOnElement(WebElement selectProduct) {
	 productpage.clickOnElement(selectProduct);
	
}



public void sendKeysToElement(WebElement updatingQuantity, String string) {
 productpage.sendKeysToElement(updatingQuantity,string);
	
}



public void scrollAndClick(WebElement proceedTocheckout) {
	 productpage.scrollAndClick(proceedTocheckout);
	
}



public void jsClick(WebElement updatingCart) {
	 productpage.jsClick(updatingCart);
	
}
	 
	
}
