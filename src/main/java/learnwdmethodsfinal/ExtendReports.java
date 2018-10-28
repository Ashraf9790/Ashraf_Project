package learnwdmethodsfinal;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReports {

@Test
	public void extend() throws IOException
	{
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(false);
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest logger = extent.createTest("TC001_CreateLead","Create a new lead");
		logger.assignAuthor("Ashraf");
		logger.assignCategory("Smoke");
		logger.log(Status.PASS, "Demo sale manager entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img1.png").build());
		logger.log(Status.PASS, "CRMSFA successfully entered", MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img2.png").build());
		logger.log(Status.PASS,"Login button clicked successfully", MediaEntityBuilder.createScreenCaptureFromPath("./snaps/img3.png").build());
		
	extent.flush();
	}

}
