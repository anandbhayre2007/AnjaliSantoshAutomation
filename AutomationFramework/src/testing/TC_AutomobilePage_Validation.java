package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
import pages.Automobile.EnterVehicleData;
import pages.Home.HomePage;

public class TC_AutomobilePage_Validation extends Driver{
	
WebDriver dr;
	
	HomePage homePage;
	pages.Automobile.EnterVehicleData automobileEnterVehicleData;
	pages.Automobile.EnterInsurantData automobileEnterInsurantData;
	pages.Automobile.EnterProductData automobileEnterProductData;
	pages.Automobile.SelectPriceOption automobileSelectPriceOption;
	pages.Automobile.SendQuote automobileSendQuote;
//	pages.Truck.EnterVehicleData truckEnterVehicleData;
//	pages.Motorcycle.EnterVehicleData motorcycleEnterVehicleData;
//	pages.Camper.EnterVehicleData camperEnterVehicleData;
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser)
	{
		this.dr=lib.launchBrowser(browser);
		homePage=new HomePage(dr);
		automobileEnterVehicleData= new pages.Automobile.EnterVehicleData(dr);
		automobileEnterInsurantData= new pages.Automobile.EnterInsurantData(dr);
		automobileEnterProductData = new pages.Automobile.EnterProductData(dr);
		automobileSelectPriceOption= new pages.Automobile.SelectPriceOption(dr);
		automobileSendQuote = new pages.Automobile.SendQuote(dr);
//		truckEnterVehicleData= new pages.Truck.EnterVehicleData(dr);
//		motorcycleEnterVehicleData= new pages.Motorcycle.EnterVehicleData(dr);
//		camperEnterVehicleData= new pages.Camper.EnterVehicleData(dr);
		
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
	public void testAutombilePage() throws Exception
	{
		
		//step 1. : Verify Automobile link is present on HomePage
		Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
		//Step 2: Verify that Automobile link is working
		homePage.clickAutomobile();
		Thread.sleep(5000);
		
//		PAGE#1 Of AUTOMOBILE TAB : Enter Vehicle Data
	
		//Step 3: Verify that Enter Vehicle Data Page is displayed
		Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Make field is not displayed");
		//Step 4: Verify that MAKE field link is working
		automobileEnterVehicleData.enterMake(2);
		
		Thread.sleep(5000);
		
		
		//Step 5: Verify that Engine Performance is displayed
		Assert.assertTrue(automobileEnterVehicleData.isEnginePerformancePresent(),"Engine Performance field is not displayed");	
		//Step 6: Verify that Engine Performance field link is working
		automobileEnterVehicleData.enterEnginePerformance(200);
		
		Thread.sleep(5000);
		
		//Step 7: Verify that Date Of Manufacture is displayed
		Assert.assertTrue(automobileEnterVehicleData.isDateOfManufacturePresent(),"Date Of Manufacture field is not displayed");	
		//Step 8: Verify that Engine Performance field link is working
		automobileEnterVehicleData.enterDateOfManufacture("12/03/2000");
		
		Thread.sleep(5000);
		
		//Step 9: Verify that Number Of Seats is displayed
		Assert.assertTrue(automobileEnterVehicleData.isNumberOfSeats(),"Number Of Seats field is not displayed");	
		//Step 10: Verify that Engine Performance field link is working
		automobileEnterVehicleData.enterNumberOfSeats(5);
		
		Thread.sleep(5000);
		
		//Step 11: Verify that Fuel is displayed
		Assert.assertTrue(automobileEnterVehicleData.isFuel(),"Fuel field is not displayed");	
		//Step 12: Verify that Engine Performance field link is working
		automobileEnterVehicleData.enterFuel(1);
		
		Thread.sleep(5000);
		
		//Step 13: Verify that List Price is displayed
		Assert.assertTrue(automobileEnterVehicleData.isListPrice(),"List Price field is not displayed");	
		//Step 14: Verify that List Price field link is working
		automobileEnterVehicleData.enterListPrice("1000");
		
		Thread.sleep(5000);
		
		//Step 13: Verify that License PlateNumber is displayed
		Assert.assertTrue(automobileEnterVehicleData.isLicensePlateNumber(),"License PlateNumber field is not displayed");	
		//Step 14: Verify that License PlateNumber field link is working
		automobileEnterVehicleData.enterLicensePlateNumber(12344);
		
		Thread.sleep(5000);
		
		//Step 15: Verify that Annual Mileage is displayed
		Assert.assertTrue(automobileEnterVehicleData.isAnnualMileage(),"Annual Mileage field is not displayed");	
		//Step 16: Verify that Annual Mileage field link is working
		automobileEnterVehicleData.enterAnnualMileage(2000);
		
		Thread.sleep(5000);
		
		
		//Step 17: Verify that Next Button is displayed
		Assert.assertTrue(automobileEnterVehicleData.isNextEnterInsurantData(),"Next Button is not displayed");	
		//Step 18: Verify that Next Button field link is working
		automobileEnterVehicleData.enterNextEnterInsurantData();
		
		
//		PAGE#2 Of AUTOMOBILE TAB: Enter Insurant Data
	
		//Step 19: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isFirstNamePresent(),"First Name field is not displayed");
		//Step 20: Verify that MAKE field link is working
		automobileEnterInsurantData.enterFirstName("TestFirst");
		
		Thread.sleep(5000);
		
		
		//Step 21: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isLastNamePresent(),"Last Name field is not displayed");
		//Step 22: Verify that MAKE field link is working
		automobileEnterInsurantData.enterLastName("TestLast");
		
	Thread.sleep(5000);
		
		//Step 23: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isBirthDatePresent(),"Birth Date field is not displayed");
		//Step 24: Verify that MAKE field link is working
		automobileEnterInsurantData.enterBirthDate("12/03/1990");
		
		Thread.sleep(5000);
		
		//Step 25: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isGenderMalePresent(),"Gender Male field is not displayed");
		//Step 26: Verify that MAKE field link is working
		automobileEnterInsurantData.clickGender();
		
		Thread.sleep(5000);
		
		//Step 27: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isStreetAddressPresent(),"enter street address field is not displayed");
		//Step 28: Verify that MAKE field link is working
		automobileEnterInsurantData.enterstreetaddress("enter street address");
		
		Thread.sleep(5000);
		
		//Step 29: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isCountryPresent(),"Country field is not displayed");
		//Step 30: Verify that MAKE field link is working
		automobileEnterInsurantData.enterCountry(5);
		
		Thread.sleep(5000);
		
		//Step 31: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isZipCodePresent(),"ZipCode field is not displayed");
		//Step 32: Verify that MAKE field link is working
		automobileEnterInsurantData.enterZipCode(411013);
		
		Thread.sleep(5000);
		
		//Step 33: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isCityPresent(),"City field is not displayed");
		//Step 34: Verify that MAKE field link is working
		automobileEnterInsurantData.enterCity("Pune");
		
		Thread.sleep(5000);
		
		
		//Step 37: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isOccupationPresent(),"Occupation field is not displayed");
		//Step 38: Verify that Occupation field link is working
		automobileEnterInsurantData.enterOccupation(3);
		
		Thread.sleep(5000);
		
		//Step 39: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isSpeedingPresent(),"Speeding field is not displayed");
		Assert.assertTrue(automobileEnterInsurantData.isBungeeJumpingPresent(),"Bungee Jumping field is not displayed");
		Assert.assertTrue(automobileEnterInsurantData.isCliffDivingPresent(),"Cliff Diving field is not displayed");
		Assert.assertTrue(automobileEnterInsurantData.isSkyDivingPresent(),"Sky Diving field is not displayed");
		Assert.assertTrue(automobileEnterInsurantData.isOtherPresent(),"Other field is not displayed");
		
		//Step 40: Verify that Occupation field link is working
		automobileEnterInsurantData.clickspeeding();
		
		Thread.sleep(5000);
		
		//Step 41: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isWebSitePresent(),"Occupation field is not displayed");
		//Step 42: Verify that Occupation field link is working
		automobileEnterInsurantData.enterWebsite("www.google.com");
		
		Thread.sleep(5000);
		
		//Step 43: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isPicturePresent(),"Picture field is not displayed");
		Assert.assertTrue(automobileEnterInsurantData.isOpenPresent(),"Open Button is not displayed");
		//Step 44: Verify that Occupation field link is working
		automobileEnterInsurantData.enterPicture("C:\\Users\\Anjali\\Pictures\\Saved Pictures\\Photos\\Screenshot_20190106-011100.jpg");
		
		Thread.sleep(5000);
		
		//Step 45: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterInsurantData.isNextEnterProductDataPresent(),"Next button is not displayed");
		//Step 46: Verify that Occupation field link is working
		automobileEnterInsurantData.clickExtEnterProductData();
		
//		PAGE#3 Of AUTOMOBILE TAB: Enter Product Data
		
		//Step 47: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileEnterProductData.isStartDatePresent(),"Start Date field is not displayed");
		//Step 48: Verify that Start Date field link is working
		automobileEnterProductData.enterStartDate("12/03/2021");
		
	Thread.sleep(5000);
		
		
		//Step 49: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileEnterProductData.isInsuranceSumPresent(),"Insurance Sum field is not displayed");
		//Step 50: Verify that Start Date field link is working
		automobileEnterProductData.enterInsuranceSum(4);
		
		Thread.sleep(5000);
	
		//Step 51: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileEnterProductData.isMeritRatingPresent(),"Merit Rating field is not displayed");
		//Step 52: Verify that Start Date field link is working
		automobileEnterProductData.enterMeritRating(1);
		
		Thread.sleep(5000);
		
		//Step 53: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileEnterProductData.isDamageInsurancePresent(),"Damage Insurance field is not displayed");
	//Step 54: Verify that Start Date field link is working
		automobileEnterProductData.enterDamageInsurance(3);
		
		Thread.sleep(5000);
		
		//Step 53: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileEnterProductData.isOptionalProductsPresent(),"Optional Products field is not displayed");
		//Step 54: Verify that Start Date field link is working
		automobileEnterProductData.enterOptionalProducts();
		
		Thread.sleep(5000);
		
		//Step 55: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileEnterProductData.isCourtesyCarPresent(),"Courtesy Car field is not displayed");
		//Step 56: Verify that Start Date field link is working
		automobileEnterProductData.enterCourtesyCar(1);
	
		Thread.sleep(2000);
		
		//Step 57: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileEnterProductData.isNextButtonPresent(),"Next button is not displayed");
		//Step 58: Verify that Occupation field link is working
		automobileEnterProductData.enterNextSelectPriceOption();
		
		
//		PAGE#4 Of AUTOMOBILE TAB: Select Price Option
		
		//Step 59: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileSelectPriceOption.isselectsilver(),"Select Silver button is not displayed");
		Assert.assertTrue(automobileSelectPriceOption.isselectgold(),"Select Gold button is not displayed");
		Assert.assertTrue(automobileSelectPriceOption.isselectplatinum(),"Select Platinum button is not displayed");
		Assert.assertTrue(automobileSelectPriceOption.isselectultimate(),"Select Ultimate button is not displayed");
		//Step 60: Verify that Occupation field link is working
		automobileSelectPriceOption.clickSelectUltimate();
		
		Thread.sleep(5000);
		
		//Step 61: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileSelectPriceOption.isnextsendquote(),"next button is not displayed");
		//Step 62: Verify that Start Date field link is working
		automobileSelectPriceOption.clickNextSendQuote();
		
		
//		PAGE#5 Of AUTOMOBILE TAB: Send Quote
		
		//Step 63: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileSendQuote.isemail(),"email field is not displayed");
		//Step 64: Verify that Start Date field link is working
		automobileSendQuote.entereMail("test@test.com");
		
		Thread.sleep(2000);
		
		
		//Step 65: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileSendQuote.isphone(),"Phone field is not displayed");
		//Step 66: Verify that Start Date field link is working
		automobileSendQuote.enterPhone(12345664);
		
		Thread.sleep(2000);
	
		//Step 67: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileSendQuote.isusername(),"UserName field is not displayed");
		//Step 68: Verify that Start Date field link is working
		automobileSendQuote.enterUsername("test");
		
		Thread.sleep(2000);
		
		//Step 69: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileSendQuote.ispassword(),"Password field is not displayed");
		//Step 70: Verify that Start Date field link is working
		automobileSendQuote.enterPassword("Test1234");
		
		Thread.sleep(2000);
		
		//Step 71: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileSendQuote.isconfirmpassword(),"Confirm Password field is not displayed");
		//Step 72: Verify that Start Date field link is working
		automobileSendQuote.enterConfirmPassword("Test1234");
		
		Thread.sleep(2000);
		
		//Step 73: Verify that Enter Product Data Page is displayed
		Assert.assertTrue(automobileSendQuote.iscomments(),"Comments field is not displayed");
		//Step 74: Verify that Start Date field link is working
		automobileSendQuote.enterComments("test comment 123445");
	
		Thread.sleep(2000);
		
		//Step 57: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileSendQuote.isSendeMail(),"Send button is not displayed");
		//Step 58: Verify that Occupation field link is working
		automobileSendQuote.clickSendEMail();
		
		Thread.sleep(5000);
		
		//Step 57: Verify that Enter Insurant Data Page is displayed
		Assert.assertTrue(automobileSendQuote.isSuccessTextPresent(),"Success Text is not displayed");
		//Step 58: Verify that Occupation field link is working
		automobileSendQuote.clickOkButton();
		
		
	}

	
//	
//	@Test
//	public void testTruckLink()
//	{
//		//step 1. : Verify Automobile link is present on HomePage
//		Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
//		
//		//Step 2: Verify that Automobile link is working
//		homePage.clickAutomobile();
//		
//		//Step 3: Verify that Enter Vehicle Data Page is displayed
//		Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
//				
//		
//	}
//	
//	@Test
//	public void testCamperLink()
//	{
//		//step 1. : Verify Automobile link is present on HomePage
//		Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
//		
//		//Step 2: Verify that Automobile link is working
//		homePage.clickAutomobile();
//		
//		//Step 3: Verify that Enter Vehicle Data Page is displayed
//		Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
//		
//		
//	}
//	
//	@Test
//	public void testMotorCycleLink()
//	{
//		//step 1. : Verify Automobile link is present on HomePage
//		Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
//		
//		//Step 2: Verify that Automobile link is working
//		homePage.clickAutomobile();
//		
//		//Step 3: Verify that Enter Vehicle Data Page is displayed
//		Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
//		
//		
//	}
	
//	@AfterClass
//	public void tearDown()
//	{
//		dr.close();
//	}

}
