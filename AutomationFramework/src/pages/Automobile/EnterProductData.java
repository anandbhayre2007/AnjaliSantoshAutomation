package pages.Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import driver.Driver;
import functionLibrary.ApplicationLibrary;

public class EnterProductData extends Driver {
	
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
    By courtesycar =By.xpath("//select[@id='courtesycar']");
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
    
    public void enterInsuranceSum(String data19)
	{
		//WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(insurancesum));
		sel.selectByVisibleText(data19);	
	}
    
    public void enterMeritRating(String data20)
 	{
 		//WebElement make1 = dr.findElement(By.id("make"));
 		Select sel = new Select(dr.findElement(meritrating));
 		sel.selectByVisibleText(data20);	
 	}
    
    public void enterDamageInsurance(String data21)
   	{
   		//WebElement make1 = dr.findElement(By.id("make"));
   		Select sel = new Select(dr.findElement(damageinsurance));
   		sel.selectByVisibleText(data21);	
   	}
    
    public void clickEuroProtection()
	{	
		dr.findElement(EuroProtection).click();
	}
	
    public void enterCourtesyCar(String data22)
 	{
 		//WebElement make1 = dr.findElement(By.id("make"));
 		Select sel = new Select(dr.findElement(courtesycar));
 		sel.selectByVisibleText(data22);	
 	}
    
    public void clickNextSelectPriceOption()
	{	
		dr.findElement(nextselectpriceoption).click();
	}
    
    public void enterAutomobileProductData() throws Exception {
    	
    	String sd;
    	String is;
    	String mr;
    	String di;
    	String cc;
    	
    	Assert.assertTrue(isStartDatePresent(),"Start Date field is not displayed"); 
    	sd= xlLib.getCelllData("Automobile", 1, 18);
    	enterStartDate(sd);
    	Thread.sleep(5000);
    			  
    	Assert.assertTrue(isInsuranceSumPresent(),"Insurance field is not displayed"); 
    	is= xlLib.getCelllData("Automobile", 1, 19);
    	enterInsuranceSum(is);
    	Thread.sleep(5000);
    			  
    	Assert.assertTrue(isMeritRating(),"merit rating field is not displayed");
    	mr= xlLib.getCelllData("Automobile", 1, 20);
    	enterMeritRating(mr);
    			  
    	Assert.assertTrue(isDamageInsurancePresent(),"Damage Insurance field is not displayed");
    	di= xlLib.getCelllData("Automobile", 1, 21);
    	enterDamageInsurance(di);
    	Thread.sleep(5000);
    			  
    	Assert.assertTrue(isEuroProtection(),"EuroProtection checkbox is not displayed");
    	Assert.assertTrue(isDamageInsurancePresent(),"LegalDefenseInsurance checkbox is not displayed");
    	clickEuroProtection();
    	Thread.sleep(5000); 
    			  
    	Assert.assertTrue(isCourtesyCarPresent(),"courtesy car checkbox is not displayed"); 
    	cc= xlLib.getCelllData("Automobile", 1, 22);
    	enterCourtesyCar(cc);
    	Thread.sleep(5000);
    			  
    	Assert.assertTrue(isnextselectpriceoptionPresent()," Next Button is not displayed"); 
    	clickNextSelectPriceOption();
		Thread.sleep(5000);
    }
	
}
