package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.beust.jcommander.internal.Lists;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import report.ReportMain;
import report.ReportSub;



public class ReportStepDef extends ReportMain  {

	@Given("I need to navigate Fusion X Loging page CORE")
	public void i_need_to_navigate_fusion_x_loging_page_core()  throws Throwable{
		driver=inheritanceRE();
		driver.get("https://uat-sl.fusionx.biz/web/home/AnRkr/dashboard");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@When("I enter   <Username>   CORE")
	public void i_enter_username_core()  throws Throwable{
		ReportSub var1=new ReportSub(driver);
		var1.typeUserName().sendKeys("LakshaniMa@lolctech.com");
		Thread.sleep(2000);
	}
	@When("I click continue button    CORE")
	public void i_click_continue_button_core()  throws Throwable{
		ReportSub var1=new ReportSub(driver);
		var1.clickContinueButton().click();
		Thread.sleep(2000);
	}
	@When("I enter CORE<Password>")
	public void i_enter_core_password()  throws Throwable{
		ReportSub var1=new ReportSub(driver);
		 var1.typePassword().sendKeys("September@1234");
		 Thread.sleep(2000);
	}
	@When("I click the sign in button  CORE")
	public void i_click_the_sign_in_button_core()  throws Throwable{
		ReportSub var1=new ReportSub(driver);
			var1.clicksubmit().click();
			Thread.sleep(2000);
	}
	@When("I Scroll to Yard Management  CORE")
	public void i_scroll_to_yard_management_core()  throws Throwable{
		Thread.sleep(3000);
		ReportSub var1=new ReportSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToYardManagement());
	}
	@When("I click Yard Management  CORE")
	public void i_click_yard_management_core()  throws Throwable{
		Thread.sleep(5000);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		Thread.sleep(5000);
		ReportSub var1=new ReportSub(driver);
		var1.clickYardManagement().click();
		Thread.sleep(5000);
	}
	@When("I click on Yard release CORE")
	public void i_click_on_yard_release_core()  throws Throwable{
		ReportSub var1=new ReportSub(driver);
		List<String> browserTabs = Lists.newArrayList(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    var1.clickYardRelease().click();
	   
	}
	@When("I Scroll to CORE Report")
	public void i_scroll_to_core_report() throws Throwable{
		Thread.sleep(3000);
		ReportSub var1=new ReportSub(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("arguments[0].scrollIntoView(true);", var1.ScrollToMarkAsYardOut());
	}
    
	@When("I Click on Report  CORE")
	public void i_click_on_report_core() throws Throwable{
		Thread.sleep(2000);
		ReportSub var1=new ReportSub(driver);
		var1. clickReport().click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
		
	}

	@When("I Click Yard_Details CORE")
	public void i_click_yard_details_core() throws Throwable{
		ReportSub var1=new ReportSub(driver);
		var1.clickYardDetails().click();
		Thread.sleep(2000);
	}
	
	@When("I Click Age Analysis CORE")
	public void i_click_age_analysis_core() throws Throwable{
		ReportSub var1=new ReportSub(driver);
		var1.clickAgeAnalysis().click();
		Thread.sleep(2000);
	}
	
	@When("I Click Pending Yard-In CORE")
	public void i_click_pending_yard_in_core()  throws Throwable{
		ReportSub var1=new ReportSub(driver);
		var1.clickPendingYardIn().click();
		Thread.sleep(2000);
	}
	
	@When("I Click Pending Valuations CORE")
	public void i_click_pending_valuations_core() throws Throwable{
		ReportSub var1=new ReportSub(driver);
		var1.clickPendingValuations().click();
		Thread.sleep(2000);
	}
	
	@When("I ClickTemporary released vehicle list CORE")
	public void i_click_temporary_released_vehicle_list_core()  throws Throwable{
		ReportSub var1=new ReportSub(driver);
		var1. clickTemporaryreleasedvehiclelist().click();
		Thread.sleep(2000);
	}
	
	@When("I Click Yard summary report as at date CORE")
	public void i_click_yard_summary_report_as_at_date_core() throws Throwable{
		ReportSub var1=new ReportSub(driver);
		var1.clickYardsummaryreportasatdate().click();
		Thread.sleep(2000);
	}
	
	@When("I Click Yard summary report monthly wise summary CORE")
	public void i_click_yard_summary_report_monthly_wise_summary_core() throws Throwable{
		ReportSub var1=new ReportSub(driver);
		var1.clicksummaryreportmonthlywisesummary().click();
		Thread.sleep(2000);
	}








}

