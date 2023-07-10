package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotByDownCasting {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//upcasting the webdriver
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// downcast the remotewebdriver
		
		RemoteWebDriver remote = (RemoteWebDriver) driver;
		 File src = remote.getScreenshotAs(OutputType.FILE);
		
		 File destination = new File("./Screenshots/instagram.jpg");
		 
		 Files.copy(src, destination);
		 
		 Thread.sleep(2000);
		 driver.quit();



	}

}
