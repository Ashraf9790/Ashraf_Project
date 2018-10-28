package learnLead;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		Thread.sleep(3000);
		WebElement checkdate = driver.findElementById("chkSelectDateOnly");
		if(checkdate.isSelected())
		{
			checkdate.click();
		}
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for (int i = 0; i < rows.size(); i++) {
		
		WebElement eachrow = rows.get(i);
		List<WebElement> columndata = eachrow.findElements(By.tagName("td"));
		String text = columndata.get(1).getText();
		System.out.println(text);
		
		}
				
	}

}
