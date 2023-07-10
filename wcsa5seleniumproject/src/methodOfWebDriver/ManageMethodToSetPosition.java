package methodOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetPosition {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Dimension size = new Dimension(500,350);
		Point point = new Point(250,150);
		driver.manage().window().setSize(size);
		driver.manage().window().setPosition(point);
		

	}

}
