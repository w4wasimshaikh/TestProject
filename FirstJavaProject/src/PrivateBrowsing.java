import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class PrivateBrowsing{
   public static void main(String[] args) throws InterruptedException {
     int i;
     
	  for(i=0;i<100;i++) 
		  
	  {
	   
	   System.setProperty("webdriver.chrome.driver",
      "C:\\Softwares\\Selenium Installation\\IEDriverServer_x64_4.0.0\\chromedriver.exe");
      // configure options parameter to Chrome driver
      ChromeOptions o= new ChromeOptions();
      // add Incognito parameter
      o.addArguments("--incognito");
      // DesiredCapabilities object
      DesiredCapabilities c = new DesiredCapabilities();
      //set capability to browser
      c.setCapability(ChromeOptions.CAPABILITY, o);
      WebDriver driver = new ChromeDriver(o);
      driver.get("https://netpoll.in/PA701U5YQJ");
      driver.manage().window().maximize();
      
      Thread.sleep(5000);
      
      WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/label[5]/input"));
      
      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click();", radio1);
           
      
      WebElement sub = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/button"));
      
      sub.click();
      
      driver.close();
	  }     
   }
}