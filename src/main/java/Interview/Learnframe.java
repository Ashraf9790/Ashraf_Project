package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Learnframe {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		for (WebElement webElement : findElements) {
			driver.switchTo().frame(webElement);
			driver.findElementByLinkText("redBus Best price 38 sec feat. MS Dhoni (Hindi)").click();
		}
		Set<String> allwindows = driver.getWindowHandles();
		List<String> eachwin=new ArrayList<>();
		eachwin.addAll(allwindows);
		System.out.println(driver.switchTo().window(eachwin.get(1)).getTitle());
		driver.close();		
		System.out.println(driver.switchTo().window(eachwin.get(0)).getTitle());
		
		
	}

}
