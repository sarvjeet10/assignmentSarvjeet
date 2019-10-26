package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.CAmazonPage;

/**
 * @author Sarvjeet
 */
public class Amazon {

	public WebDriver driver;
	

	public void AmazonflipCartphonecompare()
			{
		
		driver.get("http://www.amazon.com/");
		CAmazonPage apage = PageFactory.initElements(driver, CAmazonPage.class);
		int aprice = apage.amazonPrice();
		driver.get("http://www.flipcart.com/");
		int fprice = apage.flipcartPrice();
		if(aprice>fprice){
			System.out.println("Flipcart price is  lesser than the Amazon and lowset price is :"+fprice );
		}
		
}
		
}

	