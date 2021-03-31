package pages.Automobile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import functionLibrary.ApplicationLibrary;

public class EnterInsurantData {
	
	WebDriver dr;
	ApplicationLibrary lib= new ApplicationLibrary();
	
	public EnterInsurantData(WebDriver dr)
	{
		this.dr=dr;
	}
	
	//WebElements
	By firstName=By.xpath("//input[@name='First Name']");
	By lastName=By.xpath("//input[@name='Last Name']");
	By dateOfBirth = By.xpath("//input[@name='Date of Birth']");
	By gender = By.xpath("//label[text()='Gender']");
	By streetAddress = By.id("streetaddress");
	By country = By.id("country");
	By zipcode = By.id("zipcode");
	By city = By.id("city");
	By occupation = By.xpath("//label[text()='Occupation']");
	By hobbies = By.xpath("//label[text()='Hobbies']");
	By website = By.id("website");
	By openButton = By.xpath("//button[@name='Open']");
	By prevButton = By.xpath("//button[@name='Prev (Enter Vehicle Data)']");
	By nextButton = By.xpath("//button[@id='nextenterproductdata']");
	
	//Visibility
	public boolean isFirstNamePresent()
	{
		return lib.isElementPresent(dr, firstName);
		
	}
	
	public boolean islastNamePresent()
	{
		return lib.isElementPresent(dr, lastName);
	}
	
	public boolean isDateOfBirthPresent()
	{
		return lib.isElementPresent(dr,dateOfBirth);
	}
	
	public boolean isGenderPresent()
	{
		return lib.isElementPresent(dr,gender);
	}
	
	public boolean isStreetAddressPresent()
	{
		return lib.isElementPresent(dr,streetAddress);
	}
	
	public boolean isCountryPresernt()
	{
		return lib.isElementPresent(dr,country);
	}
	
	public boolean isZipcodePresent()
	{
		return lib.isElementPresent(dr,zipcode);
	}
	public boolean isCityPresent()
	{
		return lib.isElementPresent(dr,city);
	}
	public boolean isOccupationPresent()
	{
		return lib.isElementPresent(dr,occupation);
	}
	public boolean isHobbiesPresent()
	{
		return lib.isElementPresent(dr,hobbies);
	}
	
	public boolean isWebsitePresent()
	{
		return lib.isElementPresent(dr,website);
	}
	
	public boolean isOpenButtonPresent()
	{
		return lib.isElementPresent(dr,openButton);
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
	public void enterFirstNamePresent(int data)
	{	
		dr.findElement(firstName).sendKeys(""+data);
	}
	
	public void enterLastNamePresent(int data)
	{	
		dr.findElement(lastName).sendKeys(""+data);
	}
		
	public void enterDateOfBirth(String data )
	{
		dr.findElement(dateOfBirth).sendKeys(""+data);
	}
	
	public void enterGender()
	{
		dr.findElement(By.xpath("//input[@id='genderfemale']")).click();
	}
	
	public void streetAddress(String data)
	{
		dr.findElement(streetAddress).sendKeys(""+data);
	}
	
	public void enterCountry(int data)
	{
		Select sel = new Select(dr.findElement(country));
		sel.selectByIndex(data);
	}
	
	public void enterZipcode(String data)
	{
		dr.findElement(zipcode).sendKeys(""+data);
	}
	
	public void enterCity(String data)
	{
		dr.findElement(city).sendKeys(""+data);
	}
	
	public void enterOccupation(int data)
	{
		//WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(occupation));
		sel.selectByIndex(data);	
	}
	
	public void enterHobbies()
	{
		dr.findElement(By.xpath("//input[@id='speeding']")).click();
	}
	
	public void enterWebsite(int data)
	{
		dr.findElement(website).sendKeys(""+data);
	}
	
	public void uploadFile() throws Exception, AWTException
	{
		dr.findElement(openButton).click();
		
		Robot robot = new Robot();
		StringSelection cb = new StringSelection(
				"C:\\Users\\Anjali\\Pictures\\Saved Pictures\\Photos\\Screenshot_20190106-011100.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);

		Thread.sleep(10000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void enterNextEnterProductData()
	{
		dr.findElement(nextButton).click();
	}
	
}
