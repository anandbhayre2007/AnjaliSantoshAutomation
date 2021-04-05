package testScripts.Motorcycle;

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
import pages.Motorcycle.EnterVehicleData;
import pages.Home.HomePage;

public class TC_MotorcyclePage_Validation extends Driver {
	
		WebDriver dr;
		
		HomePage homePage;
		pages.Motorcycle.EnterVehicleData motorcycleEnterVehicleData;
		pages.Motorcycle.EnterInsurantData motorcycleEnterInsurantData;
		pages.Motorcycle.EnterProductData motorcycleEnterProductData;
		pages.Motorcycle.SelectPriceOption motorcycleSelectPriceOption;
		pages.Motorcycle.SendQuote motorcycleSendQuote;
//		pages.Truck.EnterVehicleData truckEnterVehicleData;
//		pages.Motorcycle.EnterVehicleData motorcycleEnterVehicleData;
//		pages.Camper.EnterVehicleData camperEnterVehicleData;
		
		@BeforeClass
		@Parameters("browser")
		public void setUp(String browser)
		{
			this.dr=lib.launchBrowser(browser);
			homePage=new HomePage(dr);
			motorcycleEnterVehicleData= new pages.Motorcycle.EnterVehicleData(dr);
			motorcycleEnterInsurantData= new pages.Motorcycle.EnterInsurantData(dr);
			motorcycleEnterProductData = new pages.Motorcycle.EnterProductData(dr);
			motorcycleSelectPriceOption= new pages.Motorcycle.SelectPriceOption(dr);
			motorcycleSendQuote = new pages.Motorcycle.SendQuote(dr);
//			truckEnterVehicleData= new pages.Truck.EnterVehicleData(dr);
//			motorcycleEnterVehicleData= new pages.Motorcycle.EnterVehicleData(dr);
//			camperEnterVehicleData= new pages.Camper.EnterVehicleData(dr);
			
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
		public void testMotorcyclePage() throws Exception
		{
			
			//step 1. : Verify Automobile link is present on HomePage
			Assert.assertTrue(homePage.isMotorcyclePresent(),"Motorcycle link is not present on Home Page");
			//Step 2: Verify that Automobile link is working
			homePage.clickMotorcycle();
			Thread.sleep(5000);
			
//			PAGE#1 Of AUTOMOBILE TAB : Enter Vehicle Data
		
			//Step 3: Verify that Enter Vehicle Data Page is displayed
			Assert.assertTrue(motorcycleEnterVehicleData.isMakePresent(),"Make field is not displayed");
			//Step 4: Verify that MAKE field link is working
			motorcycleEnterVehicleData.enterMake(2);
			
			Thread.sleep(5000);
			
			
			//Step 5: Verify that Engine Performance is displayed
			Assert.assertTrue(motorcycleEnterVehicleData.isEnginePerformancePresent(),"Engine Performance field is not displayed");	
			//Step 6: Verify that Engine Performance field link is working
			motorcycleEnterVehicleData.enterEnginePerformance(200);
			
			Thread.sleep(5000);
			
			//Step 7: Verify that Date Of Manufacture is displayed
			Assert.assertTrue(motorcycleEnterVehicleData.isDateOfManufacturePresent(),"Date Of Manufacture field is not displayed");	
			//Step 8: Verify that Engine Performance field link is working
			motorcycleEnterVehicleData.enterDateOfManufacture("12/03/2000");
			
			Thread.sleep(5000);
			
			//Step 9: Verify that Number Of Seats is displayed
			Assert.assertTrue(motorcycleEnterVehicleData.isNumberOfSeats(),"Number Of Seats field is not displayed");	
			//Step 10: Verify that Engine Performance field link is working
			motorcycleEnterVehicleData.enterNumberOfSeats(5);
			
			Thread.sleep(5000);
			
			//Step 13: Verify that List Price is displayed
			Assert.assertTrue(motorcycleEnterVehicleData.isListPrice(),"List Price field is not displayed");	
			//Step 14: Verify that List Price field link is working
			motorcycleEnterVehicleData.enterListPrice(1000);
			
			Thread.sleep(5000);
			
			
			//Step 15: Verify that Annual Mileage is displayed
			Assert.assertTrue(motorcycleEnterVehicleData.isAnnualMileage(),"Annual Mileage field is not displayed");	
			//Step 16: Verify that Annual Mileage field link is working
			motorcycleEnterVehicleData.enterAnnualMileage(2000);
			
			Thread.sleep(5000);
			
			
			//Step 17: Verify that Next Button is displayed
			Assert.assertTrue(motorcycleEnterVehicleData.isNextEnterInsurantData(),"Next Button is not displayed");	
			//Step 18: Verify that Next Button field link is working
			motorcycleEnterVehicleData.enterNextEnterInsurantData();
			
			
//			PAGE#2 Of AUTOMOBILE TAB: Enter Insurant Data
		
			//Step 19: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isFirstNamePresent(),"First Name field is not displayed");
			//Step 20: Verify that MAKE field link is working
			motorcycleEnterInsurantData.enterFirstName("TestFirst");
			
			Thread.sleep(5000);
			
			
			//Step 21: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isLastNamePresent(),"Last Name field is not displayed");
			//Step 22: Verify that MAKE field link is working
			motorcycleEnterInsurantData.enterLastName("TestLast");
			
			Thread.sleep(5000);
			
			//Step 23: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isBirthDatePresent(),"Birth Date field is not displayed");
			//Step 24: Verify that MAKE field link is working
			motorcycleEnterInsurantData.enterBirthDate("12/03/1990");
			
			Thread.sleep(5000);
			
			//Step 25: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isGenderMalePresent(),"Gender Male field is not displayed");
			//Step 26: Verify that MAKE field link is working
			motorcycleEnterInsurantData.clickGender();
			
			Thread.sleep(5000);
			
			//Step 27: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isStreetAddressPresent(),"enter street address field is not displayed");
			//Step 28: Verify that MAKE field link is working
			motorcycleEnterInsurantData.enterstreetaddress("enter street address");
			
			Thread.sleep(5000);
			
			//Step 29: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isCountryPresent(),"Country field is not displayed");
			//Step 30: Verify that MAKE field link is working
			motorcycleEnterInsurantData.enterCountry(5);
			
			Thread.sleep(5000);
			
			//Step 31: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isZipCodePresent(),"ZipCode field is not displayed");
			//Step 32: Verify that MAKE field link is working
			motorcycleEnterInsurantData.enterZipCode(411013);
			
			Thread.sleep(5000);
			
			//Step 33: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isCityPresent(),"City field is not displayed");
			//Step 34: Verify that MAKE field link is working
			motorcycleEnterInsurantData.enterCity("Pune");
			
			Thread.sleep(5000);
			
			
			//Step 37: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isOccupationPresent(),"Occupation field is not displayed");
			//Step 38: Verify that Occupation field link is working
			motorcycleEnterInsurantData.enterOccupation(3);
			
			Thread.sleep(5000);
			
			//Step 39: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isSpeedingPresent(),"Speeding field is not displayed");
			Assert.assertTrue(motorcycleEnterInsurantData.isBungeeJumpingPresent(),"Bungee Jumping field is not displayed");
			Assert.assertTrue(motorcycleEnterInsurantData.isCliffDivingPresent(),"Cliff Diving field is not displayed");
			Assert.assertTrue(motorcycleEnterInsurantData.isSkyDivingPresent(),"Sky Diving field is not displayed");
			Assert.assertTrue(motorcycleEnterInsurantData.isOtherPresent(),"Other field is not displayed");
			
			//Step 40: Verify that Occupation field link is working
			motorcycleEnterInsurantData.clickspeeding();
			
			Thread.sleep(5000);
			
			//Step 41: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isWebSitePresent(),"Occupation field is not displayed");
			//Step 42: Verify that Occupation field link is working
			motorcycleEnterInsurantData.enterWebsite("www.google.com");
			
			Thread.sleep(5000);
			
			//Step 43: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isPicturePresent(),"Picture field is not displayed");
			Assert.assertTrue(motorcycleEnterInsurantData.isOpenPresent(),"Open Button is not displayed");
			//Step 44: Verify that Occupation field link is working
			motorcycleEnterInsurantData.enterPicture("C:\\Users\\Anjali\\Pictures\\Saved Pictures\\Photos\\Screenshot_20190106-011100.jpg");
			
			Thread.sleep(5000);
			
			//Step 45: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterInsurantData.isNextEnterProductDataPresent(),"Next button is not displayed");
			//Step 46: Verify that Occupation field link is working
			motorcycleEnterInsurantData.clickExtEnterProductData();
			
//			PAGE#3 Of AUTOMOBILE TAB: Enter Product Data
			
			//Step 47: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleEnterProductData.isStartDatePresent(),"Start Date field is not displayed");
			//Step 48: Verify that Start Date field link is working
			motorcycleEnterProductData.enterStartDate("12/03/2021");
			
			Thread.sleep(5000);
			
			
			//Step 49: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleEnterProductData.isInsuranceSumPresent(),"Insurance Sum field is not displayed");
			//Step 50: Verify that Start Date field link is working
			motorcycleEnterProductData.enterInsuranceSum(4);
			
			Thread.sleep(5000);
			
			//Step 53: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleEnterProductData.isDamageInsurancePresent(),"Damage Insurance field is not displayed");
		//Step 54: Verify that Start Date field link is working
			motorcycleEnterProductData.enterDamageInsurance(3);
			
			Thread.sleep(5000);
			
			//Step 53: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleEnterProductData.isEuroProtection(),"Optional Products field is not displayed");
			//Step 54: Verify that Start Date field link is working
			motorcycleEnterProductData.clickEuroProtection();
			
			Thread.sleep(5000);
		
			//Step 57: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleEnterProductData.isnextselectpriceoptionPresent(),"Next button is not displayed");
			//Step 58: Verify that Occupation field link is working
			motorcycleEnterProductData.clickNextSelectPriceOption();
			
			
//			PAGE#4 Of AUTOMOBILE TAB: Select Price Option
			
			//Step 59: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleSelectPriceOption.isselectsilver(),"Select Silver button is not displayed");
			Assert.assertTrue(motorcycleSelectPriceOption.isselectgold(),"Select Gold button is not displayed");
			Assert.assertTrue(motorcycleSelectPriceOption.isselectplatinum(),"Select Platinum button is not displayed");
			Assert.assertTrue(motorcycleSelectPriceOption.isselectultimate(),"Select Ultimate button is not displayed");
			//Step 60: Verify that Occupation field link is working
			motorcycleSelectPriceOption.clickSelectUltimate();
			
			Thread.sleep(5000);
			
			//Step 61: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleSelectPriceOption.isnextsendquote(),"next button is not displayed");
			//Step 62: Verify that Start Date field link is working
			motorcycleSelectPriceOption.clickNextSendQuote();
			
			
//			PAGE#5 Of AUTOMOBILE TAB: Send Quote
			
			//Step 63: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleSendQuote.isemail(),"email field is not displayed");
			//Step 64: Verify that Start Date field link is working
			motorcycleSendQuote.entereMail("test@test.com");
			
			Thread.sleep(2000);
			
			
			//Step 65: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleSendQuote.isphone(),"Phone field is not displayed");
			//Step 66: Verify that Start Date field link is working
			motorcycleSendQuote.enterPhone(12345664);
			
			Thread.sleep(2000);
		
			//Step 67: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleSendQuote.isusername(),"UserName field is not displayed");
			//Step 68: Verify that Start Date field link is working
			motorcycleSendQuote.enterUsername("test");
			
			Thread.sleep(2000);
			
			//Step 69: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleSendQuote.ispassword(),"Password field is not displayed");
			//Step 70: Verify that Start Date field link is working
			motorcycleSendQuote.enterPassword("Test1234");
			
			Thread.sleep(2000);
			
			//Step 71: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleSendQuote.isconfirmpassword(),"Confirm Password field is not displayed");
			//Step 72: Verify that Start Date field link is working
			motorcycleSendQuote.enterConfirmPassword("Test1234");
			
			Thread.sleep(2000);
			
			//Step 73: Verify that Enter Product Data Page is displayed
			Assert.assertTrue(motorcycleSendQuote.iscomments(),"Comments field is not displayed");
			//Step 74: Verify that Start Date field link is working
			motorcycleSendQuote.enterComments("test comment 123445");
		
			Thread.sleep(2000);
			
			//Step 57: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleSendQuote.isSendeMail(),"Send button is not displayed");
			//Step 58: Verify that Occupation field link is working
			motorcycleSendQuote.clickSendEMail();
			
			Thread.sleep(5000);
			
			//Step 57: Verify that Enter Insurant Data Page is displayed
			Assert.assertTrue(motorcycleSendQuote.isSuccessTextPresent(),"Success Text is not displayed");
			//Step 58: Verify that Occupation field link is working
			motorcycleSendQuote.clickOkButton();
			
			
		}

		
	//	
//		@Test
//		public void testTruckLink()
//		{
//			//step 1. : Verify Automobile link is present on HomePage
//			Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
//			
//			//Step 2: Verify that Automobile link is working
//			homePage.clickAutomobile();
//			
//			//Step 3: Verify that Enter Vehicle Data Page is displayed
//			Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
//					
//			
//		}
	//	
//		@Test
//		public void testCamperLink()
//		{
//			//step 1. : Verify Automobile link is present on HomePage
//			Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
//			
//			//Step 2: Verify that Automobile link is working
//			homePage.clickAutomobile();
//			
//			//Step 3: Verify that Enter Vehicle Data Page is displayed
//			Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
//			
//			
//		}
	//	
//		@Test
//		public void testMotorCycleLink()
//		{
//			//step 1. : Verify Automobile link is present on HomePage
//			Assert.assertTrue(homePage.isAutomobilePresent(),"Automobile link is not present on Home Page");
//			
//			//Step 2: Verify that Automobile link is working
//			homePage.clickAutomobile();
//			
//			//Step 3: Verify that Enter Vehicle Data Page is displayed
//			Assert.assertTrue(automobileEnterVehicleData.isMakePresent(),"Enter Vehicle data page is not displayed");
//			
//			
//		}
		
//		@AfterClass
//		public void tearDown()
//		{
//			dr.close();
//		}

	}

	


