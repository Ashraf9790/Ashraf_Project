package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import learnwdmethodsfinal.ProjectMethods;

public class CreateLead_Page extends ProjectMethods {

	public CreateLead_Page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	WebElement eleCname;
	@FindBy(how=How.ID,using="createLeadForm_firstNameLocal")
	WebElement eleFname;
	@FindBy(how=How.ID,using="createLeadForm_lastNameLocal")
	WebElement eleLname;
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	WebElement eleEmail;
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	WebElement elePhNo;
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	WebElement eleCreateLead;

	public CreateLead_Page entercname(String cname)
	{
		type(eleCname, cname);
		return this;
	}

	public CreateLead_Page enterfname(String fname)
	{
		type(eleFname, fname);
		return this;
	}

	public CreateLead_Page enterlname(String lname)
	{
		type(eleLname, lname);
		return this;
	}

	public CreateLead_Page enterEmail(String Email)
	{
		type(eleEmail, Email);
		return this;
	}

	public CreateLead_Page enterPhNo(String Phone)
	{
		type(elePhNo, Phone);
		return this;
	}

	public CreateLead_Page clickCreateLead()
	{
		click(eleCreateLead);
		return this;
	}


}


