package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {
	LoginPage loginPage;
  @Before
	public void beforeRun() {
	  initDriver();
	  loginPage = PageFactory.initElements(driver, LoginPage.class);	
	}
	
	
	@Given("^User is on the TechFios Login page$")
	public void user_is_on_the_TechFios_Login_page() throws Throwable {
		 driver.get("https://techfios.com/billing/?ng=admin");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
	//	loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(username);
		Thread.sleep(3000);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginPage.insertPassword(password);
		Thread.sleep(3000);
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
       loginPage.clickOnSignInButton();
       Thread.sleep(3000);
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
  //  loginPage.getPageTitle();
	String actualTitle =loginPage.getPageTitle();
    String expectedTitle = "Dashboard- iBilling";
     Assert.assertEquals("Page title are not matching",expectedTitle, actualTitle);
   // takeScreenshot(driver);
     
     
     Thread.sleep(3000);
	}
  @After
	public void tearDown() {  
	  driver.close();
	  driver.quit();
  }
}
