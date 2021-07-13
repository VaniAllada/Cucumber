package stepdefpack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefRCDemo {

	WebDriver driver;

	@Given("^user is entering the URL$")
	public void user_is_entering_the_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("^user is entering the uid \"([^\"]*)\" and pswd \"([^\"]*)\"$")
	public void user_is_entering_the_uid_and_pswd(String arg1, String arg2) throws Throwable {				
		driver.findElement(By.name("txtUsername")).sendKeys(arg1);
		driver.findElement(By.name("txtPassword")).sendKeys(arg2);
	}

	@Then("^user going to submit$")
	public void user_going_to_submit() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();	
	}





}
