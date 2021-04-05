package testScripts.Home;

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
import pages.Automobile.EnterVehicleData;
import pages.Home.HomePage;

public class TC_Automobile_Validation extends Driver{
	
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
	public void testTruckPage() throws Exception
	{
		
		//step 1. : Verify Automobile link is present on HomePage
		Assert.assertTrue(homePage.isCamperPresent(),"Automobile link is not present on Home Page");
		//Step 2: Verify that Automobile link is working
		homePage.clickAutomobile();
		
		Thread.sleep(5000);
		
        //PAGE#1 Of Truck TAB : Enter Vehicle Data
		
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
  //Step 8: Verify that Date Of Manufacture field link is working
    automobileEnterVehicleData.enterDateOfManufacture("12/03/2000");
    
    Thread.sleep(5000);
    
  //Step 9: Verify that Number Of Seats is displayed
    Assert.assertTrue(automobileEnterVehicleData.isNumberOfSeats(),"Number Of Seats field is not displayed");	 
  //Step 10: Verify that  Number Of Seats field link is working
    automobileEnterVehicleData.enterNumberOfSeats(5);
    
    Thread.sleep(5000);
    
    
  //Step 11: Verify that Fuel is displayed
    Assert.assertTrue(automobileEnterVehicleData.isFuel(),"Fuel field is not displayed");
  //Step 12: Verify that fuel field link is working
    automobileEnterVehicleData.enterFuel(1);
    
    Thread.sleep(5000);
    
    
  //Step 13: Verify that List Price is displayed
    Assert.assertTrue(automobileEnterVehicleData.isListPrice(),"List Price field is not displayed");
  //Step 14: Verify that List Price field link is working
    automobileEnterVehicleData.enterListPrice(10000);
    
    Thread.sleep(5000);
    
  //Step 15: Verify that License PlateNumber is displayed
    Assert.assertTrue(automobileEnterVehicleData.isLicensePlateNumber(),"License PlateNumber field is not displayed");	
  //Step 16: Verify that License PlateNumber field link is working
    automobileEnterVehicleData.enterLicensePlateNumber(12344);
     
     Thread.sleep(5000);
     
   //Step 17: Verify that Annual Mileage is displayed 
     Assert.assertTrue(automobileEnterVehicleData.isAnnualMileage(),"Annual Mileage field is not displayed");
   //Step 18: Verify that Annual Mileage field link is working 
     automobileEnterVehicleData.enterAnnualMileage(2000);
     
     Thread.sleep(5000);
     
   //Step 19: Verify that Next Button is displayed
     Assert.assertTrue(automobileEnterVehicleData.isNextEnterInsurantData(),"Next Button is not displayed");	
   //Step 20: Verify that Next Button field link is working
     automobileEnterVehicleData.enterNextEnterInsurantData();
     
     Thread.sleep(5000);
   
//		PAGE#2 Of Camper TAB: Enter Insurant Data
     
     //Step 21: Verify that FirstName is displayed
     Assert.assertTrue(automobileEnterInsurantData.isFirstNamePresent(),"First Name field is not displayed");
     //Step 22: Verify that FirstName field link is working
     automobileEnterInsurantData.enterFirstName("TruckFirst");
     
     Thread.sleep(5000);
     
        //Step 23: Verify that Last name field is displayed
   		Assert.assertTrue(automobileEnterInsurantData.isLastNamePresent(),"Last Name field is not displayed");
   		//Step 24: Verify that Last field link is working
   		automobileEnterInsurantData.enterLastName("TruckLast");
   		
   		Thread.sleep(5000);
   		
   	//Step 25: Verify that Birth Date field is displayed
   		Assert.assertTrue(automobileEnterInsurantData.isBirthDatePresent(),"Birth Date field is not displayed");
   	//Step 26: Verify that  Birth Date field link is working
   		automobileEnterInsurantData.enterBirthDate("12/03/1990");
   		
   		Thread.sleep(5000);
   		
   	//Step 27: Verify that Gender field is displayed
   		Assert.assertTrue(automobileEnterInsurantData.isGenderMalePresent(),"Gender Male field is not displayed");
   		Assert.assertTrue(automobileEnterInsurantData.isGenderFemalePresent(),"Gender Female field is not displayed");
   	//Step 28: Verify that  Gender field is working
   		automobileEnterInsurantData.clickGender();
   		
   		Thread.sleep(5000);
   		
   	//Step 29: Verify that Enter Street Address Field is displayed	
   		Assert.assertTrue(automobileEnterInsurantData.isStreetAddressPresent(),"enter street address field is not displayed");
   	//Step 30: Verify that Enter Street Address  field is working
   		automobileEnterInsurantData.enterstreetaddress("enter street address");
   		
   		Thread.sleep(5000);
   		
   	//Step 31: Verify that Country field is displayed
   			Assert.assertTrue(automobileEnterInsurantData.isCountryPresent(),"Country field is not displayed");
   	//Step 32: Verify that Country field is working
   			automobileEnterInsurantData.enterCountry(233);
   			
   		Thread.sleep(5000);	
   			
   	//Step 33: Verify that ZipCode field is displayed
   			Assert.assertTrue(automobileEnterInsurantData.isZipCodePresent(),"Country field is not displayed");
   	//Step 34: Verify that ZipCode field is working	
   			automobileEnterInsurantData.enterZipCode(41101);
     
   		Thread.sleep(5000);	
   		
   	//Step 35: Verify that City field is displayed
   		Assert.assertTrue(automobileEnterInsurantData.isCityPresent(),"City field is not displayed");
   	//Step 36: Verify that City field is working
   		automobileEnterInsurantData.enterCity("California");
   		
   		Thread.sleep(5000);	
   		
   	//Step 37: Verify that Occupation field is displayed	
   		Assert.assertTrue(automobileEnterInsurantData.isOccupationPresent(),"Occupation field is not displayed");
   	//Step 38: Verify that Occupation field link is working	
   		automobileEnterInsurantData.enterOccupation(3);
   		
   		Thread.sleep(5000);	
   		
   	//Step 39 : Verify that Hobbies fields are displayed
   			Assert.assertTrue(automobileEnterInsurantData.isSpeedingPresent(),"Speeding field is not displayed");
   			Assert.assertTrue(automobileEnterInsurantData.isBungeeJumpingPresent(),"Bungee Jumping field is not displayed");
   			Assert.assertTrue(automobileEnterInsurantData.isCliffDivingPresent(),"Cliff Diving field is not displayed");
   			Assert.assertTrue(automobileEnterInsurantData.isSkyDivingPresent(),"Sky Diving field is not displayed");
   			Assert.assertTrue(automobileEnterInsurantData.isOtherPresent(),"Other field is not displayed");
   	//Step 40: Verify that Hobbies field is working
   			automobileEnterInsurantData.clickspeeding();
   			
   			Thread.sleep(5000);	
   			
   	//Step 41: Verify that Enter Website Field is displayed
   			Assert.assertTrue(automobileEnterInsurantData.isWebSitePresent(),"Website field is not displayed");
   	//Step 42: Verify that Website Field is working
   			automobileEnterInsurantData.enterWebsite("www.google.com");
   			
   			Thread.sleep(5000);	
   			
   	//Step 43: Verify that Picture field and Open Button is displayed
   			Assert.assertTrue(automobileEnterInsurantData.isPicturePresent(),"Picture field is not displayed");
   			Assert.assertTrue(automobileEnterInsurantData.isOpenPresent(),"Open Button is not displayed");
   	//Step 44 Verify that Picture field and Open Button is working
   			automobileEnterInsurantData.enterPicture("C:\\Users\\karthik\\Desktop\\New folder (5)\\CW3A4154.jpg");
   			
   			Thread.sleep(5000);	
   			
   	//Step 45: Verify that Next Page Button is displayed
   			Assert.assertTrue(automobileEnterInsurantData.isNextEnterProductDataPresent(),"Next button is not displayed");
   	//Step 46: Verify that Next Page Button is working
   			automobileEnterInsurantData.clickExtEnterProductData();
   			
   			Thread.sleep(5000);	
   			
   			
   			
                 //   			PAGE#3 Of Truck TAB: Enter Product Data	
   			
   	//Step 47: Verify that Start Date is displayed	
   			Assert.assertTrue(automobileEnterProductData.isStartDatePresent(),"Start Date field is not displayed");
   	//Step 48: Verify that Start Date is working			
   			automobileEnterProductData.enterStartDate("12/07/2021");
   			
   			Thread.sleep(5000);	
   			
   	//Step 49: Verify that Insurance Sum is displayed		
   			Assert.assertTrue(automobileEnterProductData.isInsuranceSumPresent(),"Insurance field is not displayed");
   //Step 50: Verify that Insurance Sum is displayed
   			automobileEnterProductData.enterInsuranceSum(2);
   			
   			Thread.sleep(5000);	
   			
   			//Step 51: Verify that merit rating is displayed		
   			Assert.assertTrue(automobileEnterProductData.isMeritRating(),"merit rating field is not displayed");
   //Step 52: Verify that Insurance Sum is displayed
   			automobileEnterProductData.enterMeritRating(2);;		
   			
   	
   //Step 53: Verify that Damage Insurance is displayed
   			Assert.assertTrue(automobileEnterProductData.isDamageInsurancePresent(),"Damage Insurance field is not displayed");
   //Step 54: Verify that Damage Insurance Sum is displayed
   			automobileEnterProductData.enterDamageInsurance(2);
   			
   			Thread.sleep(5000);	
   			
   	//Step 55: Verify that LegalDefenseInsurance and EuroProtection check boxes are displayed
   			Assert.assertTrue(automobileEnterProductData.isEuroProtection(),"EuroProtection checkbox is not displayed");
   			Assert.assertTrue(automobileEnterProductData.isLegalDefenseInsurancePresent(),"LegalDefenseInsurance checkbox is not displayed");
   //Step 56: Verify that EuroProtection is checked
   			automobileEnterProductData.clickEuroProtection();
   			
   			Thread.sleep(5000);	
   		 	//Step 57: Verify that courtesy car field is displayed
   			Assert.assertTrue(automobileEnterProductData.isCourtesyCarPresent(),"courtesy car checkbox is not displayed");
   //Step 58: Verify that courtesy field is checked
   			automobileEnterProductData.enterCourtesyCar(1);
   			
   			Thread.sleep(5000);	
   		
   			
   	//Step 59: Verify that Next Button is displayed
   			Assert.assertTrue(automobileEnterProductData.isnextselectpriceoptionPresent()," Next Button is not displayed");
   	//Step 60: Verify that Next Button  is clicked
   			automobileEnterProductData.clickNextSelectPriceOption();
   			
   			Thread.sleep(5000);
   			
//			PAGE#4 Of Truck TAB: Select Price Option
   			
   		//Step 60: Verify that Silver,Gold,Platinum and Ultimate radio buttons are displayed
   			Assert.assertTrue(automobileSelectPriceOption.isselectsilver(),"Silver Radio Button is not displayed");
   			Assert.assertTrue(automobileSelectPriceOption.isselectgold(),"Gold Radio Button is not displayed");
   			Assert.assertTrue(automobileSelectPriceOption.isselectplatinum()," Platinum Radio Button is not displayed");
   			Assert.assertTrue(automobileSelectPriceOption.isselectultimate()," Ultimate Radio Button is not displayed");
   		//Step 61: Verify that Ultimate radio buttons is clicked
   			automobileSelectPriceOption.clickSelectUltimate();
   			
   			Thread.sleep(5000);
   			
   		// Step 62: Verify that next button are displayed
   			Assert.assertTrue(automobileSelectPriceOption.isnextsendquote(),"Next Button is not displayed");
   		//Step 63 : Verify that next button is working
   			automobileSelectPriceOption.clickNextSendQuote();
   			
   			Thread.sleep(5000);
   			
   			// PAGE#5 Of Truck TAB: Send Quote
   			
   		// Step 64: Verify that E-mail field is displayed
   			Assert.assertTrue(automobileSendQuote.isemail(),"Email field is not displayed");
   		// Step 65: Verify that E-mail field is working
   			automobileSendQuote.entereMail("santhosh.karthik@gmail.com");
   			
   			Thread.sleep(5000);
   			
   		// Step 66: Verify that Phone field is displayed
   			Assert.assertTrue(automobileSendQuote.isemail(),"Email field is not displayed");
   		// Step 67: Verify that Phone field is working
   			automobileSendQuote.enterPhone(1234567890);
   			
   			Thread.sleep(5000);
   			
   		// Step 68: Verify that USername is displayed
   			Assert.assertTrue(automobileSendQuote.isusername(),"Username field is not displayed");
   		// Step 69: Verify that Phone field is working
   			automobileSendQuote.enterUsername("Santosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 70: Verify that Password is displayed
   			Assert.assertTrue(automobileSendQuote.ispassword(),"Username field is not displayed");
   		// Step 71: Verify that Password field is working
   			automobileSendQuote.enterPassword("Pantosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 72: Verify that Password is displayed
   			Assert.assertTrue(automobileSendQuote.isconfirmpassword(),"Username field is not displayed");
   		// Step 73: Verify that Password field is working
   			automobileSendQuote.enterConfirmPassword("Pantosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 74: Verify that Comment is displayed
   			Assert.assertTrue(automobileSendQuote.iscomments(),"Username field is not displayed");
   		// Step 75: Verify that Comment field is working
   			automobileSendQuote.enterComments("Santosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 76: Verify that Send Button is displayed
   			Assert.assertTrue(automobileSendQuote.isSendeMail(),"Username field is not displayed");
   		// Step 77: Verify that Send Button is working
   			automobileSendQuote.clickSendEMail();
   			
   			Thread.sleep(25000); 
   			
   		// Step 78 taking ScreenShot
   			TakesScreenshot screenshot=(TakesScreenshot)dr; File
  		  src=screenshot.getScreenshotAs(OutputType.FILE);
  		  
  		  String name=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
  		  FileHandler.copy(src, new File(
  		  "E:\\Automation\\GitRepo\\AutomationFramework\\Screenshots\\testing_"+name+".png"
  		  ));
   			
	}
}



