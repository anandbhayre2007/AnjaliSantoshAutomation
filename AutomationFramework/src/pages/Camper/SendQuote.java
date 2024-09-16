package pages.Camper;

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
    By okbutton = By.xpath("//body//div[@class='sweet-alert showSweetAlert visible']/div[7]/div[1]/button");
    
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
    
    public boolean isokbutton()
    {
    	return lib.isElementPresent(dr, okbutton);
    }
    
    
//    Actions
    
    public void entereMail(String data)
	{	
		dr.findElement(email).sendKeys(""+data);
	}
    
    public void enterPhone(String data1)
   	{	
   		dr.findElement(phone).sendKeys(""+data1);
   	}
    
    public void enterUsername(String data2)
   	{	
   		dr.findElement(username).sendKeys(""+data2);
   	}
    
    public void enterPassword(String data3)
   	{	
   		dr.findElement(password).sendKeys(""+data3);
   	}
    
    public void enterConfirmPassword(String data4)
   	{	
   		dr.findElement(confirmpassword).sendKeys(""+data4);
   	}
    
    public void enterComments(String data5)
   	{	
   		dr.findElement(comments).sendKeys(""+data5);
   	}
    
    public void clickSendEMail()
	{	
		dr.findElement(sendemail).click();
	}
    
    public void clickOkButton()
   	{	
   		dr.findElement(okbutton).click();
   	}
    

public void enterCamperSendQuoteData() throws Exception {
        
    	String mail;
    	String phone;
    	String username;
    	String password;
    	String cp;
    	String comments;
    	
    	
    Assert.assertTrue(isemail(),"Email field is not displayed"); 
    mail = xlLib.getCelllData("Camper", 1, 23);
    entereMail(mail);
    Thread.sleep(3500);
    
    Assert.assertTrue(isphone(),"Phone field is not displayed");
    phone = xlLib.getCelllData("Camper", 1, 24);
    enterPhone(phone);
    Thread.sleep(3500);
    
    Assert.assertTrue(isusername(),"Username field is not displayed");
    username = xlLib.getCelllData("Camper", 1, 25);
    enterUsername(username);
    Thread.sleep(3500);
    
    Assert.assertTrue(ispassword(),"Password field is not displayed");
    password = xlLib.getCelllData("Camper", 1, 26);
    enterPassword(password);
    Thread.sleep(3500);
    
    Assert.assertTrue(isconfirmpassword(),"Confirm Password field is not displayed");
    cp = xlLib.getCelllData("Camper", 1, 27);
    enterConfirmPassword(cp);
    Thread.sleep(3500);
    
    Assert.assertTrue(iscomments(),"Comments field is not displayed");
    comments = xlLib.getCelllData("Camper", 1, 28);
    enterComments(comments);
    Thread.sleep(3500);
    
    Assert.assertTrue(isSendeMail(),"Send Button is not displayed"); 
    clickSendEMail();
    			 
    }
    
    
    
    
}
