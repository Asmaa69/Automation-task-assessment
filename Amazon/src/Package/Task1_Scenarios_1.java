package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Scenarios_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Asmaa\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("car accessories");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
	   driver.findElement(By.cssSelector("div.s-main-slot.s-result-list.s-search-results.sg-row > div[data-index=\"2\"]")).click();
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		driver.findElement(By.id("nav-cart-count")).click();
		
		driver.quit();

	}

}
