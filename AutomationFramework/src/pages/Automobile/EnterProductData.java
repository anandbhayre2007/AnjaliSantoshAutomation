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
	By EuroProtection = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[5]/p[1]/label[1]/span[1]");
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
    public void enterStartDate(String data18)
	{	
		dr.findElement(startdate).sendKeys(""+data18);
	}
    
    public void enterInsuranceSum(int data19)
	{
		//WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(insurancesum));
		sel.selectByIndex(data19);	
	}
    
    public void enterMeritRating(int data20)
 	{
 		//WebElement make1 = dr.findElement(By.id("make"));
 		Select sel = new Select(dr.findElement(meritrating));
 		sel.selectByIndex(data20);	
 	}
    
    public void enterDamageInsurance(int data21)
   	{
   		//WebElement make1 = dr.findElement(By.id("make"));
   		Select sel = new Select(dr.findElement(damageinsurance));
   		sel.selectByIndex(data21);	
   	}
    
    public void clickEuroProtection()
	{	
		dr.findElement(EuroProtection).click();
	}
	
    public void enterCourtesyCar(int data22)
 	{
 		//WebElement make1 = dr.findElement(By.id("make"));
 		Select sel = new Select(dr.findElement(courtesycar));
 		sel.selectByIndex(data22);	
 	}
    
    public void clickNextSelectPriceOption()
	{	
		dr.findElement(nextselectpriceoption).click();
	}
	
}
