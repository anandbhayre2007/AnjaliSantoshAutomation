package testScripts.Truck;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
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
import functionLibrary.ApplicationLibrary;
import pages.Automobile.EnterVehicleData;
import pages.Home.HomePage;

public class TC_Truck_Validation extends Driver{
	
WebDriver dr;
	
	HomePage homePage;
	pages.Truck.EnterVehicleData truckEnterVehicleData;
	pages.Truck.EnterInsurantData truckEnterInsurantData;
	pages.Truck.EnterProductData truckEnterProductData;
	pages.Truck.SelectPriceOption truckSelectPriceOption;
	pages.Truck.SendQuote truckSendQuote;
//	pages.Truck.EnterVehicleData truckEnterVehicleData;
//	pages.Motorcycle.EnterVehicleData motorcycleEnterVehicleData;
//	pages.Camper.EnterVehicleData camperEnterVehicleData;
	
	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser)
	{
		lib=new ApplicationLibrary();
		this.dr=lib.launchBrowser(browser);
		homePage=new HomePage(dr);
		truckEnterVehicleData= new pages.Truck.EnterVehicleData(dr);
		truckEnterInsurantData= new pages.Truck.EnterInsurantData(dr);
		truckEnterProductData = new pages.Truck.EnterProductData(dr);
		truckSelectPriceOption= new pages.Truck.SelectPriceOption(dr);
		truckSendQuote = new pages.Truck.SendQuote(dr);
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
	public void testTruckPage() throws Exception
	{
		
		//step 1. : Verify Truck link is present on HomePage
		Assert.assertTrue(homePage.isTruckPresent(),"Truck link is not present on Home Page");
		//Step 2: Verify that Truck link is working
		homePage.clickTruck();
		
		Thread.sleep(3500);
		
		truckEnterVehicleData.enterTruckVehicleDetails();
		truckEnterInsurantData.enterTruckInsurantData();
		truckEnterProductData.enterTruckProductData();
		truckSelectPriceOption.enterTruckSelectPriceOptionData();
		truckSendQuote.enterTruckSendQuoteData();
		
		
		Thread.sleep(15000);
		 
		 TakesScreenshot screenshot = (TakesScreenshot)dr; 
		 File src = screenshot.getScreenshotAs(OutputType.FILE);
		 String name = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		 FileHandler.copy(src, new File(Configuration.screenshotPath+name+"_"+".png"));
		 
		 Assert.assertTrue(truckSendQuote.isOkButtonPresent(), "Username field is not displayed"); // Step 77: Verify that Send Button is
		 truckSendQuote.clickOkButton();
	}
	
	@AfterClass
	public void tearDown()
	{
		dr.close();
	}
		  
}


