package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestTest extends Flib implements IautoConstant 
{
	static WebDriver driver;
           public void openBrowser() throws IOException
           {
        	   Flib flib = new Flib();
        	   String browservalue = flib.readPropertyData(propPath,"Browser");
        	   String url = flib.readPropertyData(propPath,"Url");
        	  
        	   if (browservalue.equalsIgnoreCase("chrome")) 
        	   {
				
        		   System.setProperty(chromekey, chromevalue);
        		   driver=new ChromeDriver();
        		   driver.manage().window().maximize();
        		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        		   driver.get(url);
			}
        	   else if (browservalue.equalsIgnoreCase("firefox")) 
        	   {
				
        		   System.setProperty(firefoxkey, firefoxvalue);
        		   driver=new FirefoxDriver();
        		   driver.manage().window().maximize();
        		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        		   driver.get(url);
			}
        	   else if (browservalue.equalsIgnoreCase("edge"))
        	   {
				
        		   System.setProperty(edgekey, edgrvalue);
        		   driver=new EdgeDriver();
        		   driver.manage().window().maximize();
        		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        		   driver.get(url);
			}
        	   
           }
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
