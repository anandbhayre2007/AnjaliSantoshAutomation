package pages.Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionLibrary.ApplicationLibrary;

public class EnterVehicleData {
	
	WebDriver dr;
	ApplicationLibrary lib= new ApplicationLibrary();
	
	public EnterVehicleData(WebDriver dr)
	{
		this.dr=dr;
	}
	
	//WebElements
	By make=By.id("make");
	By enginePerformance=By.id("engineperformance");
	/*
	 * You need to add more elements
	 * 
	 */
	
	//Visibility
	public boolean isEnginePerformancePresent()
	{
		return lib.isElementPresent(dr, enginePerformance);
		
	}
	
	public boolean isMakePresent()
	{
		return lib.isElementPresent(dr, make);
	}
	
	//Actions
	public void enterEnginePerformance(int data)
	{	
		dr.findElement(enginePerformance).sendKeys(""+data);
	}
	
}
