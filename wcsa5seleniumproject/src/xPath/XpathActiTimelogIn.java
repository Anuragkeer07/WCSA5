package xPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathActiTimelogIn {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		driver.get("http://desktop-5fc7c7e/login.do");
		driver.manage().window().maximize();

	}

}
