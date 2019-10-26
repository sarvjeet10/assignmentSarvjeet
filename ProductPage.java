package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import pac.Actions;
import stepDefinition.FlipCart;

public class ProductPage extends FlipCart{


	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	private WebElement electronicSection;

	@FindBy(xpath = "//a[contains(text(),'Pixel 3a | 3a XL')]")
	private WebElement PixelLnk;

	@FindBy(xpath = "//div[contains(text(),'Google Pixel 3a (Just Black, 64 GB)')]")
	private WebElement pixelBlack;

	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addTocart;

	@FindBy(xpath = "//button[text()='+']")
	private WebElement totalItem;

	@FindBy(xpath = "//div[@class='_3xFQAD']//span[contains(text(),'59,998')]")
	private WebElement price;

	public void selectPixelPhone() {
		Actions act = new Actions(driver);
		act.moveToElement(electronicSection).perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PixelLnk.click();
		pixelBlack.click();
		addTocart.click();
		totalItem.click();

	}

	public String totalPrice() {
		return price.getText();
	}

}
