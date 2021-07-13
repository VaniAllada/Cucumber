package stepdefpack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefFlipcart {

	WebDriver driver;

	@Given("^loading the web driver$")
	public void loading_the_web_driver() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowser\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("^user is typing url \"([^\"]*)\"$")
	public void user_is_typing_url(String arg1) throws Throwable {
	  driver.get("https://www.flipkart.com");
	}

	@Then("^user should see the result of flipcart page$")
	public void user_should_see_the_result_of_flipcart_page() throws Throwable {
	 
		String estimated =driver.getTitle() ;
		System.out.println(estimated);
		Assert.assertEquals(estimated, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

		
	}

}
