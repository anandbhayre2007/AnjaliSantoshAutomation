package pages.Camper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import driver.Driver;
import functionLibrary.ApplicationLibrary;

public class EnterProductData extends Driver{
	
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
	By EuroProtection = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[3]/div[4]/p[1]/label[1]/span[1]");
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
    
//    Actions
    
    public void enterStartDate(String data)
	{	
		dr.findElement(startdate).sendKeys(""+data);
	}
    
    public void enterInsuranceSum(String data1)
	{
		//WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(insurancesum));
		sel.selectByVisibleText(data1);	
	}
    
    public void enterDamageInsurance(String data2)
   	{
   		//WebElement make1 = dr.findElement(By.id("make"));
   		Select sel = new Select(dr.findElement(damageinsurance));
   		sel.selectByVisibleText(data2);	
   	}
    
    public void clickEuroProtection()
	{	
		dr.findElement(EuroProtection).click();
	}
	
    public void clickNextSelectPriceOption()
	{	
		dr.findElement(nextselectpriceoption).click();
	}
	
    
    public void enterCamperProductData() throws Exception {
    	
    	String sd;
    	String is;
    	String di;
    	
    	Assert.assertTrue(isStartDatePresent(),"Start Date field is not displayed"); 
    	sd= xlLib.getCelllData("Camper", 1, 20);
    	enterStartDate(sd);
    	Thread.sleep(3500);
    			  
    	Assert.assertTrue(isInsuranceSumPresent(),"Insurance field is not displayed"); 
    	is= xlLib.getCelllData("Camper", 1, 21);
    	enterInsuranceSum(is);
    	Thread.sleep(3500);
    			  
    	Assert.assertTrue(isDamageInsurancePresent(),"Damage Insurance field is not displayed");
    	di= xlLib.getCelllData("Camper", 1, 22);
    	enterDamageInsurance(di);
    	Thread.sleep(3500);
    			  
    	Assert.assertTrue(isEuroProtection(),"EuroProtection checkbox is not displayed");
    	Assert.assertTrue(isDamageInsurancePresent(),"LegalDefenseInsurance checkbox is not displayed");
    	clickEuroProtection();
    	Thread.sleep(3500); 
    			  
    	Assert.assertTrue(isnextselectpriceoptionPresent()," Next Button is not displayed"); 
    	clickNextSelectPriceOption();
		Thread.sleep(3500);
    
}
}
