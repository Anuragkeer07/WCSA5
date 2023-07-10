package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.Require.FileStateChecker;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenshotWay5 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.flipkart.com/");
		 
		  EventFiringWebDriver efw = new EventFiringWebDriver(driver); 
		 File src = efw.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshots/way5.png");
		 Files.copy(src, dest);
		 Thread.sleep(2000);
		 driver.quit();
		

	}

}
