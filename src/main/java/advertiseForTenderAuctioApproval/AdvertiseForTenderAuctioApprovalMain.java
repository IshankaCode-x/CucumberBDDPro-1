package advertiseForTenderAuctioApproval;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvertiseForTenderAuctioApprovalMain {

	public WebDriver driver;
	public WebDriver inheritanceCAFTA() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IshankaPu\\eclipse-workspace\\CucumberBDDPro-1\\ChromeDriver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
