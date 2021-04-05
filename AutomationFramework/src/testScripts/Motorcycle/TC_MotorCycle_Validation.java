package testScripts.Motorcycle;
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

public class TC_MotorCycle_Validation extends Driver{
	
WebDriver dr;
	
	HomePage homePage;
	pages.Motorcycle.EnterVehicleData motorcycleEnterVehicleData;
	pages.Motorcycle.EnterInsurantData motorcycleEnterInsurantData;
	pages.Motorcycle.EnterProductData motorcycleEnterProductData;
	pages.Motorcycle.SelectPriceOption motorcycleSelectPriceOption;
	pages.Motorcycle.SendQuote motorcycleSendQuote;
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
		motorcycleEnterVehicleData= new pages.Motorcycle.EnterVehicleData(dr);
		motorcycleEnterInsurantData= new pages.Motorcycle.EnterInsurantData(dr);
		motorcycleEnterProductData = new pages.Motorcycle.EnterProductData(dr);
		motorcycleSelectPriceOption= new pages.Motorcycle.SelectPriceOption(dr);
		motorcycleSendQuote = new pages.Motorcycle.SendQuote(dr);
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
	public void testMotorCyclePage() throws Exception
	{
		
		//step 1. : Verify MotorCycle link is present on HomePage
		Assert.assertTrue(homePage.isMotorcyclePresent(),"Motorcycle link is not present on Home Page");
		//Step 2: Verify that Motorcycle link is working
		homePage.clickMotorcycle();
		
		Thread.sleep(5000);
		
        //PAGE#1 Of Truck TAB : Enter Vehicle Data
		
		//Step 3: Verify that Enter Vehicle Data Page is displayed		
    Assert.assertTrue(motorcycleEnterVehicleData.isMakePresent(),"Make field is not displayed");
        //Step 4: Verify that MAKE field link is working
    motorcycleEnterVehicleData.enterMake(2); 
    
    Thread.sleep(5000);
    
  //Step 5: Verify that model is displayed
    Assert.assertTrue(motorcycleEnterVehicleData.isModelPresent(),"Model field is not displayed");
  //Step 6: Verify that model field link is working
    motorcycleEnterVehicleData.enterModel(2);
    
    Thread.sleep(5000);
    
    //Step 7 Verify that Cylinder capacity is displayed
    Assert.assertTrue(motorcycleEnterVehicleData.isCylinderCapacity(),"Cylinder capacity field is not displayed");
  //Step 8: Verify that Pay-load field link is working
    motorcycleEnterVehicleData.enterCylinderCapacity(1000);
    
    Thread.sleep(5000);
    
  //Step 9: Verify that Engine Performance is displayed
    Assert.assertTrue(motorcycleEnterVehicleData.isEnginePerformancePresent(),"Engine Performance field is not displayed");
  //Step 10: Verify that Engine Performance field link is working
    motorcycleEnterVehicleData.enterEnginePerformance(200);
    
    Thread.sleep(5000);
    
  //Step 11: Verify that Date Of Manufacture is displayed
    Assert.assertTrue(motorcycleEnterVehicleData.isDateOfManufacturePresent(),"Date Of Manufacture field is not displayed");
  //Step 12: Verify that Date Of Manufacture field link is working
    motorcycleEnterVehicleData.enterDateOfManufacture("12/03/2000");
    
    Thread.sleep(5000);
    
  //Step 13: Verify that Number Of Seats is displayed
    Assert.assertTrue(motorcycleEnterVehicleData.isNumberOfSeats(),"Number Of Seats field is not displayed");	 
  //Step 14: Verify that  Number Of Seats field link is working
    motorcycleEnterVehicleData.enterNumberOfSeats(2);
    
    Thread.sleep(5000);
    
  //Step 15: Verify that List Price is displayed
    Assert.assertTrue(motorcycleEnterVehicleData.isListPrice(),"List Price field is not displayed");
  //Step 16: Verify that List Price field link is working
    motorcycleEnterVehicleData.enterListPrice(10000);
    
    Thread.sleep(5000);
     
   //Step 17: Verify that Annual Mileage is displayed 
     Assert.assertTrue(motorcycleEnterVehicleData.isAnnualMileage(),"Annual Mileage field is not displayed");
   //Step 18: Verify that Annual Mileage field link is working 
     motorcycleEnterVehicleData.enterAnnualMileage(2000);
     
     Thread.sleep(5000);
     
   //Step 19: Verify that Next Button is displayed
     Assert.assertTrue(motorcycleEnterVehicleData.isNextEnterInsurantData(),"Next Button is not displayed");	
   //Step 20: Verify that Next Button field link is working
     motorcycleEnterVehicleData.enterNextEnterInsurantData();
     
     Thread.sleep(5000);
   
//		PAGE#2 Of Truck TAB: Enter Insurant Data
     
     //Step 21: Verify that FirstName is displayed
     Assert.assertTrue(motorcycleEnterInsurantData.isFirstNamePresent(),"First Name field is not displayed");
   //Step 22: Verify that FirstName field link is working
     motorcycleEnterInsurantData.enterFirstName("TruckFirst");
     
     Thread.sleep(5000);
     
        //Step 23: Verify that Last name field is displayed
   		Assert.assertTrue(motorcycleEnterInsurantData.isLastNamePresent(),"Last Name field is not displayed");
   		//Step 24: Verify that Last field link is working
   		motorcycleEnterInsurantData.enterLastName("TruckLast");
   		
   		Thread.sleep(5000);
   		
   	//Step 25: Verify that Birth Date field is displayed
   		Assert.assertTrue(motorcycleEnterInsurantData.isBirthDatePresent(),"Birth Date field is not displayed");
   	//Step 26: Verify that  Birth Date field link is working
   		motorcycleEnterInsurantData.enterBirthDate("12/03/1990");
   		
   		Thread.sleep(5000);
   		
   	//Step 27: Verify that Gender field is displayed
   		Assert.assertTrue(motorcycleEnterInsurantData.isGenderMalePresent(),"Gender Male field is not displayed");
   		Assert.assertTrue(motorcycleEnterInsurantData.isGenderFemalePresent(),"Gender Female field is not displayed");
   	//Step 28: Verify that  Gender field is working
   		motorcycleEnterInsurantData.clickGender();
   		
   		Thread.sleep(5000);
   		
   	//Step 29: Verify that Enter Street Address Field is displayed	
   		Assert.assertTrue(motorcycleEnterInsurantData.isStreetAddressPresent(),"enter street address field is not displayed");
   	//Step 30: Verify that Enter Street Address  field is working
   		motorcycleEnterInsurantData.enterstreetaddress("enter street address");
   		
   		Thread.sleep(5000);
   		
   	//Step 31: Verify that Country field is displayed
   			Assert.assertTrue(motorcycleEnterInsurantData.isCountryPresent(),"Country field is not displayed");
   	//Step 32: Verify that Country field is working
   			motorcycleEnterInsurantData.enterCountry(233);
   			
   		Thread.sleep(5000);	
   			
   	//Step 33: Verify that ZipCode field is displayed
   			Assert.assertTrue(motorcycleEnterInsurantData.isZipCodePresent(),"Country field is not displayed");
   	//Step 34: Verify that ZipCode field is working	
   			motorcycleEnterInsurantData.enterZipCode(41101);
     
   		Thread.sleep(5000);	
   		
   	//Step 35: Verify that City field is displayed
   		Assert.assertTrue(motorcycleEnterInsurantData.isCityPresent(),"City field is not displayed");
   	//Step 36: Verify that City field is working
   		motorcycleEnterInsurantData.enterCity("California");
   		
   		Thread.sleep(5000);	
   		
   	//Step 37: Verify that Occupation field is displayed	
   		Assert.assertTrue(motorcycleEnterInsurantData.isOccupationPresent(),"Occupation field is not displayed");
   	//Step 38: Verify that Occupation field link is working	
   		motorcycleEnterInsurantData.enterOccupation(3);
   		
   		Thread.sleep(5000);	
   		
   	//Step 39 : Verify that Hobbies fields are displayed
   			Assert.assertTrue(motorcycleEnterInsurantData.isSpeedingPresent(),"Speeding field is not displayed");
   			Assert.assertTrue(motorcycleEnterInsurantData.isBungeeJumpingPresent(),"Bungee Jumping field is not displayed");
   			Assert.assertTrue(motorcycleEnterInsurantData.isCliffDivingPresent(),"Cliff Diving field is not displayed");
   			Assert.assertTrue(motorcycleEnterInsurantData.isSkyDivingPresent(),"Sky Diving field is not displayed");
   			Assert.assertTrue(motorcycleEnterInsurantData.isOtherPresent(),"Other field is not displayed");
   	//Step 40: Verify that Hobbies field is working
   			motorcycleEnterInsurantData.clickspeeding();
   			
   			Thread.sleep(5000);	
   			
   	//Step 41: Verify that Enter Website Field is displayed
   			Assert.assertTrue(motorcycleEnterInsurantData.isWebSitePresent(),"Website field is not displayed");
   	//Step 42: Verify that Website Field is working
   			motorcycleEnterInsurantData.enterWebsite("www.google.com");
   			
   			Thread.sleep(5000);	
   			
   	//Step 43: Verify that Picture field and Open Button is displayed
   			Assert.assertTrue(motorcycleEnterInsurantData.isPicturePresent(),"Picture field is not displayed");
   			Assert.assertTrue(motorcycleEnterInsurantData.isOpenPresent(),"Open Button is not displayed");
   	//Step 44 Verify that Picture field and Open Button is working
   			motorcycleEnterInsurantData.enterPicture("C:\\Users\\karthik\\Desktop\\New folder (5)\\CW3A4154.jpg");
   			
   			Thread.sleep(5000);	
   			
   	//Step 45: Verify that Next Page Button is displayed
   			Assert.assertTrue(motorcycleEnterInsurantData.isNextEnterProductDataPresent(),"Next button is not displayed");
   	//Step 46: Verify that Next Page Button is working
   			motorcycleEnterInsurantData.clickExtEnterProductData();	
   			
   			Thread.sleep(5000);	
   			
   			
   			
                 //   			PAGE#3 Of Truck TAB: Enter Product Data	
   			
   	//Step 47: Verify that Start Date is displayed	
   			Assert.assertTrue(motorcycleEnterProductData.isStartDatePresent(),"Start Date field is not displayed");
   	//Step 48: Verify that Start Date is working			
   			motorcycleEnterProductData.enterStartDate("12/07/2021");
   			
   			Thread.sleep(5000);	
   			
   	//Step 49: Verify that Insurance Sum is displayed		
   			Assert.assertTrue(motorcycleEnterProductData.isInsuranceSumPresent(),"Insurance field is not displayed");
   //Step 50: Verify that Insurance Sum is displayed
   			motorcycleEnterProductData.enterInsuranceSum(2);
   			
   			Thread.sleep(5000);	
   	
   //Step 51: Verify that Damage Insurance is displayed
   			Assert.assertTrue(motorcycleEnterProductData.isDamageInsurancePresent(),"Damage Insurance field is not displayed");
   //Step 52: Verify that Damage Insurance Sum is displayed
   			motorcycleEnterProductData.enterDamageInsurance(2);
   			
   			Thread.sleep(5000);	
   			
   	//Step 53: Verify that LegalDefenseInsurance and EuroProtection check boxes are displayed
   			Assert.assertTrue(motorcycleEnterProductData.isEuroProtection(),"EuroProtection checkbox is not displayed");
   			Assert.assertTrue(motorcycleEnterProductData.isLegalDefenseInsurancePresent(),"LegalDefenseInsurance checkbox is not displayed");
   //Step 54: Verify that EuroProtection is checked
   			motorcycleEnterProductData.clickEuroProtection();
   			
   			Thread.sleep(5000);	
   		
   			
   	//Step 55: Verify that LegalDefenseInsurance and EuroProtection check boxes are displayed
   			Assert.assertTrue(motorcycleEnterProductData.isnextselectpriceoptionPresent()," Next Button is not displayed");
   	//Step 56: Verify that Next Button  is clicked
   			motorcycleEnterProductData.clickNextSelectPriceOption();
   			
   			Thread.sleep(5000);
   			
//			PAGE#4 Of Truck TAB: Select Price Option
   			
   		//Step 57: Verify that Silver,Gold,Platinum and Ultimate radio buttons are displayed
   			Assert.assertTrue(motorcycleSelectPriceOption.isselectsilver(),"Silver Radio Button is not displayed");
   			Assert.assertTrue(motorcycleSelectPriceOption.isselectgold(),"Gold Radio Button is not displayed");
   			Assert.assertTrue(motorcycleSelectPriceOption.isselectplatinum()," Platinum Radio Button is not displayed");
   			Assert.assertTrue(motorcycleSelectPriceOption.isselectultimate()," Ultimate Radio Button is not displayed");
   		//Step 58: Verify that Ultimate radio buttons is clicked
   			motorcycleSelectPriceOption.clickSelectUltimate();
   			
   			Thread.sleep(5000);
   			
   		// Step 59: Verify that next button are displayed
   			Assert.assertTrue(motorcycleSelectPriceOption.isnextsendquote(),"Next Button is not displayed");
   		//Step 60: Verify that next button is working
   			motorcycleSelectPriceOption.clickNextSendQuote();
   			
   			Thread.sleep(5000);
   			
   			// PAGE#5 Of Truck TAB: Send Quote
   			
   		// Step 61: Verify that E-mail field is displayed
   			Assert.assertTrue(motorcycleSendQuote.isemail(),"Email field is not displayed");
   		// Step 62: Verify that E-mail field is working
   			motorcycleSendQuote.entereMail("santhosh.karthik@gmail.com");
   			
   			Thread.sleep(5000);
   			
   		// Step 63: Verify that Phone field is displayed
   			Assert.assertTrue(motorcycleSendQuote.isemail(),"Email field is not displayed");
   		// Step 64: Verify that Phone field is working
   			motorcycleSendQuote.enterPhone(1234567890);
   			
   			Thread.sleep(5000);
   			
   		// Step 65: Verify that USername is displayed
   			Assert.assertTrue(motorcycleSendQuote.isusername(),"Username field is not displayed");
   		// Step 66: Verify that Phone field is working
   			motorcycleSendQuote.enterUsername("Santosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 67: Verify that Password is displayed
   			Assert.assertTrue(motorcycleSendQuote.ispassword(),"Username field is not displayed");
   		// Step 68: Verify that Password field is working
   			motorcycleSendQuote.enterPassword("Pantosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 69: Verify that Password is displayed
   			Assert.assertTrue(motorcycleSendQuote.isconfirmpassword(),"Username field is not displayed");
   		// Step 70: Verify that Password field is working
   			motorcycleSendQuote.enterConfirmPassword("Pantosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 71: Verify that Comment is displayed
   			Assert.assertTrue(motorcycleSendQuote.iscomments(),"Username field is not displayed");
   		// Step 72: Verify that Comment field is working
   			motorcycleSendQuote.enterComments("Santosh9505");
   			
   			Thread.sleep(5000);
   			
   		// Step 73: Verify that Send Button is displayed
   			Assert.assertTrue(motorcycleSendQuote.isSendeMail(),"Username field is not displayed");
   		// Step 74: Verify that Send Button is working
   			motorcycleSendQuote.clickSendEMail();
   			
   			Thread.sleep(25000); 
   			
   			// Step 75 taking ScreenShot
   			TakesScreenshot screenshot=(TakesScreenshot)dr; File
  		  src=screenshot.getScreenshotAs(OutputType.FILE);
  		  
  		  String name=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
  		  FileHandler.copy(src, new File(
  		  "E:\\Automation\\GitRepo\\AutomationFramework\\Screenshots\\testing_"+name+".png"
  		  ));
   			
   			
	}
}

