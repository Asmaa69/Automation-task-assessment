package Package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class Task_2 {
	
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Asmaa\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	
		driver.manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical	
		
        js.executeScript("window.scrollBy(0,2000)");
        
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		// From
		driver.findElement(By.id("fromPlaceName")).sendKeys("CHIKKAMAGALURU");
		//
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		WebElement select = driver.findElement(By.id("ui-id-1"));

		   List<WebElement> options = select.findElements(By.tagName("li"));

		   for (WebElement option1 : options) {

		   if("CHIKKAMAGALURU".equals(option1.getText().trim()))

		    option1.click();   
		   }    
		   
		   // TO
		   driver.findElement(By.id("toPlaceName")).sendKeys("BENGALURU");
			
		//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
		
			WebElement selectTo = driver.findElement(By.id("ui-id-2"));

			   List<WebElement> optionsTo = selectTo.findElements(By.tagName("li"));

			   for (WebElement option2 : optionsTo) {

			   if("BENGALURU".equals(option2.getText().trim()))

			    option2.click();   
			   }  
		
       driver.findElement(By.id("txtJourneyDate")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]//a[@href]")).click(); 
	
	
		driver.findElement(By.cssSelector("#bookingsForm > div.main-booking > div > div:nth-child(2) > div.col-md-2.mb-1.booking-input > button")).click();
	    
		
	    Thread.sleep(4000);
	
	   driver.findElement(By.xpath("/html/body/main/form/section/div/div[6]/div[3]/div[2]/div[1]/div[1]/div[5]/div/input[4]")).click();
  	 

	    driver.findElement(By.cssSelector("#Forwarddroping-tab")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("li:nth-child(1).Forward-droping")).click();

	    
	     
		driver.findElement(By.linkText("Customer Details")).click();
        driver.findElement(By.id("email")).sendKeys("asmaashendy1@gmail.com");
		driver.findElement(By.name("mobileNo")).sendKeys("6789125987");
		
		((List<WebElement>)driver.findElements(By.cssSelector("li[class='availSeatClassS']"))).get(0).click();
		
		
		driver.findElement(By.name("passengerName")).sendKeys("Ahmed");
		driver.findElement(By.name("passengerAge")).sendKeys("31");
		
		
		Thread.sleep(3000);
		Select drpGender = new Select (driver.findElement(By.name("genderCodeId"))); 
		drpGender.selectByVisibleText("MALE");
		
		
		Select nationality = new Select (driver.findElement(By.id("nationalityForward0"))); 
		nationality.selectByVisibleText("Egypt");
		
		
		
		Select GENERALPUBLIC = new Select (driver.findElement(By.id("concessionIdsForward0"))); 
		GENERALPUBLIC.selectByVisibleText("GENERAL PUBLIC");
		
		driver.findElement(By.name("passportNo")).sendKeys("2022");

		driver.findElement(By.name("foreignerAddress")).sendKeys("Dubai");
		

	    driver.findElement(By.name("dob")).click();
	      
	   	Thread.sleep(2000);
		
	   	Select drpYear = new Select(driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year")));
		drpYear.selectByValue("1991");
		
		Thread.sleep(2000);
		
	   	Select drpMonth = new Select(driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month")));
	   	drpMonth.selectByValue("6");
	   	Thread.sleep(2000);
	   	
	   	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[7]//a[@href]")).click();
	   	
		   
      	driver.findElement(By.id("PgBtn")).click();
		
		driver.quit();
				

	}

}
