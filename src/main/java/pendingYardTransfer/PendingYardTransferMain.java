package pendingYardTransfer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PendingYardTransferMain {
	public WebDriver driver;
	public WebDriver inheritancePYT() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IshankaPu\\eclipse-workspace\\CucumberBDDPro-1\\ChromeDriver.exe");
	
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
