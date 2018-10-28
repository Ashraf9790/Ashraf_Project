package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import learnwdmethodsfinal.ProjectMethods;

public class Home_Page extends ProjectMethods {
	
	public Home_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	WebElement eleCRMSFA;
	
	/*@FindBy(how=How.CLASS_NAME, using="decorativeSubmit")
	WebElement eleLogout;
	*/
	public MyHome_Page clickCrmsfa()
	{
		click(eleCRMSFA);
		return new MyHome_Page();
	}

}
