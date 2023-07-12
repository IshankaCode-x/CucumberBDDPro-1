package printGatePass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintGatePassMain {

	public WebDriver driver;
	public WebDriver inheritanceGP () 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IshankaPu\\eclipse-workspace\\CucumberBDDPro-1\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
