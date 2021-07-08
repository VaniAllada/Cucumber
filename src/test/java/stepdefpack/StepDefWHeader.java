package stepdefpack;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefWHeader {

	WebDriver driver;
	@Given("^user is to enter the URL$")
	public void user_is_to_enter_the_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("^user is to enter the below uid and pswd$")
	public void user_is_to_enter_the_below_uid_and_pswd(DataTable datatable) throws Throwable {
	    
	List<Map<String, String>> mp =	datatable.asMaps(String.class, String.class);
	 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(mp.get(0).get("username"));
	 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(mp.get(0).get("password"));
    
	}

	@Then("^user submits$")
	public void user_submits() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
	
	}
}
