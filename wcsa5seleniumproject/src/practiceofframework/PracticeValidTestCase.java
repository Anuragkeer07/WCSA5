package practiceofframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class PracticeValidTestCase extends PracticeTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		PracticeTest pt = new PracticeTest();
		pt.openBrowser();
		
		
		FileLib fibs = new FileLib();
		driver.findElement(By.name("username")).sendKeys(fibs.readPropertyData("./Data/config.properties","Username"));
		driver.findElement(By.name("pwd")).sendKeys(fibs.readPropertyData("./Data/config.properties","Password"));
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(5000);
		pt.closebrowser();
	}

}
