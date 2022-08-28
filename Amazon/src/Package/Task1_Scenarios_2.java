package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1_Scenarios_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Asmaa\\Selenium\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver();
  	     JavascriptExecutor js = (JavascriptExecutor) driver;
  	        driver.get("https://www.amazon.com");
  	        
  	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	        
  	       // Thread.sleep(2000);
  	        
  			driver.findElement(By.linkText("Today's Deals")).click();
  			
  			driver.findElement(By.xpath("/html/body/div[1]/div[21]/div/div/div/div[2]/div[2]/span[3]/span/ul/li[20]/label/input")).click();
  		    
  			driver.findElement(By.xpath("/html/body/div[1]/div[21]/div/div/div/div[2]/div[2]/span[3]/span/ul/li[18]/label/input")).click();
  		
			driver.findElement(By.linkText("10% off or more")).click();
			
			Thread.sleep(2000);
			
			 js.executeScript("window.scrollBy(0,3000)");
			 
			 Thread.sleep(2000);
			 
           driver.findElement(By.cssSelector("#slot-15 > div > div > div.GridContainer-module__gridFooter_VLpWMDEvOFj3taV1CiY8J > div > ul > li:nth-child(4) > a")).click();
           
  			driver.findElement(By.cssSelector("#slot-15 > div > div > div.GridContainer-module__gridFooter_VLpWMDEvOFj3taV1CiY8J > div > ul > li:nth-child(5) > a")).click();
  			
  		    Thread.sleep(5000);
  		    
  		    js.executeScript("window.scrollBy(0,5000)");
  		    
  			driver.findElement(By.cssSelector("#grid-main-container > div.a-row.Grid-module__gridSection_1SEJTeTsU88s6aVeuuekAp > div > div:nth-child(6) > div > div")).click();
  		
  			driver.findElement(By.id("add-to-cart-button")).click();
  			    						
  			driver.quit();

	}

}
