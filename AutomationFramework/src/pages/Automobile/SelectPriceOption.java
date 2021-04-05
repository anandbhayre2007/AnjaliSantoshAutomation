package pages.Automobile;

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
	By selectsilver=By.id("selectsilver");
	By selectgold=By.id("selectgold");
	By selectplatinum = By.id("selectplatinum");
	By selectultimate = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[4]/section[1]/div[1]/table[1]/tfoot/tr/th[2]/label[4]/span[1]");
	By nextsendquote = By.xpath("//button[@id='nextsendquote']");
	
	
//	Visibility
	
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
	
//	Actions
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
