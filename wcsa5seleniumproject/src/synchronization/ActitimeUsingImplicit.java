package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeUsingImplicit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://desktop-5fc7c7e/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  String logintitle = driver.getTitle();
	  
	  if(logintitle.equals("actiTIME - Login"))
	  {
		   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		   driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		   System.out.println("Testcase Match");
		   
	  }
	  else
	  {
		  System.out.println("TesCase Not Match");
		  
	  }
	  
	  String homepagetitle = driver.getTitle();
		 System.out.println(homepagetitle);
	  
	 
	 
	 if(homepagetitle.equals("actiTIME - Enter Time-Track"))
	 {
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 System.out.println("TestCase of HomePageTitle is  Match");
	 }
	 else
	 {
		 System.out.println("TestCase of HomePageTitle is not Match");
	 }

	}

}
