package learnwdmethodsfinal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reports;

public class SeMethods extends Reports implements WdMethodsFinal {
	public int i = 1;
	public static RemoteWebDriver driver;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {			
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {			
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" Launched Successfully");
		} catch (WebDriverException e) {
			System.out.println("The Browser "+browser+" not Launched ");
		} finally {
			takeSnap();			
		}
	}


	public WebElement locateElement(String locator, String locValue) {
		try {
			switch(locator) {
			case "id": return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "linkText": return driver.findElementByLinkText(locValue);
			case "name": return driver.findElementByName(locValue);
			}
		} catch (NoSuchElementException e) {
			System.out.println("The Element Is Not Located ");
		}
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		try {
			return driver.findElementById(locValue);
		} catch (Exception e) {
			System.out.println("The Element is not located");
		}
		return null;
	}

	@Override
	public void type(WebElement ele, String data) {
		ele.sendKeys(data);
		System.out.println("The Data "+data+" is Entered Successfully");
		takeSnap();
	}

	@Override
	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" Clicked Successfully");
		takeSnap();
	}

	@Override
	public String getText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
		System.out.println("The DropDown Is Selected with "+value);
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		String title = driver.getTitle();
		if (title.equals(expectedTitle)) {
			System.out.println("title matches");
			return true;
		} else {
            System.out.println("title not matches");
		}
		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		if (text.contains(expectedText)) {
			System.out.println("text matches");
		} else {
             System.out.println("text not matches");
		}

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void switchToWindow(int index) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listOfWindow = new ArrayList<String>();
		listOfWindow.addAll(allWindows);
		driver.switchTo().window(listOfWindow.get(index));
		System.out.println("The Window is Switched ");
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		driver.switchTo().alert().accept();
		takeSnap();
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void takeSnap() {
		try {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dsc = new File("./snaps/img"+i+".png");
			FileUtils.copyFile(src, dsc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	@Override
	public void closeBrowser(String browser) {
		closeBrowser(browser);
	

	}

	@Override
	public void closeAllBrowsers(String allbrowser) {
	closeAllBrowsers(allbrowser);

	}


	@Override
	public void closeBrowser() {
		driver.close();
		
	}


	@Override
	public void closeAllBrowsers() {
		driver.quit();
		
	}

}
