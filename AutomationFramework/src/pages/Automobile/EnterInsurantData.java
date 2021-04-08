package pages.Automobile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import driver.Driver;
import functionLibrary.ApplicationLibrary;

public class EnterInsurantData extends Driver{
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
	By gendermale = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[4]/p[1]/label[1]/span[1]");
	By genderfemale = By.id("genderfemale");
	By streetaddress = By.id("streetaddress");
	By country = By.id("country");
	By zipcode = By.id("zipcode");
	By city = By.id("city");
	By occupation = By.id("occupation");
	By speeding = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[2]/div[10]/p[1]/label[1]/span[1]");
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
	
	public void enterFirstName(String data8)
	{	
		dr.findElement(firstname).sendKeys(""+data8);
	}
	
	public void enterLastName(String data9)
	{	
		dr.findElement(lastname).sendKeys(""+data9);
	}
	
	public void enterBirthDate(String data10)
	{	
		dr.findElement(birthdate).sendKeys(""+data10);
	}
	
	public void clickGender()
	{	
		dr.findElement(gendermale).click();
	}
	
	public void enterstreetaddress(String data11)
	{	
		dr.findElement(streetaddress).sendKeys(""+data11);
	}
	

	public void enterCountry(String data12)
	{
		//WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(country));
		sel.selectByVisibleText(data12);	
	}
	
	public void enterZipCode(String data13)
	{	
		dr.findElement(zipcode).sendKeys(""+data13);
	}
	
	public void enterCity(String data14)
	{	
		dr.findElement(city).sendKeys(""+data14);
	}
	
	public void enterOccupation(String data15)
	{
		//WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(occupation));
		sel.selectByVisibleText(data15);	
	}
	
	public void clickspeeding()
	{	
		dr.findElement(speeding).click();
	}
	
	public void enterWebsite(String data16)
	{	
		dr.findElement(website).sendKeys(""+data16);
	}
	
	public void enterPicture(String data17) throws AWTException, InterruptedException
	{	
      dr.findElement(By.id("open")).click();
		
		//Robot CLass
		Robot robot = new Robot();
		
		StringSelection cb = new StringSelection(""+data17);
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
	
	public void clickExtEnterProductData()
	{	
		dr.findElement(nextenterproductdata).click();
	}
	
	
	public void enterAutomobileInsurantData( ) throws Exception {
		
		String fn;
		String ln;
		String bd;
		String sadd;
		String country;
		String zipcode;
		String city;
		String occupation;
		String website;
		String picture;
		
		Assert.assertTrue(isFirstNamePresent(), "First Name field is not displayed");
		fn= xlLib.getCelllData("Automobile", 1, 8);
		enterFirstName(fn);
		Thread.sleep(3500);

		Assert.assertTrue(isLastNamePresent(), "Last Name field is not displayed");
		ln= xlLib.getCelllData("Automobile", 1, 9);
		enterLastName(ln);
		Thread.sleep(3500);

		Assert.assertTrue(isBirthDatePresent(), "Birth Date field is not displayed");
		bd= xlLib.getCelllData("Automobile", 1, 10);
		enterBirthDate(bd);
		Thread.sleep(3500);

		Assert.assertTrue(isGenderMalePresent(), "Gender Male field is not displayed");
		Assert.assertTrue(isGenderFemalePresent(), "Gender Female field is not displayed");
		clickGender();
		Thread.sleep(3500);

		Assert.assertTrue(isStreetAddressPresent(),"enter street address field is not displayed");
		sadd= xlLib.getCelllData("Automobile", 1, 11);
		enterstreetaddress(sadd);
		Thread.sleep(3500);

		Assert.assertTrue(isCountryPresent(), "Country field is not displayed");
		country= xlLib.getCelllData("Automobile", 1, 12);
		enterCountry(country);
		Thread.sleep(3500);

		Assert.assertTrue(isZipCodePresent(), "Country field is not displayed");
		zipcode= xlLib.getCelllData("Automobile", 1, 13);
		enterZipCode(zipcode);
		Thread.sleep(3500);

		Assert.assertTrue(isCityPresent(), "City field is not displayed");
		city= xlLib.getCelllData("Automobile", 1, 14);
		enterCity(city);
		Thread.sleep(3500);

		Assert.assertTrue(isOccupationPresent(), "Occupation field is not displayed");
		occupation= xlLib.getCelllData("Automobile", 1, 15);
		enterOccupation(occupation);
		Thread.sleep(3500);

		Assert.assertTrue(isSpeedingPresent(), "Speeding field is not displayed");
		Assert.assertTrue(isBungeeJumpingPresent(),"Bungee Jumping field is not displayed");
		Assert.assertTrue(isCliffDivingPresent(), "Cliff Diving field is not displayed");
		Assert.assertTrue(isSkyDivingPresent(), "Sky Diving field is not displayed");
		Assert.assertTrue(isOtherPresent(), "Other field is not displayed");
		clickspeeding();
		Thread.sleep(3500);

		Assert.assertTrue(isWebSitePresent(), "Website field is not displayed");
		website= xlLib.getCelllData("Automobile", 1, 16);
		enterWebsite(website);
		Thread.sleep(3500);

		Assert.assertTrue(isPicturePresent(), "Picture field is not displayed");
		Assert.assertTrue(isOpenPresent(), "Open Button is not displayed");
		picture= xlLib.getCelllData("Automobile", 1, 17);
		enterPicture(picture);
		Thread.sleep(3500);

		Assert.assertTrue(isNextEnterProductDataPresent(), "Next button is not displayed");
		clickExtEnterProductData();
		Thread.sleep(3500);
		
	}
}
