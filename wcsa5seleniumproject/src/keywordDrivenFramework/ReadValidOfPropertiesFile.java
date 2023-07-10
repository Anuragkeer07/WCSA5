package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ReadValidOfPropertiesFile extends BestTest implements IautoConstant{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BestTest best = new BestTest();
		best.openBrowser();
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(propPath, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(propPath, "Password"));
		driver.findElement(By.id("loginButton")).click();
	    
		Thread.sleep(3000);
		best.closeBrowser();

	}
	

}
