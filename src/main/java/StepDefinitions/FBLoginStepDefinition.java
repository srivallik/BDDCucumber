package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FBLoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is on Login page$")
	public void user_is_on_Login_page(){
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@When("^Title of the page is Facebook$")
	public void title_of_the_page_is_Facebook() {
		
		String expTitle="Facebook – log in or sign up";
		String actTitle=driver.getTitle();
		Assert.assertEquals(expTitle, actTitle);
	    
	}

	@Then("^enter username and password$")
	public void enter_username_and_password()  {
	    WebElement usn=driver.findElement(By.id("email"));
	    WebElement pwd=driver.findElement(By.id("pass"));	
	    usn.sendKeys("srivallikodavati@gmail.com");
	    pwd.sendKeys("Intelli@123");
	    
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button() {
	   WebElement login=driver.findElement(By.xpath("//button[text()='Log In']"));
	   login.click();
	}

	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed(){
		
		String expHomeTitle="Facebook";
		String actHomeTitle=driver.getTitle();
		if(actHomeTitle.contains(expHomeTitle)) {
			System.out.println("Title displayed as expected");}
			else {
			System.out.println("Title not displayed as expected");
		}
		/*
		 * WebElement nav=driver.findElement(By.xpath(
		 * "//div[@role='navigation']/span/div/div[@role='button']")); nav.click();
		 */
		
		driver.close();
	   
	}

}
