package AdNabuTestStore;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.AddRemoveObjectPage;
@Listeners(resources.Listeners.class)
public class AddRemoveItemTestcase extends Hooks {

	public AddRemoveItemTestcase() throws IOException {
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
	public void placeOrder() throws IOException {
		ExtentManager.log("Starting AddRemoveItemTestcase..." );
		AddRemoveObjectPage Search = new AddRemoveObjectPage(driver);
		Search.getsearchIcon().click();
		
		AddRemoveObjectPage WireEaring = new AddRemoveObjectPage(driver);
		WireEaring.getWireEarring().sendKeys("14k Wire Bloom Earrings ...");
		
		AddRemoveObjectPage selectEarring = new AddRemoveObjectPage(driver);
		ExtentManager.pass("Added the Bloom Earring");
		selectEarring.getEarringselect().click();
		
		AddRemoveObjectPage addcart = new AddRemoveObjectPage(driver);
		addcart.getAddtocart().click();
		
		AddRemoveObjectPage Ctnshop = new AddRemoveObjectPage(driver);
		ExtentManager.pass("Clicked continue shopping in popup");
		Ctnshop.getContinueShopping().click();
		
		AddRemoveObjectPage catalog = new AddRemoveObjectPage(driver);
		ExtentManager.pass("Clicked catalog button");
		catalog.getCatalogBtn().click();
		
		AddRemoveObjectPage interlink = new AddRemoveObjectPage(driver);
		interlink.getInterlinkedEarring().click();
		
		AddRemoveObjectPage addcart2 = new AddRemoveObjectPage(driver);
		ExtentManager.pass("Added interlinked earring in cart");
		addcart2.getAddtocart().click();
		
		AddRemoveObjectPage cart = new AddRemoveObjectPage(driver);
		cart.getCartIcon().click();
		
		AddRemoveObjectPage DeleteBtn = new AddRemoveObjectPage(driver);
		ExtentManager.pass("Deleted one item from cart");
		DeleteBtn.getDeleteBtn().click();
		
		AddRemoveObjectPage CtnShopincart = new AddRemoveObjectPage(driver);
		CtnShopincart.getCtnShopinViewcart().click();
		
		AddRemoveObjectPage pendent = new AddRemoveObjectPage(driver);
		pendent.getPendent().click();
		
		AddRemoveObjectPage addcart3 = new AddRemoveObjectPage(driver);
		ExtentManager.pass("Added another product in cart");
		addcart3.getAddtocart().click();
		
		AddRemoveObjectPage cart2 = new AddRemoveObjectPage(driver);
		cart2.getCartIcon().click();
		ExtentManager.pass("Test Script runs successfully Reports Generated");
		
		AddRemoveObjectPage checkout = new AddRemoveObjectPage(driver);
		checkout.getCheckoutBtn().click();
		
		System.out.println("Test Script runs successfully");
		
	
	}
}
