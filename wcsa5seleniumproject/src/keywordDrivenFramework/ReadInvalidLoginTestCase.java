package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ReadInvalidLoginTestCase  extends BestTest{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BestTest bt = new BestTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		int rc = flib.getLastRowCount(excelPath,"InvalidCredential");
		
		for(int i=1;i<rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(excelPath, "InvalidCredential", i,0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(excelPath,"InvalidCredential", i, 1));
			
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		
		}
		Thread.sleep(3000);
		bt.closeBrowser();

		

	}

}
