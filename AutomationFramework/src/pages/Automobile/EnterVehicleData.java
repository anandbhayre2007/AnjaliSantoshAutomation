package pages.Automobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import driver.Driver;
import functionLibrary.ApplicationLibrary;

public class EnterVehicleData extends Driver {

	WebDriver dr;
	ApplicationLibrary lib = new ApplicationLibrary();

	public EnterVehicleData(WebDriver dr){
		this.dr = dr;
	}

	// WebElements
	By make = By.xpath("//select[@name= 'Make']");
	By enginePerformance = By.xpath("//input[@id= 'engineperformance']");
	By dateofmanufacture = By.id("dateofmanufacture");
	By numberofseats = By.id("numberofseats");
	By fuel = By.id("fuel");
	By listprice = By.id("listprice");
	By licenseplatenumber = By.id("licenseplatenumber");
	By annualmileage = By.id("annualmileage");
	By nextenterinsurantdata = By.id("nextenterinsurantdata");

	// Visibility
	public boolean isEnginePerformancePresent() {
		return lib.isElementPresent(dr, enginePerformance);

	}

	public boolean isMakePresent() {
		return lib.isElementPresent(dr, make);
	}

	public boolean isDateOfManufacturePresent() {
		return lib.isElementPresent(dr, dateofmanufacture);
	}

	public boolean isNumberOfSeats() {
		return lib.isElementPresent(dr, numberofseats);
	}

	public boolean isFuel() {
		return lib.isElementPresent(dr, fuel);
	}

	public boolean isListPrice() {
		return lib.isElementPresent(dr, listprice);
	}

	public boolean isLicensePlateNumber() {
		return lib.isElementPresent(dr, licenseplatenumber);
	}

	public boolean isAnnualMileage() {
		return lib.isElementPresent(dr, annualmileage);
	}

	public boolean isNextEnterInsurantData() {
		return lib.isElementPresent(dr, nextenterinsurantdata);
	}

	// Actions

	public void enterMake(String data) {
		// WebElement make1 = dr.findElement(By.id("make"));
		Select sel = new Select(dr.findElement(make));
		sel.selectByVisibleText(data);
	}

	public void enterEnginePerformance(String data) {

		dr.findElement(enginePerformance).sendKeys("" + data);
	}

	public void enterDateOfManufacture(String data) {

		dr.findElement(dateofmanufacture).sendKeys("" + data);
	}

	public void enterNumberOfSeats(String data) {
		Select sel = new Select(dr.findElement(numberofseats));
		sel.selectByVisibleText(data);
	}

	public void enterFuel(String data) {
		Select sel = new Select(dr.findElement(fuel));
		sel.selectByVisibleText(data);
	}

	public void enterListPrice(String i) {
		dr.findElement(listprice).sendKeys("" + i);
	}

	public void enterLicensePlateNumber(String data) {
		dr.findElement(licenseplatenumber).sendKeys("" + data);
	}

	public void enterAnnualMileage(String data) {
		dr.findElement(annualmileage).sendKeys("" + data);
	}

	public void enterNextEnterInsurantData() {
		dr.findElement(nextenterinsurantdata).click();
	}

	
	public void enterAutomobileVehicleDetails()throws Exception {
		String make;
		String ep; 
		String dom; 
		String nos; 
		String fuel; 
		String lpr; 
		String lpn; 
		String am;
		
		Assert.assertTrue(isMakePresent(), "Make field is not displayed");
		make= xlLib.getCelllData("Automobile", 1, 0);
		enterMake(make);
		Thread.sleep(5000);
		
		Assert.assertTrue(isEnginePerformancePresent(), "Engine Performance field is not displayed");
		ep= xlLib.getCelllData("Automobile", 1, 1);
		enterEnginePerformance(ep);
		Thread.sleep(5000);
		
		Assert.assertTrue(isDateOfManufacturePresent(),"Date Of Manufacture field is not displayed");
		dom= xlLib.getCelllData("Automobile", 1, 2);
		enterDateOfManufacture(dom);
		
		Assert.assertTrue(isNumberOfSeats(), "Number Of Seats field is not displayed");
		nos= xlLib.getCelllData("Automobile", 1, 3);
		enterNumberOfSeats(nos);
		Thread.sleep(5000);

		
		Assert.assertTrue(isFuel(), "Fuel field is not displayed");
		fuel= xlLib.getCelllData("Automobile", 1, 4);
		enterFuel(fuel);
		Thread.sleep(5000);

		Assert.assertTrue(isListPrice(), "List Price field is not displayed");
		lpr= xlLib.getCelllData("Automobile", 1, 5);
		enterListPrice(lpr);
		Thread.sleep(5000);

		Assert.assertTrue(isLicensePlateNumber(),"License PlateNumber field is not displayed");
		lpn= xlLib.getCelllData("Automobile", 1, 6);
		enterLicensePlateNumber(lpn);

		Thread.sleep(5000);
		Assert.assertTrue(isAnnualMileage(), "Annual Mileage field is not displayed");
		am= xlLib.getCelllData("Automobile", 1, 7);
		enterAnnualMileage(am);
		Thread.sleep(5000);

		Assert.assertTrue(isNextEnterInsurantData(), "Next Button is not displayed");
		enterNextEnterInsurantData();
		Thread.sleep(5000);
		
		
	}


}
