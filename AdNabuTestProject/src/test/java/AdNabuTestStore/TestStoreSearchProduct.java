package AdNabuTestStore;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(resources.Listeners.class)
public class TestStoreSearchProduct extends Hooks {
	
	public TestStoreSearchProduct() throws IOException {
		super();
	}
	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(geturl());
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

	@Test
	public void SearchProduct() throws InterruptedException, IOException {

		driver = getDriver();
		driver.get(geturl());
		
		//Adding item from Search
		ExtentManager.log("Starting TestStoreSearchProduct" );
		
		driver.findElement(By.cssSelector(".header--has-localizations > .header__search:nth-child(2)")).click();
		driver.findElement(By.cssSelector("[open] [type='search']")).sendKeys("14k Wire Bloom Earrings ...");
		driver.findElement(By.cssSelector(".predictive-search__result-group:nth-of-type(2)")).click();
		ExtentManager.pass("Added the Bloom Earring");
		//Add the product to cart
		driver.findElement(By.cssSelector(".product-form__submit")).click();
		//Continue Shopping
		driver.findElement(By.cssSelector(".button-label.link")).click();
		System.out.println("User has searched and added product to cart");
		ExtentManager.pass("Added product to cart");

		//Go to Catalog and filter products
		driver.findElement(By.cssSelector("#HeaderMenu-catalog span")).click();
		//Select Filter of In-stock 
		Thread.sleep(2000);
		
		//Select Filter of best selling 
		driver.findElement(By.cssSelector("[aria-label='Availability \\(0 selected\\)']")).click();
		driver.findElement(By.cssSelector(".facets__item:nth-of-type(1) .facets__label")).click();
		ExtentManager.pass("Filter is selected for Availability");
		
		Select menuItem = new Select(driver.findElement(By.name("sort_by")));
		
		menuItem.selectByValue("best-selling");
		ExtentManager.pass("Filter is selected Bestselling");
		
		System.out.println("User has searched and filtered the product successfully");
		
		
		Thread.sleep(2000);
		
	}
	

}

