package pages.Motorcycle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionLibrary.ApplicationLibrary;

public class SelectPriceOption {
	
	WebDriver dr;
	ApplicationLibrary lib= new ApplicationLibrary();
	
	public SelectPriceOption(WebDriver dr)
	{
		this.dr=dr;
	}
	
	//WebElements
	By selectsilver=By.xpath("//label[@class='choosePrice ideal-radiocheck-label'][1]/span");
	By selectgold=By.xpath("//label[@class='choosePrice ideal-radiocheck-label'][2]/span");
	By selectplatinum = By.xpath("//label[@class='choosePrice ideal-radiocheck-label'][3]/span");
	By selectultimate = By.xpath("//label[@class='choosePrice ideal-radiocheck-label'][4]/span");
	By nextsendquote = By.xpath("//div[@class='field buttons margin-top-20']//button[@id='nextsendquote']");
	
	public boolean isselectsilver()
	{
		return lib.isElementPresent(dr,selectsilver);
	}
	
	public boolean isselectgold()
	{
		return lib.isElementPresent(dr,selectgold);
	}

	public boolean isselectplatinum()
	{
		return lib.isElementPresent(dr,selectplatinum);
	}
	
	public boolean isselectultimate()
	{
		return lib.isElementPresent(dr,selectultimate);
	}
	
	public boolean isnextsendquote()
	{
		return lib.isElementPresent(dr,nextsendquote);
	}
	
	public void clickSelectUltimate()
	{
		dr.findElement(selectultimate).click();
	}
	
	public void clickNextSendQuote()
	{
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(nextsendquote).click();
	}
	
	
}
