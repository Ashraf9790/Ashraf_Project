package learnLead;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xerox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.support.xerox.com/engb.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id=\"xerox-node-233986\"]/div/div/div[1]/div[1]/input").sendKeys("GPD");
		//Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"xerox-node-233986\"]/div/div/div[1]/div[1]/ul/li/a").click();
		driver.findElementByLinkText("Drivers & Downloads").click();
		//Thread.sleep(2000);
		WebElement os = driver.findElementByXPath("//select[@id='operatingSystem']");
		Select selectos = new Select(os);
		selectos.selectByVisibleText("Windows 10");

		/*WebElement oslist = driver.findElementByXPath("//option[text()='Windows 8 x64']");
		Select sec=new Select(oslist);
		sec.selectByVisibleText("Windows 8 x64]");
		*/WebElement lang = driver.findElementById("fileLanguage");
		Select eachlang=new Select(lang);
		eachlang.selectByVisibleText("Brazilian Portuguese");
		//driver.findElementByLinkText("V3 Xerox Global Print Driver PCL5").click();
		//driver.findElementByLinkText("Global Printer Driver").click();
		//driver.findElementByLinkText("Printers").click();
		//driver.findElementsByXPath();	
			}

}
