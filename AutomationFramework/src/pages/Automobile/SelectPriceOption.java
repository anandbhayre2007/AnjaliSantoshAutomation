package pages.Automobile;

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
	By selectultimate = By.id("selectultimate");
	By nextsendquote = By.id("nextsendquote");
	
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
	
	
}
