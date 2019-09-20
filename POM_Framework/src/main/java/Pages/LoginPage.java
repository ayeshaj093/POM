package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory-OR:
	//Page Factory-OR
		@FindBy(id="ctlTemplate_regMainBody_ctlLogin_sID")
		WebElement username;
		
		@FindBy(id="ctlTemplate_regMainBody_ctlLogin_sPassword")
		WebElement password;
		
		@FindBy(xpath="//input[@id='ctlTemplate_regMainBody_ctlLogin_cmdLogin']")
		WebElement loginBtn;
		
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException {
		username.sendKeys(un);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
		return new HomePage();
		
	}
	
}
