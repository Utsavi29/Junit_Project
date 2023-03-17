package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveAllListItems;

public class RemoveAllListItemTest {
	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToRemoveAllListItems() {
		
		RemoveAllListItems removeAllListItem = PageFactory.initElements(driver,RemoveAllListItems.class);
		removeAllListItem.toggleAllCheckbox();
		removeAllListItem.removeButtonFunction();
		removeAllListItem.ValidUserShouldBeAbleToRemoveAllButtons();

}
}