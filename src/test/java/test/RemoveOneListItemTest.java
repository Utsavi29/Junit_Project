package test;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveOneListItem;
import util.BrowserFactory;

public class RemoveOneListItemTest {
	
	WebDriver driver;
	
	@Test
	public void removeOneListItemButton() {
		
		driver = BrowserFactory.init();
		RemoveOneListItem removeOneListItem = PageFactory.initElements(driver, RemoveOneListItem.class);
		removeOneListItem.removeSingleList();
		removeOneListItem.removeButtonFunction();
		removeOneListItem.validateSingleItemRemoved();
		
	}

}
