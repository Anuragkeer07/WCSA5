package dropdownhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElementMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dell/Desktop/WCSA5/WebElement/Dropdownmultiple.html");
		
	    WebElement dropdwn = driver.findElement(By.id("menu"));
	    Select sel = new Select(dropdwn);
	    
	    ///By Using getOption()
//	   List<WebElement> option = sel.getOptions();
//	   
//	   for(WebElement we : option)
//	   {
//		   System.out.println(we.getText());
//	   }
	   
	     WebElement opt = sel.getWrappedElement();
	     System.out.println(opt.getText());

	}

}
