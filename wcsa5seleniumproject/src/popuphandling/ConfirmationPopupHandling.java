package popuphandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopupHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/dell/Desktop/WCSA5/WebElement/confirmationpopup.html");
		driver.findElement(By.id("t1")).click();
		 Thread.sleep(2000);
		 Alert alt = driver.switchTo().alert(); 
		 
		 // alert is interface and switchTo() method of webDriver
		 // in method chaining the last method give the return type
		 
		 
	//	System.out.println(alt.getText());
		 
		 Thread.sleep(2000);
		 
		alt.dismiss(); // void return type
		
		// alt.accept();
	}

}
