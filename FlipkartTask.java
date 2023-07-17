package FlipkartAssesment1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class FlipkartTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Others\\workspace\\Flipkart\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");  
        
      try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8903877554");
//      try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
      driver.findElement(By.xpath(" /html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
     
      
      
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
       
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iphone 14 pro");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(Keys.ENTER);	
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".\\_1AtVbE:nth-child(2) .\\_4rR01T")).click();
        
        for (String CTab:driver.getWindowHandles()){
        	driver.switchTo().window(CTab);
        }
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//button[normalize-space()='Add to cart']")).click();
        for (String CTab:driver.getWindowHandles()){
        	driver.switchTo().window(CTab);
        }
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
      
      
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("8903877554");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
        
        driver.get("https://www.flipkart.com/search?q=iphone%2014%20pro&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
        
        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[6]/div/div/a/span")).click();
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[3]/div/div[3]/div[2]/div[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div[2]")).click();
        
                
//        string OTP=:"";
//        scanner input=new scanner{system.in};
//        System.out.print{"Enter the OTP"}
//        OTP=input.next line{};
        
//        driver.close();
        
        
	}

}
