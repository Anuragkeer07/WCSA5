package practiceofframework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest extends FileLib implements PraIautoConstant
{
	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		FileLib fibs = new FileLib();
		String browser = fibs.readPropertyData(propath, "Browser");
		String url = fibs.readPropertyData(propath,"Url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty(chromeKey, chromeValue);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
			
		}
	
	}
	public void closebrowser()
	{
		driver.quit();
	}
	
}
