package AdNabuTestStore;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(resources.Listeners.class)
public class AddRemoveItem extends Hooks {
		
	public AddRemoveItem() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void placeOrder() throws InterruptedException, IOException {
		driver = getDriver();
		driver.get(geturl());

		//Adding item from Search
		driver.findElement(By.cssSelector(".header--has-localizations > .header__search:nth-child(2)")).click();
		driver.findElement(By.cssSelector("[open] [type='search']")).sendKeys("14k Wire Bloom Earrings ...");
		driver.findElement(By.cssSelector(".predictive-search__result-group:nth-of-type(2)")).click();
		//Add the product to cart
		driver.findElement(By.cssSelector(".product-form__submit")).click();
		//Continue Shopping
		driver.findElement(By.cssSelector(".button-label.link")).click();
		System.out.println("User has searched and added product to cart");
		
		
		//Go to Catalog and filter products
		driver.findElement(By.cssSelector("#HeaderMenu-catalog span")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li:nth-of-type(4) .card__heading.h5 > .full-unstyled-link")).click();
		driver.findElement(By.cssSelector(".product-form__submit")).click();
		
		
		//View cart and remove item
		driver.findElement(By.cssSelector("#cart-notification-button")).click();
		driver.findElement(By.cssSelector(".icon-remove")).click();
		System.out.println("User has deleted an item successfully");
		Thread.sleep(2000);
		
		
		//Adding item to cart by continueShopping
		driver.findElement(By.cssSelector(".title-wrapper-with-link .underlined-link")).click();
		driver.findElement(By.cssSelector("li:nth-of-type(2) .card__heading.h5 > .full-unstyled-link")).click();
		driver.findElement(By.cssSelector(".product-form__submit")).click();
		driver.findElement(By.cssSelector("#cart-notification-button")).click();
		//Checkout after removing the product
		driver.findElement(By.cssSelector("button#checkout")).click();
		//Test Script runs successfully
		System.out.println("Test Script runs successfully");
		
		
		
		driver.quit();
	}

}