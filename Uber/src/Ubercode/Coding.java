package Ubercode;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coding {
	
	WebDriver driver;
	
	
	  @FindBy(xpath = "//a[@data-testid='edit-delivery-location-button']")
	  public static WebElement Delivery;
	   
	   @FindBy(xpath = "//a[@href='ca/feed?diningMode=DELIVERY&mod=deliveryDetails&pl=JTdCJTIyYWRkcmVzcyUyMiUzQSUyMk9udGFyaW8lMjBTY2llbmNlJTIwQ2VudHJlJTIyJTJDJTIycmVmZXJlbmNlJTIyJTNBJTIyYjkwMjQ2N2EtYTZkMS1mMWViLTFkZDgtMDI5NTgxODQ1ZDJiJTIyJTJDJTIycmVmZXJlbmNlVHlwZSUyMiUzQSUyMnViZXJfcGxhY2VzJTIyJTJDJTIybGF0aXR1ZGUlMjIlM0E0My43MTY4MTI2JTJDJTIybG9uZ2l0dWRlJTIyJTNBLTc5LjMzOTE1MzIlN0Q%3D&ps=1\']")
	   public static WebElement Location;
	   
	   @FindBy(xpath = "//a[@data-testid='change-address-button']")
	   public static WebElement change;
	   
	   @FindBy(xpath = "//input[@placeholder='Enter delivery address']")
	   public static WebElement enterkey;
	   
	
	
	 public void launchBrowser() {
	 	   System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			 PageFactory.initElements(driver, this);

}
	 public void openuber() {
	     String baseUrl = "https://www.ubereats.com/ca/feed?diningMode=DELIVERY&pl=JTdCJTIyYWRkcmVzcyUyMiUzQSUyMk9udGFyaW8lMjBTY2llbmNlJTIwQ2VudHJlJTIyJTJDJTIycmVmZXJlbmNlJTIyJTNBJTIyYjkwMjQ2N2EtYTZkMS1mMWViLTFkZDgtMDI5NTgxODQ1ZDJiJTIyJTJDJTIycmVmZXJlbmNlVHlwZSUyMiUzQSUyMnViZXJfcGxhY2VzJTIyJTJDJTIybGF0aXR1ZGUlMjIlM0E0My43MTY4MTI2JTJDJTIybG9uZ2l0dWRlJTIyJTNBLTc5LjMzOTE1MzIlN0Q%3D";
	     driver.get(baseUrl);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
		    
		 
			 }
	 public void closeuber() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
			
	 }
	public void Delivery() throws InterruptedException {
		Thread.sleep(5000);
		Delivery.click();
		
		
	}
	  public void Location() throws InterruptedException {
		  Thread.sleep(5000);
		  Location.click();
		  
		  
	
	
	}
	    
	public void change () throws InterruptedException {
		Thread.sleep(5000);
		
	    
		}
	public void enterkey () throws InterruptedException {
		 Thread.sleep(5000);
	 
		
	
		
	}
	
	
}
	    
	    
	
	
	    
	 

	

	
	 

	 


	 
	


