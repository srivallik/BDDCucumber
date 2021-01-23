package StepDefinitions;
  
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	/*@Given("^User is on Application Home Page$")
	public void user_app_Hpme_page() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\src\\main\\java\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jotform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	 * @When("^Title of the Home page is FREE CRM$") public void
	 * title_of_the_Home_page_is_FREE_CRM() {
	 * 
	 * String actTitle=driver.getTitle(); String
	 * expTitle="Free Online Form Builder & Form Creator | JotForm";
	 * Assert.assertEquals(expTitle, actTitle); }
	 * 
	 * @Then("^user enters username and password$") public void
	 * user_enters_username_and_password() {
	 * 
	 * driver.findElement(By.xpath("//a[text()='Login']")).click();
	 * driver.findElement(By.id("jfHeader_username")).sendKeys(
	 * "srivallikodavati@gmail.com");
	 * driver.findElement(By.id("jfHeader_password")).sendKeys("vishwa@123");
	 * 
	 * }
	 * 
	 * @Then("^user clicks on Login button$") public void
	 * user_clicks_on_Login_button() {
	 * 
	 * 
	 * driver.findElement(By.id("signinButton")).click();
	 * 
	 * }
	 * 
	 * @When("^User naviagte to user Profile page$") public void
	 * user_naviagte_to_user_Profile_page() {
	 * 
	 * String proActTitle=driver.getTitle(); String
	 * proExpTitle="My Forms | JotForm"; Assert.assertEquals(proActTitle,
	 * proExpTitle); driver.close();
	 * 
	 * }
	 */

	@Given("^User is on App Home Page$")
	public void user_app_Home_page() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\src\\main\\java\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jotform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}

	@Then("^user clicks on sign up button$")
	public void user_clicks_on_sign_up_button() {
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		driver.findElement(By.xpath("//span[text()='Sign up with Email']")).click();
		WebElement dynamicEle=(WebElement) (new WebDriverWait(driver,15))
				.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
		
		/*
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(30,
		 * SECONDS) .pollingEvery(5, SECONDS) .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement foo = wait.until(new Function<WebDriver, WebElement>() { public
		 * WebElement apply(WebDriver driver) { return driver.findElement(By.id("foo"));
		 * } });
		 */
	
	}
	
	@Then("^user fills the \"([^\"]*)\" details in the form$")
	public void user_fills_the_details_in_the_form(String UserName) {
		
		driver.findElement(By.name("email")).sendKeys(UserName);
		driver.findElement(By.id("jfHeader_suPassword")).sendKeys("vishwa@123");
		driver.findElement(By.name("password-control")).sendKeys("vishwa@123");
	
	}
    
	@And("^user clicks on Submit button$")
	public void user_clicks_on_Submit_button() {
		
		driver.findElement(By.xpath("//button[text()='Create My Account']")).click();
		
	}
	
	
	  @Then("^display already registered message$") public void
	  display_already_registered_message() { String errorMsg=driver.findElement(By.
	  xpath("//div[text()='Please enter a valid email address. Make sure the address isn’t already associated with a JotForm account.']"
	  )).getText(); String
	  expErrorMsg="Please enter a valid email address. Make sure the address isn’t already associated with a JotForm account."
	  ; Assert.assertEquals(errorMsg, expErrorMsg); driver.close();
	  
	  }
	 
	
}
