package stepdefpack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;

	@Given("^user is searching the google URL$")
	public void user_is_searching_the_google_URL() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Started already");
		
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String arg1) throws Throwable {
	    
		driver.findElement(By.name("q")).sendKeys("Selenium");
	}

	@When("^user enters the enter key$")
	public void user_enters_the_enter_key() throws Throwable {
		driver.findElement(By.name("q")).submit();
	}

	@Then("^user should see the search result$")
	public void user_should_see_the_search_result() throws Throwable {
		String estimated =driver.getTitle() ;
		System.out.println(estimated);
		String actualTitle = "Selenium - Google Search";
	    WebElement ele	= driver.findElement(By.name("q"));
	    String str = ele.getText();
		System.out.println(str);
		Assert.assertEquals(estimated, actualTitle);
		driver.close();
	   	}

}
