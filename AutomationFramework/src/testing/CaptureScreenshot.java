package testing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		
		  System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe")
		  ; ChromeDriver dr= new ChromeDriver();
		  
		  //How to maximize the browser 
		  dr.manage().window().maximize();
		  
		  //Navigate to URL 
		  dr.get("https://www.w3schools.com/html/html_tables.asp");
		  
		  TakesScreenshot screenshot=(TakesScreenshot)dr; File
		  src=screenshot.getScreenshotAs(OutputType.FILE);
		  
		  String name=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		  FileHandler.copy(src, new File(
		  "D:\\AutomationBatch1\\AutomationBatch1\\AutomationFramework\\Screenshots\\testing_"+name+".png"
		  ));
		 
	
	}

}
