package pages.Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import functionLibrary.ApplicationLibrary;

public class EnterProductData {
	
	WebDriver dr;
	ApplicationLibrary lib= new ApplicationLibrary();
	
	public EnterProductData(WebDriver dr)
	{
		this.dr=dr;
	}
	
	//WebElements
	By startDate=By.id("startdate");
	By insuranceSum=By.xpath("//select[@id='insurancesum']");
	By meritRating = By.id("meritrating");
	By damageInsurance = By.id("damageinsurance");
	By optionalProducts = By.xpath("//label[text()='Optional Products']");
	By courtesyCar = By.id("courtesycar");
	By prevButton = By.xpath("//button[@name='Prev (Enter Vehicle Data)']");
	By nextButton = By.xpath("//button[@id='nextenterproductdata']");
	
	//Visibility
	public boolean isStartDatePresent()
	{
		return lib.isElementPresent(dr, startDate);
		
	}
	
	public boolean isInsuranceSumPresent()
	{
		return lib.isElementPresent(dr, insuranceSum);
	}
	
	public boolean isMeritRatingPresent()
	{
		return lib.isElementPresent(dr,meritRating);
	}
	
	public boolean isDamageInsurancePresent()
	{
		return lib.isElementPresent(dr,damageInsurance);
	}
	
	public boolean isOptionalProductsPresent()
	{
		return lib.isElementPresent(dr,optionalProducts);
	}
	
	public boolean isCourtesyCarPresernt()
	{
		return lib.isElementPresent(dr,courtesyCar);
	}
	
	public boolean isPrevButtonPresent()
	{
		return lib.isElementPresent(dr,prevButton);
	}
	
	public boolean isNextButtonPresent()
	{
		return lib.isElementPresent(dr,nextButton);
	}
	
	
	//Actions
	public void enterStartDate(String data )
	{
		dr.findElement(startDate).sendKeys(""+data);
	}
	
	public void enterInsuranceSum(int data)
	{
		Select sel = new Select(dr.findElement(insuranceSum));
		sel.selectByIndex(data);
	}
	
	public void enterMeritRating(int data)
	{
		Select sel = new Select(dr.findElement(meritRating));
		sel.selectByIndex(data);
	}
	
	public void enterDamageInsurance(int data)
	{
		Select sel = new Select(dr.findElement(damageInsurance));
		sel.selectByIndex(data);
	}
	
	public void enterOptionalProducts()
	{
		dr.findElement(By.xpath("//input[@id='EuroProtection']")).click();
	}
	
	public void enterCourtesyCar(int data)
	{
		Select sel = new Select(dr.findElement(courtesyCar));
		sel.selectByIndex(data);
	}
	
	public void enterNextSelectPriceOption()
	{
		dr.findElement(nextButton).click();
	}

}
