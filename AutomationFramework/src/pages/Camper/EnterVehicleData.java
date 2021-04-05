package pages.Camper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import functionLibrary.ApplicationLibrary;

public class EnterVehicleData {

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
		By righthanddriveyes = By.xpath("//body/div[@id='site-content']/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/section[1]/div[5]/p[1]/label[1]/span[1]");
		By righthanddriveno = By.id("righthanddriveno");
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
		
		public boolean isrighthanddriveno()
		{
			return lib.isElementPresent(dr,righthanddriveno);
		}
		
		public boolean ispayload()
		{
			return lib.isElementPresent(dr,payload);
		}
		
		public boolean istotalweight()
		{
			return lib.isElementPresent(dr,totalweight);
		}
		
		public boolean isrighthanddriveyes()
		{
			return lib.isElementPresent(dr,righthanddriveyes);
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
		public void enterEnginePerformance(int data)
		{	
			dr.findElement(enginePerformance).sendKeys(""+data);
		}
		
		public void enterMake(int data1)
		{
			//WebElement make1 = dr.findElement(By.id("make"));
			Select sel = new Select(dr.findElement(make));
			sel.selectByIndex(data1);	
		}
		
		public void enterDateOfManufacture(String data2 )
		{
			dr.findElement(dateofmanufacture).sendKeys(""+data2);
		}
		
		public void clickrighthanddriveyes()
		{
			dr.findElement(righthanddriveyes).click();
		}
		
		public void enterNumberOfSeats(int data3)
		{
			Select sel = new Select(dr.findElement(numberofseats));
			sel.selectByIndex(data3);	
		}
		
		public void enterFuel(int data4)
		{
			Select sel = new Select(dr.findElement(fuel));
			sel.selectByIndex(data4);
		}
		
		public void enterListPrice(int data5)
		{
			dr.findElement(listprice).sendKeys(""+data5);
		}
		
		public void enterLicensePlateNumber(int data6)
		{
			dr.findElement(licenseplatenumber).sendKeys(""+data6);
		}
		
		public void enterAnnualMileage(int data7)
		{
			dr.findElement(annualmileage).sendKeys(""+data7);
		}
		
		public void enterNextEnterInsurantData()
		{
			dr.findElement(nextenterinsurantdata).click();
		}
		
		public void enterPayLoad(int data8)
		{
			dr.findElement(payload).sendKeys(""+data8);
		}
		
		public void enterTotalWeight(int data9)
		{
			dr.findElement(totalweight).sendKeys(""+data9);
		}
	}



