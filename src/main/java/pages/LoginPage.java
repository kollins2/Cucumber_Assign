package pages;



	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;

	public class LoginPage {

		WebDriver driver;

		

		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}

		// Element Library
	//	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	//	WebElement USERNAME_ELEMENT;
		@FindBy(how = How.XPATH, using = "//*[@name=\"username\"]")
		WebElement USERNAME_ELEMENT;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
		WebElement PASSWORD_ELEMENT;
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
		WebElement SIGNIN_BUTTON_ELEMENT;
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
		WebElement CLICK_ON_BANK_AND_CASH_ELEMENT;
        @FindBy(how = How.XPATH, using = "//a[@href=\"https://techfios.com/billing/?ng=accounts/add/\"]")
        WebElement CLICK_ON_ADD_NEW_ACCOUT_ELEMENT;
       
		
		public void insertUserName(String Username ) {
			USERNAME_ELEMENT.sendKeys(Username);
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

	}


