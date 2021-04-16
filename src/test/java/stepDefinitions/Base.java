package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.SearchResultsWikiPage;
import pageObjects.SearchWikiPage;

public class Base {

	protected WebDriver driver;
	protected SearchWikiPage searchPage;
	protected SearchResultsWikiPage searchResultsPage;

	static {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driverFiles/chromedriver.exe");
	}

	public Base(){
		//this.driver = new InternetExplorer();
	}
	
}