/*
 * //PAGE#1 Of Truck TAB : Enter Vehicle Data
 * 
 * //Step 3: Verify that Enter Vehicle Data Page is displayed
 * Assert.assertTrue(truckEnterVehicleData.isMakePresent()
 * ,"Make field is not displayed"); //Step 4: Verify that MAKE field link is
 * working truckEnterVehicleData.enterMake(2);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 5: Verify that Engine Performance is displayed
 * Assert.assertTrue(truckEnterVehicleData.isEnginePerformancePresent()
 * ,"Engine Performance field is not displayed"); //Step 6: Verify that Engine
 * Performance field link is working
 * truckEnterVehicleData.enterEnginePerformance(200);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 7: Verify that Date Of Manufacture is displayed
 * Assert.assertTrue(truckEnterVehicleData.isDateOfManufacturePresent()
 * ,"Date Of Manufacture field is not displayed"); //Step 8: Verify that Date Of
 * Manufacture field link is working
 * truckEnterVehicleData.enterDateOfManufacture("12/03/2000");
 * 
 * Thread.sleep(5000);
 * 
 * //Step 9: Verify that Number Of Seats is displayed
 * Assert.assertTrue(truckEnterVehicleData.isNumberOfSeats()
 * ,"Number Of Seats field is not displayed"); //Step 10: Verify that Number Of
 * Seats field link is working truckEnterVehicleData.enterNumberOfSeats(5);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 11: Verify that Fuel is displayed
 * Assert.assertTrue(truckEnterVehicleData.isFuel()
 * ,"Fuel field is not displayed"); //Step 12: Verify that fuel field link is
 * working truckEnterVehicleData.enterFuel(1);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 13 Verify that pay-load is displayed
 * Assert.assertTrue(truckEnterVehicleData.ispayload()
 * ,"Payload field is not displayed"); //Step 14: Verify that Pay-load field
 * link is working truckEnterVehicleData.enterPayLoad(1000);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 15 Verify that total weight is displayed
 * Assert.assertTrue(truckEnterVehicleData.istotalweight()
 * ,"Payload field is not displayed"); //Step 16: Verify that total weight field
 * link is working truckEnterVehicleData.enterTotalWeight(10000);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 17: Verify that List Price is displayed
 * Assert.assertTrue(truckEnterVehicleData.isListPrice()
 * ,"List Price field is not displayed"); //Step 18: Verify that List Price
 * field link is working truckEnterVehicleData.enterListPrice(10000);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 19: Verify that License PlateNumber is displayed
 * Assert.assertTrue(truckEnterVehicleData.isLicensePlateNumber()
 * ,"License PlateNumber field is not displayed"); //Step 20: Verify that
 * License PlateNumber field link is working
 * truckEnterVehicleData.enterLicensePlateNumber(12344);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 21: Verify that Annual Mileage is displayed
 * Assert.assertTrue(truckEnterVehicleData.isAnnualMileage()
 * ,"Annual Mileage field is not displayed"); //Step 22: Verify that Annual
 * Mileage field link is working truckEnterVehicleData.enterAnnualMileage(2000);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 23: Verify that Next Button is displayed
 * Assert.assertTrue(truckEnterVehicleData.isNextEnterInsurantData()
 * ,"Next Button is not displayed"); //Step 24: Verify that Next Button field
 * link is working truckEnterVehicleData.enterNextEnterInsurantData();
 * 
 * Thread.sleep(5000);
 * 
 * //PAGE#2 Of Truck TAB: Enter Insurant Data
 * 
 * //Step 25: Verify that FirstName is displayed
 * Assert.assertTrue(truckEnterInsurantData.isFirstNamePresent()
 * ,"First Name field is not displayed"); //Step 26: Verify that FirstName field
 * link is working truckEnterInsurantData.enterFirstName("TruckFirst");
 * 
 * Thread.sleep(5000);
 * 
 * //Step 27: Verify that Last name field is displayed
 * Assert.assertTrue(truckEnterInsurantData.isLastNamePresent()
 * ,"Last Name field is not displayed"); //Step 28: Verify that Last field link
 * is working truckEnterInsurantData.enterLastName("TruckLast");
 * 
 * Thread.sleep(5000);
 * 
 * //Step 29: Verify that Birth Date field is displayed
 * Assert.assertTrue(truckEnterInsurantData.isBirthDatePresent()
 * ,"Birth Date field is not displayed"); //Step 30: Verify that Birth Date
 * field link is working truckEnterInsurantData.enterBirthDate("12/03/1990");
 * 
 * Thread.sleep(5000);
 * 
 * //Step 31: Verify that Gender field is displayed
 * Assert.assertTrue(truckEnterInsurantData.isGenderMalePresent()
 * ,"Gender Male field is not displayed");
 * Assert.assertTrue(truckEnterInsurantData.isGenderFemalePresent()
 * ,"Gender Female field is not displayed"); //Step 32: Verify that Gender field
 * is working truckEnterInsurantData.clickGender();
 * 
 * Thread.sleep(5000);
 * 
 * //Step 33: Verify that Enter Street Address Field is displayed
 * Assert.assertTrue(truckEnterInsurantData.isStreetAddressPresent()
 * ,"enter street address field is not displayed"); //Step 34: Verify that Enter
 * Street Address field is working
 * truckEnterInsurantData.enterstreetaddress("enter street address");
 * 
 * Thread.sleep(5000);
 * 
 * //Step 35: Verify that Country field is displayed
 * Assert.assertTrue(truckEnterInsurantData.isCountryPresent()
 * ,"Country field is not displayed"); //Step 36: Verify that Country field is
 * working truckEnterInsurantData.enterCountry(233);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 37: Verify that ZipCode field is displayed
 * Assert.assertTrue(truckEnterInsurantData.isZipCodePresent()
 * ,"Country field is not displayed"); //Step 38: Verify that ZipCode field is
 * working truckEnterInsurantData.enterZipCode(41101);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 39: Verify that City field is displayed
 * Assert.assertTrue(truckEnterInsurantData.isCityPresent()
 * ,"City field is not displayed"); //Step 40: Verify that City field is working
 * truckEnterInsurantData.enterCity("California");
 * 
 * Thread.sleep(5000);
 * 
 * //Step 41: Verify that Occupation field is displayed
 * Assert.assertTrue(truckEnterInsurantData.isOccupationPresent()
 * ,"Occupation field is not displayed"); //Step 42: Verify that Occupation
 * field link is working truckEnterInsurantData.enterOccupation(3);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 43 : Verify that Hobbies fields are displayed
 * Assert.assertTrue(truckEnterInsurantData.isSpeedingPresent()
 * ,"Speeding field is not displayed");
 * Assert.assertTrue(truckEnterInsurantData.isBungeeJumpingPresent()
 * ,"Bungee Jumping field is not displayed");
 * Assert.assertTrue(truckEnterInsurantData.isCliffDivingPresent()
 * ,"Cliff Diving field is not displayed");
 * Assert.assertTrue(truckEnterInsurantData.isSkyDivingPresent()
 * ,"Sky Diving field is not displayed");
 * Assert.assertTrue(truckEnterInsurantData.isOtherPresent()
 * ,"Other field is not displayed"); //Step 44: Verify that Hobbies field is
 * working truckEnterInsurantData.clickspeeding();
 * 
 * Thread.sleep(5000);
 * 
 * //Step 45: Verify that Enter Website Field is displayed
 * Assert.assertTrue(truckEnterInsurantData.isWebSitePresent()
 * ,"Website field is not displayed"); //Step 46: Verify that Website Field is
 * working truckEnterInsurantData.enterWebsite("www.google.com");
 * 
 * Thread.sleep(5000);
 * 
 * //Step 47: Verify that Picture field and Open Button is displayed
 * Assert.assertTrue(truckEnterInsurantData.isPicturePresent()
 * ,"Picture field is not displayed");
 * Assert.assertTrue(truckEnterInsurantData.isOpenPresent()
 * ,"Open Button is not displayed"); //Step 48 Verify that Picture field and
 * Open Button is working truckEnterInsurantData.
 * enterPicture("C:\\Users\\karthik\\Desktop\\New folder (5)\\CW3A4154.jpg");
 * 
 * Thread.sleep(5000);
 * 
 * //Step 49: Verify that Next Page Button is displayed
 * Assert.assertTrue(truckEnterInsurantData.isNextEnterProductDataPresent()
 * ,"Next button is not displayed"); //Step 50: Verify that Next Page Button is
 * working truckEnterInsurantData.clickExtEnterProductData();
 * 
 * Thread.sleep(5000);
 * 
 * 
 * 
 * // PAGE#3 Of Truck TAB: Enter Product Data
 * 
 * //Step 51: Verify that Start Date is displayed
 * Assert.assertTrue(truckEnterProductData.isStartDatePresent()
 * ,"Start Date field is not displayed"); //Step 52: Verify that Start Date is
 * working truckEnterProductData.enterStartDate("12/07/2021");
 * 
 * Thread.sleep(5000);
 * 
 * //Step 53: Verify that Insurance Sum is displayed
 * Assert.assertTrue(truckEnterProductData.isInsuranceSumPresent()
 * ,"Insurance field is not displayed"); //Step 54: Verify that Insurance Sum is
 * displayed truckEnterProductData.enterInsuranceSum(2);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 55: Verify that Damage Insurance is displayed
 * Assert.assertTrue(truckEnterProductData.isDamageInsurancePresent()
 * ,"Damage Insurance field is not displayed"); //Step 56: Verify that Damage
 * Insurance Sum is displayed truckEnterProductData.enterDamageInsurance(2);
 * 
 * Thread.sleep(5000);
 * 
 * //Step 57: Verify that LegalDefenseInsurance and EuroProtection check boxes
 * are displayed Assert.assertTrue(truckEnterProductData.isEuroProtection()
 * ,"EuroProtection checkbox is not displayed");
 * Assert.assertTrue(truckEnterProductData.isLegalDefenseInsurancePresent()
 * ,"LegalDefenseInsurance checkbox is not displayed"); //Step 58: Verify that
 * EuroProtection is checked truckEnterProductData.clickEuroProtection();
 * 
 * Thread.sleep(5000);
 * 
 * 
 * //Step 57: Verify that LegalDefenseInsurance and EuroProtection check boxes
 * are displayed
 * Assert.assertTrue(truckEnterProductData.isnextselectpriceoptionPresent()
 * ," Next Button is not displayed"); //Step 58: Verify that Next Button is
 * clicked truckEnterProductData.clickNextSelectPriceOption();
 * 
 * Thread.sleep(5000);
 * 
 * // PAGE#4 Of Truck TAB: Select Price Option
 * 
 * //Step 59: Verify that Silver,Gold,Platinum and Ultimate radio buttons are
 * displayed Assert.assertTrue(truckSelectPriceOption.isselectsilver()
 * ,"Silver Radio Button is not displayed");
 * Assert.assertTrue(truckSelectPriceOption.isselectgold()
 * ,"Gold Radio Button is not displayed");
 * Assert.assertTrue(truckSelectPriceOption.isselectplatinum()
 * ," Platinum Radio Button is not displayed");
 * Assert.assertTrue(truckSelectPriceOption.isselectultimate()
 * ," Ultimate Radio Button is not displayed"); //Step 60: Verify that Ultimate
 * radio buttons is clicked truckSelectPriceOption.clickSelectUltimate();
 * 
 * Thread.sleep(5000);
 * 
 * // Step 61: Verify that next button are displayed
 * Assert.assertTrue(truckSelectPriceOption.isnextsendquote()
 * ,"Next Button is not displayed"); //Step 62 : Verify that next button is
 * working truckSelectPriceOption.clickNextSendQuote();
 * 
 * Thread.sleep(5000);
 * 
 * // PAGE#5 Of Truck TAB: Send Quote
 * 
 * // Step 63: Verify that E-mail field is displayed
 * Assert.assertTrue(truckSendQuote.isemail(),"Email field is not displayed");
 * // Step 64: Verify that E-mail field is working
 * truckSendQuote.entereMail("santhosh.karthik@gmail.com");
 * 
 * Thread.sleep(5000);
 * 
 * // Step 65: Verify that Phone field is displayed
 * Assert.assertTrue(truckSendQuote.isemail(),"Email field is not displayed");
 * // Step 66: Verify that Phone field is working
 * truckSendQuote.enterPhone(1234567890);
 * 
 * Thread.sleep(5000);
 * 
 * // Step 67: Verify that USername is displayed
 * Assert.assertTrue(truckSendQuote.isusername()
 * ,"Username field is not displayed"); // Step 68: Verify that Phone field is
 * working truckSendQuote.enterUsername("Santosh9505");
 * 
 * Thread.sleep(5000);
 * 
 * // Step 69: Verify that Password is displayed
 * Assert.assertTrue(truckSendQuote.ispassword()
 * ,"Username field is not displayed"); // Step 70: Verify that Password field
 * is working truckSendQuote.enterPassword("Pantosh9505");
 * 
 * Thread.sleep(5000);
 * 
 * // Step 70: Verify that Password is displayed
 * Assert.assertTrue(truckSendQuote.isconfirmpassword()
 * ,"Username field is not displayed"); // Step 71: Verify that Password field
 * is working truckSendQuote.enterConfirmPassword("Pantosh9505");
 * 
 * Thread.sleep(5000);
 * 
 * // Step 72: Verify that Comment is displayed
 * Assert.assertTrue(truckSendQuote.iscomments()
 * ,"Username field is not displayed"); // Step 73: Verify that Comment field is
 * working truckSendQuote.enterComments("Santosh9505");
 * 
 * Thread.sleep(5000);
 * 
 * // Step 74: Verify that Send Button is displayed
 * Assert.assertTrue(truckSendQuote.isSendeMail()
 * ,"Username field is not displayed"); // Step 75: Verify that Send Button is
 * working truckSendQuote.clickSendEMail();
 * 
 * Thread.sleep(25000);
 * 
 * // Step 76 taking ScreenShot TakesScreenshot screenshot=(TakesScreenshot)dr;
 * File src=screenshot.getScreenshotAs(OutputType.FILE);
 * 
 * String name=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
 * FileHandler.copy(src, new File(
 * "E:\\Automation\\GitRepo\\AutomationFramework\\Screenshots\\testing_"+name+
 * ".png" ));
 */

