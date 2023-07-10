package framepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameOfBlueStone {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeOptions ch = new ChromeOptions();
		 ChromeOptions handle = ch.addArguments("--disable-notifications");
		 WebDriver driver=new ChromeDriver(handle);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.bluestone.com/");
		 /// To switch to the Frame
		 driver.switchTo().frame("fc_widget");
		 
		 driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		// for back to parent frame 
		 driver.switchTo().defaultContent();
		 
		

	}

}
