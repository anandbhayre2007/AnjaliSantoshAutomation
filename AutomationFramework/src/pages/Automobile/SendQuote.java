package pages.Automobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionLibrary.ApplicationLibrary;

public class SendQuote {
	
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
    
    public void entereMail(String data23)
	{	
		dr.findElement(email).sendKeys(""+data23);
	}
    
    public void enterPhone(int data24)
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
    

    
    
    
    
    
}
