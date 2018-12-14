package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import learnwdmethodsfinal.ProjectMethods;

public class MyHome_Page extends ProjectMethods {
	
	public MyHome_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement eleLeads;
	
	@When("click on leads")
		public MyLeads clickLeads()
	{
		click(eleLeads);
		return new MyLeads();
	}

}
