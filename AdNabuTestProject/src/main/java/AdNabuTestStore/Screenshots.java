package AdNabuTestStore;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"//Users//nandhakumar//Desktop//Resources//Drivers_v1//chromedriver-mac-arm64//chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://adnabu-arjun.myshopify.com/");
		driver.manage().window().maximize();

		takeSnapShot(driver);

	}

	public static void takeSnapShot(WebDriver webdriver) throws IOException {
		File srcFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);

		File destFile = new File("//Users//nandhakumar//Desktop//Resources//Automation_Workspace//AdNabuTestProject//Screenshot//" + timestamp() + ".png");

		FileUtils.copyFile(srcFile, destFile);

	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
