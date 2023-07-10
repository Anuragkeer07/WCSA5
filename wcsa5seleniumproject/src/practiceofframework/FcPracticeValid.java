package practiceofframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class FcPracticeValid extends PracticeTest implements PraIautoConstant 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		PracticeTest pt = new PracticeTest();
		pt.openBrowser();
		
		 FileLib fibs = new FileLib();
		
		 driver.findElement(By.id("email")).sendKeys(fibs.readPropertyData(propath, "Username"));
		 driver.findElement(By.id("pass")).sendKeys(fibs.readPropertyData(propath, "Password"));
		 
		 driver.findElement(By.name("login")).click();
		 
		 Thread.sleep(5000);
		 
		 pt.closebrowser();
	}

}
