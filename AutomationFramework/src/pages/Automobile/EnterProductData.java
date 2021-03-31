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
	By startdate=By.id("startdate");
	By insurancesum=By.id("insurancesum");
	By meritrating = By.id("meritrating");
	By damageinsurance = By.id("damageinsurance");
	By EuroProtection = By.id("EuroProtection");
	By LegalDefenseInsurance = By.id("LegalDefenseInsurance");
    By courtesycar =By.id("courtesycar");
    By nextselectpriceoption = By.id("nextselectpriceoption");
    public boolean isStartDatePresent()
	{
		return lib.isElementPresent(dr, startdate);
		
	}
    
    public boolean isInsuranceSumPresent()
	{
		return lib.isElementPresent(dr, insurancesum);
		
	}
    
    public boolean isMeritRating()
	{
		return lib.isElementPresent(dr, meritrating);
		
	}
    
    public boolean isDamageInsurancePresent()
	{
		return lib.isElementPresent(dr, damageinsurance);
		
	}
    
    public boolean isEuroProtection()
	{
		return lib.isElementPresent(dr, EuroProtection);
		
	}
    
    public boolean isLegalDefenseInsurancePresent()
	{
		return lib.isElementPresent(dr, LegalDefenseInsurance);
		
	}
    
    
    
    public boolean isnextselectpriceoptionPresent()
	{
		return lib.isElementPresent(dr, nextselectpriceoption);
		
	}
    
    public boolean isCourtesyCarPresent()
	{
		return lib.isElementPresent(dr, courtesycar);
		
		
		
	}
    public void enterStartDate(String data)
	{	
		dr.findElement(startdate).sendKeys(""+data);
	}
    
    public void enterInsuranceSum(int data1)
	{
		//WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(insurancesum));
		sel.selectByIndex(data1);	
	}
    
    public void enterMeritRating(int data5)
 	{
 		//WebElement make1 = dr.findElement(By.id("make"));
 		Select sel = new Select(dr.findElement(meritrating));
 		sel.selectByIndex(data5);	
 	}
    
    public void enterDamageInsurance(int data2)
   	{
   		//WebElement make1 = dr.findElement(By.id("make"));
   		Select sel = new Select(dr.findElement(damageinsurance));
   		sel.selectByIndex(data2);	
   	}
    
    public void clickEuroProtection()
	{	
		dr.findElement(EuroProtection).click();
	}
	
    public void enterCourtesyCar(int data6)
 	{
 		//WebElement make1 = dr.findElement(By.id("make"));
 		Select sel = new Select(dr.findElement(courtesycar));
 		sel.selectByIndex(data6);	
 	}
    
    public void clickNextSelectPriceOption()
	{	
		dr.findElement(nextselectpriceoption).click();
	}
	
}
