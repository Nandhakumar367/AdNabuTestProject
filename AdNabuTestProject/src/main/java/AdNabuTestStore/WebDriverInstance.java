package AdNabuTestStore;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInstance {
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		if (driver.get() == null) {

			try {
				driver.set(createDriver());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return driver.get();
	}

	public static  WebDriver createDriver() throws IOException {
		WebDriver driver = null;

		Properties prop = new Properties();
		try {
            prop.load(WebDriverInstance.class.getClassLoader().
                    getResourceAsStream("config.properties"));
            System.out.println(prop);
        } catch(Exception e) {
            e.printStackTrace();
        }
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"//Users//nandhakumar//Desktop//Resources//Drivers_v1//chromedriver-mac-arm64//chromedriver");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/Users/nandhakumar/Desktop/Resources/Drivers_v1/geckodriver ");
			driver = new FirefoxDriver();
		}else {
			System.setProperty("webdriver.chrome.driver",
					"//Users//nandhakumar//Desktop//Resources//Drivers_v1//chromedriver-mac-arm64//chromedriver");
			driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
}
	public static void cleanupDriver() {
		driver.get().quit();
		driver.remove();
	}

}