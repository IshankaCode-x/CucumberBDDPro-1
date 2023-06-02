package resellingPriceUpdate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResellingPriceUpdateSub extends ResellingPriceUpdateMain {
    public WebDriver driver;
	
	By var_username = By.id("username");
	By var_continue_button = By.name("action");
	By var_password = By.id("passwordInput");
	By var_submit_btn = By.id("submitButton");
	
	public ResellingPriceUpdateSub(WebDriver driver)
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
	
	public WebElement clickYardManagement()
	{
		By var_yard = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[8]/div");
		return driver.findElement(var_yard);
	}
	
	public WebElement clickOnPostYardManagement()
	{
		By var_yard = By.xpath("//*[@id=\"root\"]/div/div/div[2]/ul/li[6]/div");
		return driver.findElement(var_yard);
	}
	
	public WebElement SelectResellingPriceUpdate()
	{
		By var_MarkSeizedHand = By.xpath("//*[@id=\"/AnRkr/yard-management$Menu\"]/li[2]");
		return driver.findElement(var_MarkSeizedHand);
	}
}
