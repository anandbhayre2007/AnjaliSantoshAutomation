package pages.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionLibrary.ApplicationLibrary;

public class HomePage {
	
	WebDriver dr;
	
	ApplicationLibrary lib= new ApplicationLibrary();
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
	}
	
	//WebElements
	By automobile=By.xpath("//div[@class='main-navigation']/ul/li/a[@id='nav_automobile']");
	By truck=By.xpath("//div[@class='main-navigation']/ul/li/a[@id='nav_truck']");
	By motorCycle=By.xpath("//div[@class='main-navigation']/ul/li/a[@id='nav_motorcycle']");
	By camper=By.xpath("//div[@class='main-navigation']/ul/li/a[@id='nav_camper']");
	
	public boolean isAutomobilePresent()
	{
		if(lib.isElementPresent(dr, automobile))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isTruckPresent()
	{
		if(lib.isElementPresent(dr, truck))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isMotorcyclePresent()
	{
		if(lib.isElementPresent(dr, motorCycle))
		{
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isCamperPresent()
	{
		if(lib.isElementPresent(dr, camper))
		{
			return true;
		}else {
			return false;
		}
	}
	
	
	public void clickAutomobile()
	{	
		dr.findElement(automobile).click();
	}
	
	public void clickTruck()
	{	
		dr.findElement(truck).click();
	}
	
	
	public void clickMotorcycle()
	{
		dr.findElement(motorCycle).click();
	}
	
	
	public void clickCamper()
	{	
	
		dr.findElement(camper).click();
	}
	
}
