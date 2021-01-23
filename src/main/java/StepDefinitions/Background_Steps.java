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

public class Background_Steps {
	
	WebDriver driver;

	@Given("^User is in Home page$")
	public void user_is_in_Home_page() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\src\\main\\java\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   
	}

	@When("^title of the Home page is Amazon$")
	public void title_of_the_Home_page_is_Amazon()  {
		String actTitle=driver.getTitle(); String
		expTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(expTitle, actTitle); 
		}
	
	@Given("^Click on Mobile Tab$")
	public void click_on_Mobile_Tab()  {
		
		WebElement mobileLink=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		mobileLink.click();	
		System.out.println("Clicked on mobile link");
	}

	@Then("^mobile page opened with electronics tab$")
	public void mobile_page_opened_with_electronics_tab() {
		WebElement electronicsTab=driver.findElement(By.xpath("//a[text()='Electronics']"));
		electronicsTab.click();
		System.out.println("Clicked on Electronics Tab");
	   
	}

	@Then("^electronics page opened$")
	public void electronics_page_opened() {
	   WebElement elestore=driver.findElement(By.xpath("//h1[text()='The Electronics Store']"));
	   String text=elestore.getText();
	   System.out.println("Text displayed is: "+text);
	   driver.close();
	}

	@Given("^Click on Computers Tab$")
	public void click_on_Computers_Tab()  {
		WebElement compTab=driver.findElement(By.xpath("//a[text()='Computers']"));
		compTab.click();
		
	 
	}

	@When("^validate the header ComputersAndAccessories$")
	public void validate_the_header_ComputersAndAccessories()  {
	    WebElement header=driver.findElement(By.xpath("//h1[text()='Computers & Accessories']"));
	    String actHeader=header.getText();
	    String expHeader="Computers & Accessories";
	    Assert.assertEquals(expHeader, actHeader);
	    driver.close();
	    
	}


	
	    
	}
	
	

