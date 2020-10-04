package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class steps {
	
	    WebDriver driver;

		@Before
		public void beforetest()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		@After
		public void aftertest()
		{
			driver.close();
		}
		
		
	    @Given("I am able to naviagte onto the Sign up page")
		public void i_am_able_to_naviagte_onto_the_sign_up_page() {
		    // Write code here that turns the phrase above into concrete actions
	    	driver.get("http://elearningm1.upskills.in/");
	    	
	    	
		    
		}

	    @When("I click on the Signup button")
		public void i_click_on_the_signup_button() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//*[@id='login-block']/div/ul/li[1]/a")).click();
			
		    
		}

		@When("I Enter the First Name as {string}")
		public void i_enter_the_first_name_as(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			//Thread.sleep(7000);
			driver.findElement(By.id("registration_firstname")).sendKeys(string);
					    
		}
		@When("I Enter the Last Name as {string}")
		public void i_enter_the_last_name_as(String string) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("registration_lastname")).sendKeys(string);
		}
		@When("I Enter the Email as {string}")
		public void i_enter_the_email_as(String string) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("registration_email")).sendKeys(string);
		}
		@When("I Enter the Username as {string}")
		public void i_enter_the_username_as(String string) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("username")).sendKeys(string);
		    
		}
		@When("I Enter the Password as {string}")
		public void i_enter_the_password_as(String string) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("pass1")).sendKeys(string);  
		}
		@When("I Enter the Confirm Password as {string}")
		public void i_enter_the_confirm_password_as(String string) {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("pass2")).sendKeys(string);
		}
		@When("I click on the Register button")
		public void i_click_on_the_register_button() {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("registration_submit")).click();
		    
		}
		@Then("I should see the message as {string}")
		public void i_should_see_the_message_as(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			String expected = driver.findElement(By.xpath("//*[@id='cm-content']/div/ul/li")).getText();
			//String expected = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/p[1]/text()[2]")).getText();	
			Thread.sleep(3000);
			Assert.assertEquals(expected,string);
			driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/a")).click();
			
		    Thread.sleep(5000);	
		  
		}
		@Then("I should see the mailid as {string}")
		public void i_should_see_the_mailid_as(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			//String expected = driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p/text()")).getText();
			//String expected = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/p[1]/text()[2]")).getText();
			String expected = driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p")).getText();			
			Assert.assertEquals(expected,string);
			driver.findElement(By.xpath("//*[@id='navbar']/ul[1]/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id='profileCollapse']/div/ul/li[2]/a")).click();
			//driver.findElement(By.id("logout_button")).click();
			Thread.sleep(5000);	
		  
		}
		
		@Then("I should see the text as {string}")
		public void i_should_see_the_text_as(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			String expected = driver.findElement(By.xpath("//*[@id='cm-content']/div/ul/li")).getText();			
			Assert.assertEquals(expected,string);
			  
		}
		
		@Then("I Enter the SendTo as {string}")
		public void i_enter_the_sendto_as(String string) throws InterruptedException {
			
			// Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//*[@id='compose_message']/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys(string + Keys.ENTER);
			  
		}
		
		@Then("I Enter the Subject as {string}")
		public void i_enter_the_subject_as(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//*[@id='compose_message_title']")).sendKeys(string);
			
			}
		
		@Then("I Enter Message as {string}")
		public void i_enter_the_message_as(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("/html/body")).sendKeys(string);
		}
		
		@Then("I click on the Send Message button")
		public void i_click_on_the_send_message_button() throws InterruptedException{
		    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.xpath("//*[@id='compose_message_compose']")).click();
			Thread.sleep(5000);
		}
		
		
		/*@Then("I should see the confirmation as {string}")
		public void i_should_see_the_confirmation_as(String string) throws InterruptedException {
		    // Write code here that turns the phrase above into concrete actions
			String expected = driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/div[1]/text()")).getText();			
			Assert.assertEquals(expected,string);
			
			
			  
		}*/
		
		
		




}
