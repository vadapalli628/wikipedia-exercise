package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchResultsWikiPage;
import pageObjects.SearchWikiPage;

public class Steps extends Base {
	
 	//public WebDriver driver;

	@Given("User launch a browser")
	public void user_launch_a_browser() {
   		searchPage = new SearchWikiPage(driver);
   		searchResultsPage = new SearchResultsWikiPage(driver);
   	}

	public Steps() {
		this.driver = new ChromeDriver();
	}

	@Given("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
 		driver.manage().window().maximize();
	 }

	@Given("user search term as {string}")
	public void user_search_term_as(String IBM) {
		searchPage.enterSearchInput(IBM);
	}

	@Given("selects search language as English")
	public void selects_search_language_as() {
		searchPage.verifyDefaultLanguage_English();
	}

	@When("clicks on Search Icon")
	public void clicks_on_search_icon() throws InterruptedException {
		searchPage.clickSearchIcon();
		Thread.sleep(4000);
	}

	@Then("Search results heading matches search term {string}")
	public void search_results_heading_matches_search_term(String IBM) throws InterruptedException {
		searchResultsPage.verifyFistHeading_Label(IBM);
		 Thread.sleep(2000);
	}
	
	@Then("Search results Page displays other languague links")
	public void search_results_page_available_in_other_languages() throws InterruptedException {
		searchResultsPage.verifyOtherLanguages_Label();
		Thread.sleep(4000);
	}
	
	@Then("close browser")
	public void close_browser() {
	    driver.close();
	    driver.quit();
	
	}

	@When("clicks on IBM Greek language link at Languages")
	public void clicks_on_ibm_greek_language_link_at_languages() throws InterruptedException {
		searchResultsPage.clickOtherLanguage_Link();
		Thread.sleep(2000);
	}

	@Then("Search results Page has a link to the version in English")
	public void search_results_page_has_a_link_to_the_version_in_english() throws InterruptedException {
		searchResultsPage.verifyOtherLanguageResultsContainsEnglish_Link();
		  Thread.sleep(2000);
	}	
}


