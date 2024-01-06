package AdNabuTestStore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Basepage {

	public static WebDriver driver;
	private String url;
	private Properties prop;
	public static String screenShotDestinationPath;
	
	public Basepage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream("/Users/nandhakumar/Desktop/Resources/Automation_Workspace/AdNabuTestProject/src/main/java/resources/config.properties");
		prop.load(data);
	}
	
	public static WebDriver getDriver() throws IOException {
		return WebDriverInstance.getDriver();
	}
	public String geturl() throws IOException {
		url= prop.getProperty("url");
		return url;
	}
	public  static String takeSnapShot(String name) throws WebDriverException, IOException {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

		String destFile = System.getProperty("user.dir") + "/Screenshot/" + timestamp() + ".png";
		screenShotDestinationPath = destFile;
		
		try {
			FileUtils.copyFile(srcFile, new File(destFile));
		}catch(IOException e) {
			e.printStackTrace();
		}
		return name;

	}
	
	public static  String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	public static String getScreenshotDestinationPath() {
		return screenShotDestinationPath;
	}

}

