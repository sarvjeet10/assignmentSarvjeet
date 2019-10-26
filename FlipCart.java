package stepDefinition;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.ProductPage;
import Pages.USSchoolList;
import Pages.pwdChange;
import Util.Constants;
import Util.ScreenShot;
import Util.WebDriverCommonLib;
import Util.log4jLib;
import Util.webConnect;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Sarvjeet
 */
public class FlipCart {

	public WebDriver driver;
	

	public void flipCartphone()
			{
		
		driver.get("http://www.flipkart.com/");
		ProductPage pPage = PageFactory.initElements(driver, ProductPage.class);
		pPage.selectPixelPhone();
		System.out.println("Total Price of the product is: "+ pPage.totalPrice());
}
		
}

	