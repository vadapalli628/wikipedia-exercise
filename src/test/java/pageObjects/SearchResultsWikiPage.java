package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsWikiPage {

	public WebDriver ldriver;
	public SearchResultsWikiPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//h1[@id='firstHeading']")
	WebElement FistHeading_Label;
	
	@FindBy(xpath="//span[normalize-space()='Languages']")
	WebElement OtherLanguages_Label;
	
	@FindBy(xpath = "//a[@class='interlanguage-link-target'][contains(text(),'Ελληνικά')]")
	WebElement OtherLanguage_Greek_Link;
	
	@FindBy(xpath = "//a[@class='interlanguage-link-target'][contains(text(),'English')]")
	WebElement Language_English_Link;
	
	public void verifyFistHeading_Label (String expectedString) {
	
	if (FistHeading_Label.getText().toLowerCase().contains(expectedString.toLowerCase())){
		System.out.println("The Fist Heading is matched with searched string");
		}
	else {
		System.out.println("The Fist Heading is NOT Matched with searched string");
	}
	}
	
	public void verifyOtherLanguages_Label () {
		
		List<WebElement> allLinks = ldriver.findElements(By.className("interlanguage-link-target"));
	     for(WebElement languageLink: allLinks) {
	        if (languageLink.getAttribute("href").contains(".wikipedia.org")) {
	        	System.out.println("The Search Results page is available in other languages");
	        }else {
	        	System.out.println("The Search Results page is DOES not have other languages link");
	     }
	        }
	}
	
	public void clickOtherLanguage_Link() {
		OtherLanguage_Greek_Link.click();
	}	
	
	public void verifyOtherLanguageResultsContainsEnglish_Link() {
		
		if(Language_English_Link.isDisplayed()) {
		  System.out.println("Yes English link is there in the search results");
		}
		else {
		  System.out.println("No English link is there");
		}
		}

	}	
	

