package pages.Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver.Driver;
import functionLibrary.ApplicationLibrary;

public class SendQuote extends Driver{
	
	WebDriver dr;
	ApplicationLibrary lib= new ApplicationLibrary();
	
	public SendQuote(WebDriver dr)
	{
		this.dr=dr;
	}
	
	//WebElements
	By email=By.id("email");
	By phone=By.id("phone");
	By username = By.id("username");
	By password = By.id("password");
	By confirmpassword = By.id("confirmpassword");
    By comments = By.id("Comments");
    By sendemail = By.id("sendemail");
    By okbutton = By.xpath("//button[text()='OK']");
    
    public boolean isemail()
	{
		return lib.isElementPresent(dr,email);
	}
    
    public boolean isphone()
	{
		return lib.isElementPresent(dr,phone);
	}
    
    public boolean isusername()
   	{
   		return lib.isElementPresent(dr,username);
   	}
    
    public boolean ispassword()
   	{
   		return lib.isElementPresent(dr,password);
   	}
    
    public boolean isconfirmpassword()
    {
    	return lib.isElementPresent(dr, confirmpassword);
    }
    
    public boolean iscomments()
    {
    	return lib.isElementPresent(dr, comments);
    }
    
    public boolean isSendeMail()
    {
    	return lib.isElementPresent(dr, sendemail);
    }
    public boolean isOkButtonPresent()
    {
    	return lib.isElementPresent(dr, okbutton);
    }
    
//    Actions
    
    public void entereMail(String data23)
	{	
		dr.findElement(email).sendKeys(""+data23);
	}
    
    public void enterPhone(String data24)
   	{	
   		dr.findElement(phone).sendKeys(""+data24);
   	}
    
    public void enterUsername(String data25)
   	{	
   		dr.findElement(username).sendKeys(""+data25);
   	}
    
    public void enterPassword(String data26)
   	{	
   		dr.findElement(password).sendKeys(""+data26);
   	}
    
    public void enterConfirmPassword(String data27)
   	{	
   		dr.findElement(confirmpassword).sendKeys(""+data27);
   	}
    
    public void enterComments(String data28)
   	{	
   		dr.findElement(comments).sendKeys(""+data28);
   	}
    
    public void clickSendEMail()
	{	
		dr.findElement(sendemail).click();
	}
    
    public void clickOkButton()
	{	
		dr.findElement(okbutton).click();
	}
    

    public void enterSendQuoteData() throws Exception {
    
    	String mail;
    	String phone;
    	String username;
    	String password;
    	String cp;
    	String comments;
    	
    	
    Assert.assertTrue(isemail(),"Email field is not displayed"); 
    mail = xlLib.getCelllData("Automobile", 1, 23);
    entereMail(mail);
    Thread.sleep(3500);
    
    Assert.assertTrue(isphone(),"Phone field is not displayed");
    phone = xlLib.getCelllData("Automobile", 1, 24);
    enterPhone(phone);
    Thread.sleep(3500);
    
    Assert.assertTrue(isusername(),"Username field is not displayed");
    username = xlLib.getCelllData("Automobile", 1, 25);
    enterUsername(username);
    Thread.sleep(3500);
    
    Assert.assertTrue(ispassword(),"Password field is not displayed");
    password = xlLib.getCelllData("Automobile", 1, 26);
    enterPassword(password);
    Thread.sleep(3500);
    
    Assert.assertTrue(isconfirmpassword(),"Confirm Password field is not displayed");
    cp = xlLib.getCelllData("Automobile", 1, 27);
    enterConfirmPassword(cp);
    Thread.sleep(3500);
    
    Assert.assertTrue(iscomments(),"Comments field is not displayed");
    comments = xlLib.getCelllData("Automobile", 1, 28);
    enterComments(comments);
    Thread.sleep(3500);
    
    Assert.assertTrue(isSendeMail(),"Send Button is not displayed"); 
    clickSendEMail();
    			 
    }
    
    
    
    
    
}
