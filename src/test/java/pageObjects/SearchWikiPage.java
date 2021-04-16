package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchWikiPage {

	public WebDriver ldriver;
	public SearchWikiPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(id = "searchInput")
	WebElement SearchInput_TextField;
	
	@FindBy(xpath = "//select[@id='searchLanguage']")
	WebElement SearchLanguage_EN_Dropdown;
	
	
	@FindBy(xpath ="//i[@class='sprite svg-search-icon']")
	WebElement Search_ZoomIcon;
	
	
	public void enterSearchInput (String searchText) {
		SearchInput_TextField.clear();
		SearchInput_TextField.sendKeys(searchText);
	}
	
	
	public void clickSearchIcon () {
		Search_ZoomIcon.click();
	}
	
	public void verifyDefaultLanguage_English () {
		
		Select select = new Select(SearchLanguage_EN_Dropdown);

		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();		
		if(defaultItem.equals("English")) {
			System.out.println("The default language English is selected");
		}else 
			System.out.println("The default language is not English");
		}
}
	

