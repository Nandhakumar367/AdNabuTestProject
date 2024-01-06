package AdNabuTestStore;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks extends Basepage {

	public Hooks() throws IOException {
		super();
	}

	@BeforeTest
	public void setup() throws IOException {
		getDriver().get(geturl());
	}
	@AfterMethod
	@AfterTest
	public void teardown() {
		WebDriverInstance.cleanupDriver();
	}
	
}
