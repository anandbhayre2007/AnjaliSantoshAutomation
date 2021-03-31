package pages.Truck;

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
	By firstname=By.id("firstname");
	By lastname=By.id("lastname");
	By birthdate = By.id("birthdate");
	By gendermale = By.id("gendermale");
	By genderfemale = By.id("genderfemale");
	By streetaddress = By.id("streetaddress");
	By country = By.id("country");
	By zipcode = By.id("zipcode");
	By city = By.id("city");
	By occupation = By.id("occupation");
	By speeding = By.id("speeding");
	By bungeejumping = By.id("bungeejumping");
	By cliffdiving = By.id("cliffdiving");
	By skydiving = By.id("skydiving");
	By other = By.id("other");
	By website = By.id("website");
	By picture = By.id("picture");
	By open = By.id("open");
	By preventervehicledata = By.id("preventervehicledata");
	By nextenterproductdata = By.id("nextenterproductdata");
	//Visibility
	public boolean isFirstNamePresent()
	{
		return lib.isElementPresent(dr, firstname);
		
	}
	
	public boolean isLastNamePresent()
	{
		return lib.isElementPresent(dr, lastname);
		
	}
	
	public boolean isBirthDatePresent()
	{
		return lib.isElementPresent(dr, birthdate);
		
	}
	
	public boolean isGenderMalePresent()
	{
		return lib.isElementPresent(dr, gendermale);
		
	}
	
	public boolean isGenderFemalePresent()
	{
		return lib.isElementPresent(dr, genderfemale);
		
	}
	
	public boolean isStreetAddressPresent()
	{
		return lib.isElementPresent(dr, streetaddress);
		
	}
	
	public boolean isCountryPresent()
	{
		return lib.isElementPresent(dr, country);
		
	}
	
	public boolean isZipCodePresent()
	{
		return lib.isElementPresent(dr, zipcode);
		
	}
	
	public boolean isCityPresent()
	{
		return lib.isElementPresent(dr, city);
		
	}
	
	
	public boolean isOccupationPresent()
	{
		return lib.isElementPresent(dr, occupation);
		
	}
	
	
	public boolean isSpeedingPresent()
	{
		return lib.isElementPresent(dr, speeding);
		
	}
	
	public boolean isBungeeJumpingPresent()
	{
		return lib.isElementPresent(dr, bungeejumping);
		
	}
	
	public boolean isCliffDivingPresent()
	{
		return lib.isElementPresent(dr, cliffdiving);
		
	}
	
	public boolean isSkyDivingPresent()
	{
		return lib.isElementPresent(dr, skydiving);
		
	}
	
	public boolean isOtherPresent()
	{
		return lib.isElementPresent(dr, other);
		
	}

	
	public boolean isWebSitePresent()
	{
		return lib.isElementPresent(dr, website);
		
	}

	
	public boolean isPicturePresent()
	{
		return lib.isElementPresent(dr, picture);
		
	}
	
	public boolean isOpenPresent()
	{
		return lib.isElementPresent(dr, open);
		
	}
	

	public boolean isPrevEnterVehicleDataPresent()
	{
		return lib.isElementPresent(dr, preventervehicledata);
		
	}
	

	public boolean isNextEnterProductDataPresent()
	{
		return lib.isElementPresent(dr, nextenterproductdata);
		
	}
	
	public void enterFirstName(String data)
	{	
		dr.findElement(firstname).sendKeys(""+data);
	}
	
	public void enterLastName(String data1)
	{	
		dr.findElement(lastname).sendKeys(""+data1);
	}
	
	public void enterBirthDate(String data2)
	{	
		dr.findElement(birthdate).sendKeys(""+data2);
	}
	
	public void clickGender()
	{	
		dr.findElement(gendermale).click();
	}
	
	public void enterstreetaddress(String data3)
	{	
		dr.findElement(streetaddress).sendKeys(""+data3);
	}
	

	public void enterCountry(int data4)
	{
		//WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(country));
		sel.selectByIndex(data4);	
	}
	
	public void enterZipCode(int data5)
	{	
		dr.findElement(zipcode).sendKeys(""+data5);
	}
	
	public void enterCity(String data6)
	{	
		dr.findElement(city).sendKeys(""+data6);
	}
	
	public void enterOccupation(int data7)
	{
		//WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(occupation));
		sel.selectByIndex(data7);	
	}
	
	public void clickspeeding()
	{	
		dr.findElement(speeding).click();
	}
	
	public void enterWebsite(String data8)
	{	
		dr.findElement(website).sendKeys(""+data8);
	}
	
	public void enterPicture(String data9) throws AWTException, InterruptedException
	{	
      dr.findElement(By.id("open")).click();
		
		//Robot CLass
		Robot robot = new Robot();
		
		StringSelection cb = new StringSelection(""+data9);
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
	
	public void clickExtEnterProductData(String data8)
	{	
		dr.findElement(nextenterproductdata).click();
	}
	
}