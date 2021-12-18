package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.de.Aber;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.TestBase;
import pages.addcustomerPage;

public class addcustomerDefination extends TestBase {
	addcustomerPage AddCustomerPage;
    LoginPage loginPage;
	
	@Before
	public void beforeRun() {
		initDriver();

		 AddCustomerPage = PageFactory.initElements(driver, addcustomerPage.class);
		 loginPage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("^user is on the techfios login page$")
	public void user_is_on_the_techfios_login_page() throws Throwable {
		driver.get("https://techfios.com/billing/?ng=admin");
	}

	@When("^User enters the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_the_username_as_and_password_as(String username, String password) throws Throwable {
     loginPage.insertUserName(username);
     loginPage.insertPassword(password);
	Thread.sleep(2000);
	}

	@When("^User clicks on login$")
	public void user_clicks_on_login() throws Throwable {
    loginPage.clickOnSignInButton();
    Thread.sleep(2000);
   
	
    
    }
	
	
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
      
      String actualTitle =loginPage.getPageTitle();
      String expectedTitle = "Dashboard- iBilling";
       Assert.assertEquals("Page title are not matching",expectedTitle, actualTitle);
       Thread.sleep(2000);
	}

	@Then("^User clicks on bank and Cash$")
	public void user_clicks_on_bank_and_Cash() throws Throwable {
		 loginPage.clickOnBankandCash();
		Thread.sleep(2000);
	}

	@Then("^User clicks on new Account$")
	public void user_clicks_on_new_Account() throws Throwable {
		loginPage.clickOnAddNewAccount();
		Thread.sleep(2000);
	}

	@Then("^User fills up the information by entering \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_fills_up_the_information_by_entering_and_and_and_and_and(String accountTitle, String description,
			String initialBalance, String accountNumber, String contactPerson, String Phone, String internetBankingURL)
			throws Throwable {
   AddCustomerPage.insertaccountTitle(accountTitle);
   AddCustomerPage.insertaccountdiscription(description);
   AddCustomerPage.insertaccountBalance(initialBalance);
   AddCustomerPage.insertaccountNumber(accountNumber);
   AddCustomerPage.insertContactPerson(contactPerson);
   AddCustomerPage.insertPhoneNumber(Phone);
   AddCustomerPage.insertInternetBankingURL(internetBankingURL);
	}

	@Then("^User will click on the submit button$")
	public void user_will_click_on_the_submit_button() throws Throwable {
	   AddCustomerPage.clickSignInBotton();
		
	}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully() throws Throwable {
		 driver.getTitle();
		 System.out.println("Right Page");
		 Thread.sleep(4000);
		 takeScreenshot(driver);
		 
	}
   
}
