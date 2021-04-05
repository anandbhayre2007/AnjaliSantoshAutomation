package testScripts.Camper;

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

public class TC_Camper_Validation extends Driver{
	
WebDriver dr;
	
	HomePage homePage;
	pages.Camper.EnterVehicleData camperEnterVehicleData;
	pages.Camper.EnterInsurantData camperEnterInsurantData;
	pages.Camper.EnterProductData camperEnterProductData;
	pages.Camper.SelectPriceOption camperSelectPriceOption;
	pages.Camper.SendQuote camperSendQuote;
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
		camperEnterVehicleData= new pages.Camper.EnterVehicleData(dr);
		camperEnterInsurantData= new pages.Camper.EnterInsurantData(dr);
		camperEnterProductData = new pages.Camper.EnterProductData(dr);
		camperSelectPriceOption= new pages.Camper.SelectPriceOption(dr);
		camperSendQuote = new pages.Camper.SendQuote(dr);
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
	public void testCamperPage() throws Exception
	{
		
		//step 1. : Verify Camper link is present on HomePage
		Assert.assertTrue(homePage.isCamperPresent(),"Camper link is not present on Home Page");
		//Step 2: Verify that Camper link is working
		homePage.clickCamper();
		
		Thread.sleep(5000);
		
        //PAGE#1 Of Truck TAB : Enter Vehicle Data
		
		//Step 3: Verify that Enter Vehicle Data Page is displayed		
       Assert.assertTrue(camperEnterVehicleData.isMakePresent(),"Make field is not displayed");
        //Step 4: Verify that MAKE field link is working
       camperEnterVehicleData.enterMake(2); 
    
       Thread.sleep(5000);
    
        //Step 5: Verify that Engine Performance is displayed
       Assert.assertTrue(camperEnterVehicleData.isEnginePerformancePresent(),"Engine Performance field is not displayed");
        //Step 6: Verify that Engine Performance field link is working
       camperEnterVehicleData.enterEnginePerformance(200);
    
    Thread.sleep(5000);
    
       //Step 7: Verify that Date Of Manufacture is displayed
       Assert.assertTrue(camperEnterVehicleData.isDateOfManufacturePresent(),"Date Of Manufacture field is not displayed");
       //Step 8: Verify that Date Of Manufacture field link is working
       camperEnterVehicleData.enterDateOfManufacture("12/03/2000");
    
    Thread.sleep(5000);
    
      //Step 9: Verify that Number Of Seats is displayed
       Assert.assertTrue(camperEnterVehicleData.isNumberOfSeats(),"Number Of Seats field is not displayed");	 
      //Step 10: Verify that  Number Of Seats field link is working
       camperEnterVehicleData.enterNumberOfSeats(5);
    
    Thread.sleep(5000);
    
      //Step 76: Verify that righthanddrive is displayed
      Assert.assertTrue(camperEnterVehicleData.isrighthanddriveno(),"righthanddrive no field is not displayed");
      Assert.assertTrue(camperEnterVehicleData.isrighthanddriveyes(),"righthanddrive yes field is not displayed");
      //Step 77: Verify that  righthanddrive yes field link is clickable
      camperEnterVehicleData.clickrighthanddriveyes();
    
    Thread.sleep(5000);
    
      //Step 11: Verify that Fuel is displayed
      Assert.assertTrue(camperEnterVehicleData.isFuel(),"Fuel field is not displayed");
      //Step 12: Verify that fuel field link is working
      camperEnterVehicleData.enterFuel(1);
    
    Thread.sleep(5000);
    
      //Step 13 Verify that pay-load is displayed
      Assert.assertTrue(camperEnterVehicleData.ispayload(),"Payload field is not displayed");
     //Step 14: Verify that Pay-load field link is working
      camperEnterVehicleData.enterPayLoad(1000);
    
    Thread.sleep(5000);
    
    //Step 15 Verify that total weight is displayed
    Assert.assertTrue(camperEnterVehicleData.istotalweight(),"Payload field is not displayed");
    //Step 16: Verify that total weight field link is working
    camperEnterVehicleData.enterTotalWeight(10000);
    
    Thread.sleep(5000);
    
     //Step 17: Verify that List Price is displayed
     Assert.assertTrue(camperEnterVehicleData.isListPrice(),"List Price field is not displayed");
     //Step 18: Verify that List Price field link is working
    camperEnterVehicleData.enterListPrice(10000);
    
    Thread.sleep(5000);
    
    //Step 19: Verify that License PlateNumber is displayed
    Assert.assertTrue(camperEnterVehicleData.isLicensePlateNumber(),"License PlateNumber field is not displayed");	
    //Step 20: Verify that License PlateNumber field link is working
    camperEnterVehicleData.enterLicensePlateNumber(12344);
     
   Thread.sleep(5000);
     
   //Step 21: Verify that Annual Mileage is displayed 
     Assert.assertTrue(camperEnterVehicleData.isAnnualMileage(),"Annual Mileage field is not displayed");
   //Step 22: Verify that Annual Mileage field link is working 
     camperEnterVehicleData.enterAnnualMileage(2000);
     
     Thread.sleep(5000);
     
   //Step 23: Verify that Next Button is displayed
     Assert.assertTrue(camperEnterVehicleData.isNextEnterInsurantData(),"Next Button is not displayed");	
   //Step 24: Verify that Next Button field link is working
     camperEnterVehicleData.enterNextEnterInsurantData();
     
     Thread.sleep(5000);
   
//		PAGE#2 Of Camper TAB: Enter Insurant Data
     
     //Step 25: Verify that FirstName is displayed
     Assert.assertTrue(camperEnterInsurantData.isFirstNamePresent(),"First Name field is not displayed");
   //Step 26: Verify that FirstName field link is working
     camperEnterInsurantData.enterFirstName("TruckFirst");
     
     Thread.sleep(5000);
     
        //Step 27: Verify that Last name field is displayed
   		Assert.assertTrue(camperEnterInsurantData.isLastNamePresent(),"Last Name field is not displayed");
   		//Step 28: Verify that Last field link is working
   		camperEnterInsurantData.enterLastName("TruckLast");
   		
   		Thread.sleep(5000);
   		
   	//Step 29: Verify that Birth Date field is displayed
   		Assert.assertTrue(camperEnterInsurantData.isBirthDatePresent(),"Birth Date field is not displayed");
   	//Step 30: Verify that  Birth Date field link is working
   		camperEnterInsurantData.enterBirthDate("12/03/1990");
   		
   		Thread.sleep(5000);
   		
   	//Step 31: Verify that Gender field is displayed
   		Assert.assertTrue(camperEnterInsurantData.isGenderMalePresent(),"Gender Male field is not displayed");
   		Assert.assertTrue(camperEnterInsurantData.isGenderFemalePresent(),"Gender Female field is not displayed");
   	//Step 32: Verify that  Gender field is working
   		camperEnterInsurantData.clickGender();
   		
   		Thread.sleep(5000);
   		
   	//Step 33: Verify that Enter Street Address Field is displayed	
   		Assert.assertTrue(camperEnterInsurantData.isStreetAddressPresent(),"enter street address field is not displayed");
   	//Step 34: Verify that Enter Street Address  field is working
   		camperEnterInsurantData.enterstreetaddress("enter street address");
   		
   		Thread.sleep(5000);
   		
   	//Step 35: Verify that Country field is displayed
   			Assert.assertTrue(camperEnterInsurantData.isCountryPresent(),"Country field is not displayed");
   	//Step 36: Verify that Country field is working
   			camperEnterInsurantData.enterCountry(233);
   			
   		Thread.sleep(5000);	
   			
   	//Step 37: Verify that ZipCode field is displayed
   			Assert.assertTrue(camperEnterInsurantData.isZipCodePresent(),"Country field is not displayed");
   	//Step 38: Verify that ZipCode field is working	
   			camperEnterInsurantData.enterZipCode(41101);
     
   		Thread.sleep(5000);	
   		
   	//Step 39: Verify that City field is displayed
   		Assert.assertTrue(camperEnterInsurantData.isCityPresent(),"City field is not displayed");
   	//Step 40: Verify that City field is working
   		camperEnterInsurantData.enterCity("California");
   		
   		Thread.sleep(5000);	
   		
   	//Step 41: Verify that Occupation field is displayed	
   		Assert.assertTrue(camperEnterInsurantData.isOccupationPresent(),"Occupation field is not displayed");
   	//Step 42: Verify that Occupation field link is working	
   		camperEnterInsurantData.enterOccupation(3);
   		
   		Thread.sleep(5000);	
   		
   	//Step 43 : Verify that Hobbies fields are displayed
   			Assert.assertTrue(camperEnterInsurantData.isSpeedingPresent(),"Speeding field is not displayed");
   			Assert.assertTrue(camperEnterInsurantData.isBungeeJumpingPresent(),"Bungee Jumping field is not displayed");
   			Assert.assertTrue(camperEnterInsurantData.isCliffDivingPresent(),"Cliff Diving field is not displayed");
   			Assert.assertTrue(camperEnterInsurantData.isSkyDivingPresent(),"Sky Diving field is not displayed");
   			Assert.assertTrue(camperEnterInsurantData.isOtherPresent(),"Other field is not displayed");
   	//Step 44: Verify that Hobbies field is working
   			camperEnterInsurantData.clickspeeding();
   			
   			Thread.sleep(5000);	
   			
   	//Step 45: Verify that Enter Website Field is displayed
   			Assert.assertTrue(camperEnterInsurantData.isWebSitePresent(),"Website field is not displayed");
   	//Step 46: Verify that Website Field is working
   			camperEnterInsurantData.enterWebsite("www.google.com");
   			
   			Thread.sleep(5000);	
   			
   	//Step 47: Verify that Picture field and Open Button is displayed
   			Assert.assertTrue(camperEnterInsurantData.isPicturePresent(),"Picture field is not displayed");
   			Assert.assertTrue(camperEnterInsurantData.isOpenPresent(),"Open Button is not displayed");
   	//Step 48 Verify that Picture field and Open Button is working
   			camperEnterInsurantData.enterPicture("C:\\Users\\karthik\\Desktop\\New folder (5)\\CW3A4154.jpg");
   			
   			Thread.sleep(5000);	
   			
   	//Step 49: Verify that Next Page Button is displayed
   			Assert.assertTrue(camperEnterInsurantData.isNextEnterProductDataPresent(),"Next button is not displayed");
   	//Step 50: Verify that Next Page Button is working
   			camperEnterInsurantData.clickExtEnterProductData();	
   			
   			Thread.sleep(5000);	
   			
   			
   			
                 //   			PAGE#3 Of Truck TAB: Enter Product Data	
   			
   	//Step 51: Verify that Start Date is displayed	
   			Assert.assertTrue(camperEnterProductData.isStartDatePresent(),"Start Date field is not displayed");
   	//Step 52: Verify that Start Date is working			
   			camperEnterProductData.enterStartDate("12/07/2021");
   			
   			Thread.sleep(5000);	
   			
   	//Step 53: Verify that Insurance Sum is displayed		
   			Assert.assertTrue(camperEnterProductData.isInsuranceSumPresent(),"Insurance field is not displayed");
   //Step 54: Verify that Insurance Sum is displayed
   			camperEnterProductData.enterInsuranceSum(2);
   			
   			Thread.sleep(5000);	
   	
   //Step 55: Verify that Damage Insurance is displayed
   			Assert.assertTrue(camperEnterProductData.isDamageInsurancePresent(),"Damage Insurance field is not displayed");
   //Step 56: Verify that Damage Insurance Sum is displayed
   			camperEnterProductData.enterDamageInsurance(2);
   			
   			Thread.sleep(5000);	
   			
   	//Step 57: Verify that LegalDefenseInsurance and EuroProtection check boxes are displayed
   			Assert.assertTrue(camperEnterProductData.isEuroProtection(),"EuroProtection checkbox is not displayed");
   			Assert.assertTrue(camperEnterProductData.isLegalDefenseInsurancePresent(),"LegalDefenseInsurance checkbox is not displayed");
   //Step 58: Verify that EuroProtection is checked
   			camperEnterProductData.clickEuroProtection();
   			
   			Thread.sleep(5000);	
   		
   			
   	//Step 57: Verify that LegalDefenseInsurance and EuroProtection check boxes are displayed
   			Assert.assertTrue(camperEnterProductData.isnextselectpriceoptionPresent()," Next Button is not displayed");
   	//Step 58: Verify that Next Button  is clicked
   			camperEnterProductData.clickNextSelectPriceOption();
   			
   			Thread.sleep(5000);
   			
//			PAGE#4 Of Truck TAB: Select Price Option
   			
   		//Step 59: Verify that Silver,Gold,Platinum and Ultimate radio buttons are displayed
   			Assert.assertTrue(camperSelectPriceOption.isselectsilver(),"Silver Radio Button is not displayed");
   			Assert.assertTrue(camperSelectPriceOption.isselectgold(),"Gold Radio Button is not displayed");
   			Assert.assertTrue(camperSelectPriceOption.isselectplatinum()," Platinum Radio Button is not displayed");
   			Assert.assertTrue(camperSelectPriceOption.isselectultimate()," Ultimate Radio Button is not displayed");
   		//Step 60: Verify that Ultimate radio buttons is clicked
   			camperSelectPriceOption.clickSelectUltimate();
   			
   			Thread.sleep(5000);
   			
   		// Step 61: Verify that next button are displayed
   			Assert.assertTrue(camperSelectPriceOption.isnextsendquote(),"Next Button is not displayed");
   		//Step 62 : Verify that next button is working
   			camperSelectPriceOption.clickNextSendQuote();
   			
   			Thread.sleep(5000);
   			
   			// PAGE#5 Of Truck TAB: Send Quote
   			
   		// Step 63: Verify that E-mail field is displayed
   			Assert.assertTrue(camperSendQuote.isemail(),"Email field is not displayed");
   		// Step 64: Verify that E-mail field is working
   			camperSendQuote.entereMail("santhosh.karthik@gmail.com");
   			
   			Thread.sleep(5000);
   			
   		// Step 65: Verify that Phone field is displayed
   			Assert.assertTrue(camperSendQuote.isemail(),"Email field is not displayed");
   		// Step 66: Verify that Phone field is working
   			camperSendQuote.enterPhone(1234567890);
   			
   			Thread.sleep(5000);
   			
   		// Step 67: Verify that USername is displayed
   			Assert.assertTrue(camperSendQuote.isusername(),"Username field is not displayed");
   		// Step 68: Verify that Phone field is working
   			camperSendQuote.enterUsername("Santosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 69: Verify that Password is displayed
   			Assert.assertTrue(camperSendQuote.ispassword(),"Username field is not displayed");
   		// Step 70: Verify that Password field is working
   			camperSendQuote.enterPassword("Pantosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 70: Verify that Password is displayed
   			Assert.assertTrue(camperSendQuote.isconfirmpassword(),"Username field is not displayed");
   		// Step 71: Verify that Password field is working
   			camperSendQuote.enterConfirmPassword("Pantosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 72: Verify that Comment is displayed
   			Assert.assertTrue(camperSendQuote.iscomments(),"Username field is not displayed");
   		// Step 73: Verify that Comment field is working
   			camperSendQuote.enterComments("Santosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 74: Verify that Send Button is displayed
   			Assert.assertTrue(camperSendQuote.isSendeMail(),"Username field is not displayed");
   		// Step 75: Verify that Send Button is working
   			camperSendQuote.clickSendEMail();
   			
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


