package learnLead;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.DataInputProvider;


public class Xerox {

	//@Test(dataProvider = "fetchData")
	public void webposting() throws InterruptedException {
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
		Set<String> allwindows = driver.getWindowHandles();
		List<String> lst=new ArrayList();
		lst.addAll(allwindows);
		driver.switchTo().window(lst.get(1));


		WebElement os = driver.findElementByXPath("//select[@name='operatingSystem']");
		Select selectOS=new Select(os);
		selectOS.selectByVisibleText("Windows 10");
		/*
		List<WebElement> allosname = os.findElements(By.tagName("option"));
		System.out.println(allosname.size());

		for (int j = 0; j < allosname.size(); j++) {
			String text = allosname.get(j).getText();
			System.out.println(text);
		}
		 */
		WebElement lang = driver.findElementByXPath("//select[@name='fileLanguage']");
		Select selLang=new Select(lang);
		selLang.selectByVisibleText("Arabic");
		driver.findElementByLinkText("V3 Xerox Global Print Driver PCL5").click();
		String filename = driver.findElementByXPath("//ul[@class='fileInfo']//li[1]").getText();
		System.out.println(filename);
		String version = driver.findElementByXPath("//ul[@class='fileInfo']//li[2]").getText();
		System.out.println(version);
		String date = driver.findElementByXPath("//ul[@class='fileInfo']//li[3]").getText();
		System.out.println(date);
		String size = driver.findElementByXPath("//ul[@class='fileInfo']//li[4]").getText();
		System.out.println(size);
		driver.close();
		driver.switchTo().window(lst.get(0));
		driver.findElementByLinkText("Drivers & Downloads").click();
		driver.switchTo().window(lst.get(1));
		selectOS.selectByVisibleText("Windows 7");
		selLang.selectByVisibleText("Dutch");
		
		/*List<WebElement> allLang = lang.findElements(By.tagName("option"));
		System.out.println(allLang.size());
		for (int i = 0; i < allLang.size(); i++) {
			String langlist = allLang.get(i).getText();
			System.out.println(langlist);
		}
		 */		}
	/*@DataProvider(name="fetchData")
	public String[][] data(String dataSheetName) {
		DataInputProvider dp = new DataInputProvider();
		String[][] data = DataInputProvider.getSheet(dataSheetName);
		return data;	
	}*/
}

