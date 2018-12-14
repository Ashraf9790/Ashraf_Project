package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import learnwdmethodsfinal.ProjectMethods;

public class LoginPage extends ProjectMethods {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="username")
	WebElement eleUsername;
	@FindBy(how=How.ID, using="password")
	WebElement elePassword;
	@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	WebElement eleLogin;
	
	@Given("Enter the username as (.*)") 
	public LoginPage typeUsername(String username)
	{
		type(eleUsername, username);
		return this;
	}
	@And("Enter the password as (.*)")
	public LoginPage typePassword(String password)
	{
		type(elePassword, password);
		return this;
	}
	@When("click on login button")
	public Home_Page clickLogin()
	{
		click(eleLogin);
		return new Home_Page();
	}

}
