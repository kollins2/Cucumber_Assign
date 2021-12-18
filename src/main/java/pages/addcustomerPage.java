package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public  class addcustomerPage extends TestBase {
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
       TestBase.driver=driver;
       generateRandomNum(999);
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