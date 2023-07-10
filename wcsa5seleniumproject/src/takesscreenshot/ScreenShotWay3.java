package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotWay3 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//by creating object of browser specific class 
		
		ChromeDriver chdriver = new ChromeDriver();
		chdriver.manage().window().maximize();
		chdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chdriver.get("https://www.selenium.dev/");
		
		 File src = chdriver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshots/selenium.png");
		 Files.copy(src, dest);
		 
		 Thread.sleep(2000);
		 chdriver.quit();

	}

}
