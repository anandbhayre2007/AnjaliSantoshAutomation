package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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



}
