package pages.Truck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import driver.Driver;
import functionLibrary.ApplicationLibrary;

public class EnterVehicleData extends Driver{

WebDriver dr;
	
	ApplicationLibrary lib= new ApplicationLibrary();
	public EnterVehicleData(WebDriver dr) {
		this.dr=dr;
	}
	//WebElements
		By make=By.id("make");
		By enginePerformance=By.id("engineperformance");
		By dateofmanufacture = By.id("dateofmanufacture");
		By numberofseats = By.id("numberofseats");
		By fuel = By.id("fuel");
		By payload = By.id("payload");
		By totalweight = By.id("totalweight");
		By listprice = By.id("listprice");
		By licenseplatenumber = By.id("licenseplatenumber");
		By annualmileage = By.id("annualmileage");
		By nextenterinsurantdata = By.id("nextenterinsurantdata");
		
		//Visibility
		public boolean isEnginePerformancePresent()
		{
			return lib.isElementPresent(dr, enginePerformance);
			
		}
		
		public boolean isMakePresent()
		{
			return lib.isElementPresent(dr, make);
		}
		
		public boolean isDateOfManufacturePresent()
		{
			return lib.isElementPresent(dr,dateofmanufacture);
		}
		
		
		public boolean ispayload()
		{
			return lib.isElementPresent(dr,payload);
		}
		
		public boolean istotalweight()
		{
			return lib.isElementPresent(dr,totalweight);
		}
		
	
		
		public boolean isNumberOfSeats()
		{
			return lib.isElementPresent(dr,numberofseats);
		}
		
		public boolean isFuel()
		{
			return lib.isElementPresent(dr,fuel);
		}
		
		public boolean isListPrice()
		{
			return lib.isElementPresent(dr,listprice);
		}
		
		public boolean isLicensePlateNumber()
		{
			return lib.isElementPresent(dr,licenseplatenumber);
		}
		public boolean isAnnualMileage()
		{
			return lib.isElementPresent(dr,annualmileage);
		}
		public boolean isNextEnterInsurantData()
		{
			return lib.isElementPresent(dr,nextenterinsurantdata);
		}
		
		//Actions
		public void enterEnginePerformance(String data)
		{	
			dr.findElement(enginePerformance).sendKeys(""+data);
		}
		
		public void enterMake(String data1)
		{
			//WebElement make1 = dr.findElement(By.id("make"));
			Select sel = new Select(dr.findElement(make));
			sel.selectByVisibleText(data1);	
		}
		
		public void enterDateOfManufacture(String data2 )
		{
			dr.findElement(dateofmanufacture).sendKeys(""+data2);
		}
		
		
		public void enterNumberOfSeats(String data3)
		{
			Select sel = new Select(dr.findElement(numberofseats));
			sel.selectByVisibleText(data3);	
		}
		
		public void enterFuel(String data4)
		{
			Select sel = new Select(dr.findElement(fuel));
			sel.selectByVisibleText(data4);
		}
		
		public void enterListPrice(String data5)
		{
			dr.findElement(listprice).sendKeys(""+data5);
		}
		
		public void enterLicensePlateNumber(String data6)
		{
			dr.findElement(licenseplatenumber).sendKeys(""+data6);
		}
		
		public void enterAnnualMileage(String data7)
		{
			dr.findElement(annualmileage).sendKeys(""+data7);
		}
		
		public void enterNextEnterInsurantData()
		{
			dr.findElement(nextenterinsurantdata).click();
		}
		
		public void enterPayLoad(String data8)
		{
			dr.findElement(payload).sendKeys(""+data8);
		}
		
		public void enterTotalWeight(String data9)
		{
			dr.findElement(totalweight).sendKeys(""+data9);
		}
		
		
		public void enterTruckVehicleDetails() throws Exception {
			String make;
			String ep;
			String dom;
			String nos;
			String fuel;
			String payload;
			String tw;
			String lpr;
			String lpn;
			String am;

			Assert.assertTrue(isMakePresent(), "Make field is not displayed");
			make = xlLib.getCelllData("Truck", 1, 0);
			enterMake(make);
			Thread.sleep(3500);

			Assert.assertTrue(isEnginePerformancePresent(), "Engine Performance field is not displayed");
			ep = xlLib.getCelllData("Truck", 1, 1);
			enterEnginePerformance(ep);
			Thread.sleep(3500);

			Assert.assertTrue(isDateOfManufacturePresent(), "Date Of Manufacture field is not displayed");
			dom = xlLib.getCelllData("Truck", 1, 2);
			enterDateOfManufacture(dom);

			Assert.assertTrue(isNumberOfSeats(), "Number Of Seats field is not displayed");
			nos = xlLib.getCelllData("Truck", 1, 3);
			enterNumberOfSeats(nos);
			Thread.sleep(3500);

			Assert.assertTrue(isFuel(), "Fuel field is not displayed");
			fuel = xlLib.getCelllData("Truck", 1, 4);
			enterFuel(fuel);
			Thread.sleep(3500);

			Assert.assertTrue(ispayload(), "Payload field is not displayed");
			payload = xlLib.getCelllData("Truck", 1, 5);
			enterPayLoad(payload);
			Thread.sleep(3500);

			Assert.assertTrue(istotalweight(), "Total Weight field is not displayed");
			tw = xlLib.getCelllData("Truck", 1, 6);
			enterTotalWeight(tw);
			Thread.sleep(3500);

			Assert.assertTrue(isListPrice(), "List Price field is not displayed");
			lpr = xlLib.getCelllData("Truck", 1, 7);
			enterListPrice(lpr);
			Thread.sleep(3500);

			Assert.assertTrue(isLicensePlateNumber(), "License PlateNumber field is not displayed");
			lpn = xlLib.getCelllData("Truck", 1, 8);
			enterLicensePlateNumber(lpn);

			Thread.sleep(3500);
			Assert.assertTrue(isAnnualMileage(), "Annual Mileage field is not displayed");
			am = xlLib.getCelllData("Truck", 1, 9);
			enterAnnualMileage(am);
			Thread.sleep(3500);

			Assert.assertTrue(isNextEnterInsurantData(), "Next Button is not displayed");
			enterNextEnterInsurantData();
			Thread.sleep(3500);

		}
		
		
	}



