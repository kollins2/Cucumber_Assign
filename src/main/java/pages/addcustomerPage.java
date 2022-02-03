package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public  class addcustomerPage extends TestBase {
	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//input[@name=\"username\"]") 
	WebElement USERNAME_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"password\"]")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement CLICK_ON_BANK_AND_CASH_ELEMENT;
    @FindBy(how = How.XPATH, using = "//a[@href=\"https://techfios.com/billing/?ng=accounts/add/\"]")
    WebElement CLICK_ON_ADD_NEW_ACCOUT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input [@id=\"account\"]")
	WebElement ACCOUNTTITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"description\"]")
	WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"balance\"]")
	WebElement BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"account_number\"]")
	WebElement AC_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id=\"contact_phone\"]")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement INTERNET_URL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement CLICK_BOTTON_ELEMENT;

	public addcustomerPage(WebDriver driver) {
		//super(driver);
       this.driver=driver;
       generateRandomNum(999);
	}
	
	public void insertUserName(String username) {
		USERNAME_ELEMENT.sendKeys(username);
	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void clickOnSignInButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}

	public String getPageTitle() {
		  return driver.getTitle();
		 }
	public void clickOnBankandCash() {
		CLICK_ON_BANK_AND_CASH_ELEMENT.click();
	}
	public void clickOnAddNewAccount() {
		CLICK_ON_ADD_NEW_ACCOUT_ELEMENT.click();
	}
	public void insertaccountTitle(String accountTitle) {
		ACCOUNTTITLE_ELEMENT.sendKeys(accountTitle + generateRandomNum(999));

	}

	public void insertaccountdiscription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description + generateRandomNum(999));
	}

	public void insertaccountBalance(String initialBalance) {
		BALANCE_ELEMENT.sendKeys(initialBalance);
	}

	public void insertaccountNumber(String accountNumber) {
		AC_NUMBER_ELEMENT.sendKeys(generateRandomNum(999)+ accountNumber);
	}

	public void insertContactPerson(String contactPerson) {

		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson + generateRandomNum(999));
	}

	public void insertPhoneNumber(String phone) {
		PHONE_ELEMENT.sendKeys(generateRandomNum(9999) + phone);
	}

	public void insertInternetBankingURL(String internetBankingURL) {
		INTERNET_URL_ELEMENT.sendKeys(internetBankingURL);
	}

	public void clickSignInBotton() {
		CLICK_BOTTON_ELEMENT.click();
	}
}