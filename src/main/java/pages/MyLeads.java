package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import learnwdmethodsfinal.ProjectMethods;

public class MyLeads extends ProjectMethods {
	
	public MyLeads()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	WebElement eleCreateLeads;
	
	
		public CreateLead_Page clickCreateLead()
	{
		click(eleCreateLeads);
		return new CreateLead_Page();
	}

}