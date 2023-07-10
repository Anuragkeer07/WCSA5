package practiceofgetwindowhandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyntryEndtoEndAutomate {
 static int a =10;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions op = new ChromeOptions();
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/mobile-accessories/karwan/karwan-3d-astronaut-holster-iphone-14-plus-phone-back-case-with-folding-stand/22843644/buy");
		WebElement co = driver.findElement(By.xpath("//strong[text()='₹499']"));
		String s = co.getText();
		
		int b = Integer.parseUnsignedInt(s);
		if(a>=b)
		{
			System.out.println("jbbjjbc");
		}
		
		
		

	}

}
