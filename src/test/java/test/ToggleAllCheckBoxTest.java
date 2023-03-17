package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.ToggleAllCheckBoxPage;
import util.BrowserFactory;

public class ToggleAllCheckBoxTest {
	WebDriver driver;
	
	
	@Test
	public void toggleAllCheckboxFunctionality() {
		
		driver =BrowserFactory.init();
		
		ToggleAllCheckBoxPage toggleAllCheckBoxPage = PageFactory.initElements(driver,ToggleAllCheckBoxPage.class);
		toggleAllCheckBoxPage.validateToggleAll();
		toggleAllCheckBoxPage.validateToggleCheckbox();
		
	}

}
