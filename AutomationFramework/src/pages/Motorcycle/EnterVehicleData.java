package pages.Motorcycle;

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
		By model = By.id("model");
		By cylindercapacity = By.id("cylindercapacity");
		By enginePerformance=By.id("engineperformance");
		By dateofmanufacture = By.id("dateofmanufacture");
		By numberofseats = By.id("numberofseatsmotorcycle");
		By listprice = By.id("listprice");
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
		
		public boolean isModelPresent()
		{
			return lib.isElementPresent(dr, model);
		}
		
		public boolean isCylinderCapacity()
		{
			return lib.isElementPresent(dr, cylindercapacity);
		}
		
		public boolean isDateOfManufacturePresent()
		{
			return lib.isElementPresent(dr,dateofmanufacture);
		}
	
		
		public boolean isNumberOfSeats()
		{
			return lib.isElementPresent(dr,numberofseats);
		}
		
		public boolean isListPrice()
		{
			return lib.isElementPresent(dr,listprice);
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
		
		public void enterModel(String data10)
		{
			//WebElement make1 = dr.findElement(By.id("make"));
			Select sel = new Select(dr.findElement(model));
			sel.selectByVisibleText(data10);	
		}
		
		public void enterCylinderCapacity(String data11)
		{
			dr.findElement(cylindercapacity).sendKeys(""+data11);
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
		
		
		
		public void enterListPrice(String data5)
		{
			dr.findElement(listprice).sendKeys(""+data5);
		}
		
		
		public void enterAnnualMileage(String data7)
		{
			dr.findElement(annualmileage).sendKeys(""+data7);
		}
		
		public void enterNextEnterInsurantData()
		{
			dr.findElement(nextenterinsurantdata).click();
		}
		
		
		public void enterMotorCycleVehicleData()throws Exception {
			
			String make;
			String model;
			String ccap;
			String ep; 
			String dom; 
			String nos; 
			String lpr; 
			String am;
			
			Assert.assertTrue(isMakePresent(), "Make field is not displayed");
			make= xlLib.getCelllData("MotorCycle", 1, 0);
			enterMake(make);
			Thread.sleep(3500);
			
			 Assert.assertTrue(isModelPresent(),"Model field is not displayed");
			 model= xlLib.getCelllData("MotorCycle", 1, 1);
			 enterModel(model);
			 Thread.sleep(3500);
			 
			 Assert.assertTrue(isCylinderCapacity(),"Cylinder capacity field is not displayed");
			 ccap= xlLib.getCelllData("MotorCycle", 1, 2);
			 enterCylinderCapacity(ccap);
			 Thread.sleep(3500);
			
			Assert.assertTrue(isEnginePerformancePresent(), "Engine Performance field is not displayed");
			ep= xlLib.getCelllData("MotorCycle", 1, 3);
			enterEnginePerformance(ep);
			Thread.sleep(3500);
			
			Assert.assertTrue(isDateOfManufacturePresent(),"Date Of Manufacture field is not displayed");
			dom= xlLib.getCelllData("MotorCycle", 1, 4);
			enterDateOfManufacture(dom);
			
			Assert.assertTrue(isNumberOfSeats(), "Number Of Seats field is not displayed");
			nos= xlLib.getCelllData("MotorCycle", 1, 5);
			enterNumberOfSeats(nos);
			Thread.sleep(3500);
			

			Assert.assertTrue(isListPrice(), "List Price field is not displayed");
			lpr= xlLib.getCelllData("MotorCycle", 1, 6);
			enterListPrice(lpr);
			Thread.sleep(3500);


			Thread.sleep(3500);
			Assert.assertTrue(isAnnualMileage(), "Annual Mileage field is not displayed");
			am= xlLib.getCelllData("MotorCycle", 1, 7);
			enterAnnualMileage(am);
			Thread.sleep(3500);

			Assert.assertTrue(isNextEnterInsurantData(), "Next Button is not displayed");
			enterNextEnterInsurantData();
			Thread.sleep(3500);
			
			
		}
		
	}




