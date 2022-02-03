package pages;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;





public class TestBase {
	public static WebDriver driver;

	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://techfios.com/billing/?ng=admin");

	}


     public static void takeScreenshot(WebDriver driver) throws IOException {
    	  TakesScreenshot ts = (TakesScreenshot)driver;
    	  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
    	  String currentDirectory = System.getProperty("user.dir");  
    	  SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
    	  Date date = new Date();
    	  String label = formatter.format(date);  
    	  FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + label + ".png"));
     }

     public static int generateRandomNum(int i) {
 		Random radom = new Random();
 		int generatedNum = radom.nextInt(999);
 		return generatedNum;
//
//
} 
     
// 	public void tearDown() {
// 		driver.close();
// 		driver.quit();
 		
 	}
//}