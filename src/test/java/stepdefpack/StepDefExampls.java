package stepdefpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefExampls {

	WebDriver driver;
	@Given("^user is going to enter the URL$")
	public void user_is_going_to_enter_the_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@When("^user is going to enter below  uid \"([^\"]*)\" and pwd \"([^\"]*)\" with examples$")
	public void user_is_going_to_enter_below_uid_and_pwd_with_examples(String arg1, String arg2) throws Throwable {
	    
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(arg2);
	}

	
}
