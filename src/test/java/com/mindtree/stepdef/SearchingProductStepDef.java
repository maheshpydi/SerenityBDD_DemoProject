package com.mindtree.stepdef;

import com.mindtree.steps.CatalogSteps;
import com.mindtree.steps.HomePageSteps;
import com.mindtree.steps.LoginSteps;
import com.mindtree.steps.OrderPageSteps;
import com.mindtree.steps.ProductPageSteps;
import com.mindtree.steps.RegistrationSteps;
import com.mindtree.uiStore.CatalogHomePageUi;
import com.mindtree.uiStore.ProductpageUi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchingProductStepDef {
	CatalogSteps catalogSteps = new CatalogSteps();
	LoginSteps loginSteps = new LoginSteps();
	HomePageSteps homePageSteps = new HomePageSteps();
	ProductPageSteps productpage = new ProductPageSteps();
	RegistrationSteps registrationSteps = new RegistrationSteps();
	OrderPageSteps orderPageSteps = new OrderPageSteps();

	@When("user click on search button")
	public void user_click_on_search_button() {
		try {

			catalogSteps.clickOnElement(CatalogHomePageUi.searchedBox);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@And("user enter product {string} in search box")
	public void user_enter_product_in_search_box(String searchKeyword) {
		try {

			catalogSteps.sendkeysToLocator(CatalogHomePageUi.searchedBox, searchKeyword);
			catalogSteps.clickOnElement(CatalogHomePageUi.submitSearch);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Then("user will get search {string}")
	public void user_will_get_search(String searchResult) {
		try {

			productpage.isElementDisplayed(ProductpageUi.searchedProduct, searchResult);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
