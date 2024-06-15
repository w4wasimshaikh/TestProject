import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FisrtSeleniumTest {

	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void launchBrowser() {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
        capabilities.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
		
		
		
		
		System.setProperty("webdriver.ie.driver","C:\\Softwares\\Selenium Installation\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\iexplore.exe");
		
		
		driver=new InternetExplorerDriver(capabilities);
		driver.get("https://www.google.qa/");
		//driver.manage().window().maximize();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FisrtSeleniumTest obj = new FisrtSeleniumTest();
		obj.launchBrowser();
	}
	

}
