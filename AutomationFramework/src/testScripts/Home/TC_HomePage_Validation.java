package testScripts.Home;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import configuration.Configuration;
import driver.Driver;

import pages.Home.HomePage;
public class TC_HomePage_Validation extends Driver{
	
	WebDriver dr;
	
	HomePage homePage;
	pages.Automobile.EnterVehicleData automobileEnterVehicleData;
	pages.Automobile.EnterInsurantData automobileEnterInsurantData;
	pages.Truck.EnterVehicleData truckEnterVehicleData;
	pages.Motorcycle.EnterVehicleData motorcycleEnterVehicleData;
	pages.Camper.EnterVehicleData camperEnterVehicleData;
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser)
	{
		this.dr=lib.launchBrowser(browser);
		homePage=new HomePage(dr);
		automobileEnterVehicleData= new pages.Automobile.EnterVehicleData(dr);
		truckEnterVehicleData= new pages.Truck.EnterVehicleData(dr);
		motorcycleEnterVehicleData= new pages.Motorcycle.EnterVehicleData(dr);
		camperEnterVehicleData= new pages.Camper.EnterVehicleData(dr);
		
	}
	
	@BeforeMethod
	public void navigate()
	{
		dr.get(Configuration.url);
	}
	
	@AfterMethod 
	public void afterMethod(ITestResult result){
	
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				lib.captureScreenShot(dr, result.getName());
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
				Assert.fail("Exception while taking screenshot "+e.getMessage());
			} 
		}
	}
	
	@Test
	public void testAutombileLink()
	{
		//step 1. : Verify Automobile link is present on HomePage
		Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
		
		//Step 2: Verify that Automobile link is working
		homePage.clickAutomobile();
		
		//Step 3: Verify that Enter Vehicle Data Page is displayed
		Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
		
	}
	
	
	@Test
	public void testTruckLink()
	{
		//step 1. : Verify Automobile link is present on HomePage
		Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
		
		//Step 2: Verify that Automobile link is working
		homePage.clickAutomobile();
		
		//Step 3: Verify that Enter Vehicle Data Page is displayed
		Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
				
		
	}
	
	@Test
	public void testCamperLink()
	{
		//step 1. : Verify Automobile link is present on HomePage
		Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
		
		//Step 2: Verify that Automobile link is working
		homePage.clickAutomobile();
		
		//Step 3: Verify that Enter Vehicle Data Page is displayed
		Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
		
		
	}
	
	@Test
	public void testMotorCycleLink()
	{
		//step 1. : Verify Automobile link is present on HomePage
		Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
		
		//Step 2: Verify that Automobile link is working
		homePage.clickAutomobile();
		
		//Step 3: Verify that Enter Vehicle Data Page is displayed
		Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		dr.close();
	}

}
