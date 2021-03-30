package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	By damageinsurance = By.id("damageinsurance");
	By EuroProtection = By.id("EuroProtection");
	By LegalDefenseInsurance = By.id("LegalDefenseInsurance");
    By nextselectpriceoption = By.id("nextselectpriceoption");
    public boolean isStartDatePresent()
	{
		return lib.isElementPresent(dr, startdate);
		
	}
    
    public boolean isInsuranceSumPresent()
	{
		return lib.isElementPresent(dr, insurancesum);
		
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
    

}

