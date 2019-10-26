package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import stepDefinition.Amazon;

public class CAmazonPage extends Amazon{


	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchTextBox;

	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
	private WebElement searchBtn;

	@FindBy(xpath = "//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//div[@class='s-include-content-margin s-border-bottom']//div[@class='a-section a-spacing-medium']//div[@class='sg-row']//div[@class='sg-col-4-of-12 sg-col-8-of-16 sg-col-16-of-24 sg-col-12-of-20 sg-col-24-of-32 sg-col sg-col-28-of-36 sg-col-20-of-28']//div[@class='sg-col-inner']//div[@class='sg-row']//div[@class='sg-col-4-of-24 sg-col-4-of-12 sg-col-4-of-36 sg-col-4-of-28 sg-col-4-of-16 sg-col sg-col-4-of-20 sg-col-4-of-32']//div[@class='sg-col-inner']//div[@class='a-section a-spacing-none a-spacing-top-small']//div[@class='a-row a-size-base a-color-base']//div[@class='a-row']//a[@class='a-size-base a-link-normal s-no-hover a-text-normal']//span[@class='a-price']//span//span[@class='a-price-whole'][contains(text(),'23,999')]")
	private WebElement amazonPrice;

	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement flipCartSearchBox;

	@FindBy(xpath = "//body/div[@id='container']/div/div[@class='_3ybBIU']/div[@class='_1tz-RS']/div[@class='_3pNZKl']/div[@class='Y5-ZPI']/form[@class='_1WMLwI header-form-search']/div[@class='col-12-12 _2tVp4j']/button[@class='vh79eN']/*[1]")
	private WebElement flipcartSearchBtn;

	@FindBy(xpath = "//div[@class='_1HmYoV _35HD7C']//div[2]//div[1]//div[1]//div[1]//a[1]//div[2]//div[2]//div[1]//div[1]//div[1]")
	private WebElement flipcartPrice;

	public void amazonSearchBox() {
		searchTextBox.sendKeys(" ​iPhone 7 32 gb(black)");
		searchBtn.click();
		}

	public Integer amazonPrice() {
		String price = amazonPrice.getText();
		Integer i=Integer.valueOf(price);  
		return i;
	}
	
	public void flipcartSearchBox() {
		flipCartSearchBox.sendKeys(" ​iPhone 7 32 gb(black)");
		flipcartSearchBtn.click();
		}
	
	public Integer flipcartPrice() {
		String price = flipcartPrice.getText();
		Integer i=Integer.valueOf(price);  
		return i;
	}

}
