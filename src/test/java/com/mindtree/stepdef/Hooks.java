package com.mindtree.stepdef;

import org.openqa.selenium.WebDriver;

import com.mindtree.steps.CatalogSteps;
import com.mindtree.tests.TestBase;
import com.mindtree.utility.TestUtility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Hooks {

	public static WebDriver driver;
	public static String browserSelection = "chrome";

	CatalogSteps catalogsteps = new CatalogSteps();
	public static TestBase tb = new TestBase();

	@Before(value = "@searchingForProduct", order = 2)
	public void Searchproduct() throws Exception {
		TestBase.ReadProperties();
		TestUtility.ReadExcelProperties();
		driver = tb.getDriver(browserSelection);
		System.out.println("================>selected browser =" + browserSelection);

		driver.get("https://jpetstore.aspectran.com/catalog/");

	}

	@Before(value = "@loginToAccount", order = 1)
	public void logIn() throws Exception {
		TestBase.ReadProperties();
		TestUtility.ReadExcelProperties();
		driver = tb.getDriver(browserSelection);
		System.out.println("================>selected browser =" + browserSelection);

		driver.get("https://jpetstore.aspectran.com/catalog/");

	}

	@Before(value = "@register", order = 3)
	public void registerForAnAccount() throws Exception {
		TestBase.ReadProperties();
		TestUtility.ReadExcelProperties();
		driver = tb.getDriver(browserSelection);

		System.out.println("================>selected browser =" + browserSelection);
		driver.get("https://jpetstore.aspectran.com/account/newAccountForm");

	}

	@Before(value = "@addToCart", order = 4)
	public void addToCart() throws Exception {
		TestBase.ReadProperties();
		TestUtility.ReadExcelProperties();
		driver = tb.getDriver(browserSelection);
		System.out.println("================>selected browser =" + browserSelection);

		driver.get("https://jpetstore.aspectran.com/catalog/");

	}

	@Given("user is successfully naviaged to {string}")
	public void user_is_successfully_naviaged_to(String url) {
		System.out.println(driver.getCurrentUrl().contains("https://jpetstore.aspectran.com")
				+ "      current url                         " + driver.getCurrentUrl());

		catalogsteps.isApplicationDispayed(driver.getCurrentUrl(), url);

	}

//	@AfterStep
//	public void Teardown(Scenario scenario) throws Exception {
//		tb.creatingExtentReport(extentTest, driver, screenshotPath, failedScreenshotPath, scenario);
//		report.flush();
//	}

	@After
	public void closingBrowser() {

//		  driver.quit();
	}

}
