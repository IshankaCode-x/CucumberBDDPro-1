package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportSub extends ReportMain {

public WebDriver driver;
	
	

	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	
	public ReportSub(WebDriver driver)
	{
		this.driver = driver;
	}

	public WebElement typeUserName()
	{
		return driver.findElement(var_username);
		
	}
	public WebElement clickContinueButton()
	{
		return driver.findElement(var_continue_button);
		
	}
	public WebElement typePassword()
	{
		return driver.findElement(var_password);
		
	}
	public WebElement clicksubmit()
	{
		return driver.findElement(var_submit_btn);
		
	}
	public WebElement ScrollToYardManagement()
	{
		By var_ScrollToYardManagement= By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div/div[2]");
		return driver.findElement(var_ScrollToYardManagement);
	}
	public WebElement clickYardManagement()
	{
		By var_clickYardManagement = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div/div[1]");
		return driver.findElement(var_clickYardManagement);
	}
	public WebElement clickYardRelease()
	{
		By var_clickYardRelease = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[7]/div");
		return driver.findElement(var_clickYardRelease);
	}
	public WebElement ScrollToMarkAsYardOut()
	{
		By var_ScrollToMarkAsYardOut = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]");
		return driver.findElement(var_ScrollToMarkAsYardOut);
	}
	public WebElement clickReport()
	{
		By var_clickReport = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[9]");
		return driver.findElement(var_clickReport);
	}
	public WebElement clickYardDetails()
	{
		By var_clickYardDetails = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[1]/p[1]");
		return driver.findElement(var_clickYardDetails);
	}
	public WebElement clickAgeAnalysis()
	{
		By var_clickAgeAnalysis = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[2]/p[1]");
		return driver.findElement(var_clickAgeAnalysis);
	}
	public WebElement clickPendingYardIn()
	{
		By var_clickPendingYardIn = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[3]/p[1]");
		return driver.findElement(var_clickPendingYardIn);
	}
	public WebElement clickPendingValuations()
	{
		By var_clickPendingValuations = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[4]/p[1]");
		return driver.findElement(var_clickPendingValuations);
	}
	public WebElement clickTemporaryreleasedvehiclelist()
	{
		By var_clickTemporaryreleasedvehiclelist = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[5]/p[1]");
		return driver.findElement(var_clickTemporaryreleasedvehiclelist);
	}
	public WebElement clickYardsummaryreportasatdate()
	{
		By var_clickYardsummaryreportasatdate = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[6]/p[1]");
		return driver.findElement(var_clickYardsummaryreportasatdate);
	}
	public WebElement clicksummaryreportmonthlywisesummary()
	{
		By var_clicksummaryreportmonthlywisesummary = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div[7]/p[1]");
		return driver.findElement(var_clicksummaryreportmonthlywisesummary);
	}

}
