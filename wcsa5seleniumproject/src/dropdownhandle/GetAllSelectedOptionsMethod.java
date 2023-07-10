package dropdownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WCSA5/WebElement/Dropdownmultiple.html");
		
	    WebElement dropdwn = driver.findElement(By.id("menu"));
	   Select sel = new Select(dropdwn);
	   
	   
	   for(int i=0;i<=6;i++)
	   {
		   Thread.sleep(1000);
		   sel.selectByIndex(i);
	   }
	   
	    List<WebElement> opt = sel.getAllSelectedOptions();
	      
//	    for(WebElement we : opt)
//	    {
//	    	System.out.println(we.getText());
//	    }
	    
	    for(int i=0;i<opt.size();i++)
	    {
	    	System.out.println(opt.get(i).getText());
	    }

	}

}
