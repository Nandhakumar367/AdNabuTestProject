package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveObjectPage {
 
	public WebDriver driver;
	
	
	By searchIcon = By.cssSelector("header > .header__search");
	By WireEarring = By.cssSelector("[open] [type='search']");
	By Earringselect = By.cssSelector(".predictive-search__result-group:nth-of-type(2)");
	By Addtocart = By.cssSelector(".product-form__submit");
	By ContinueShopping = By.cssSelector(".button-label.link");
	By CatalogBtn = By.cssSelector("#HeaderMenu-catalog span");
	By InterlinkedEarring = By.cssSelector("li:nth-of-type(4) .card__heading.h5 > .full-unstyled-link");
	By CartIcon = By.cssSelector("#cart-notification-button");
	By DeleteBtn = By.cssSelector(".icon-remove");
	By CtnShopinViewcart = By.cssSelector(".title-wrapper-with-link .underlined-link");
	By Pendent = By.cssSelector("li:nth-of-type(2) .card__heading.h5 > .full-unstyled-link");
	By CheckoutBtn = By.cssSelector("button#checkout");
	
	public AddRemoveObjectPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getsearchIcon() {
		return driver.findElement(searchIcon);
	}
	public WebElement getWireEarring() {
		return driver.findElement(WireEarring);
	}
	public WebElement getEarringselect() {
		return driver.findElement(Earringselect);
	}
	public WebElement getAddtocart() {
		return driver.findElement(Addtocart);
	}
	public WebElement getContinueShopping() {
		return driver.findElement(ContinueShopping);
	}
	public WebElement getCatalogBtn() {
		return driver.findElement(CatalogBtn);
	}
	public WebElement getInterlinkedEarring() {
		return driver.findElement(InterlinkedEarring);
	}
	public WebElement getCartIcon() {
		return driver.findElement(CartIcon);
	}
	public WebElement getDeleteBtn() {
		return driver.findElement(DeleteBtn);
	}
	public WebElement getCtnShopinViewcart() {
		return driver.findElement(CtnShopinViewcart);
	}
	public WebElement getPendent() {
		return driver.findElement(Pendent);
	}
	public WebElement getCheckoutBtn() {
		return driver.findElement(CheckoutBtn);
	}
}
