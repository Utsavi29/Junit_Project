package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllListItems {
 WebDriver driver;
 
 public RemoveAllListItems(WebDriver driver) {
	 this.driver = driver;
 }
 @FindBy(how = How.XPATH,using="/html/body/div[3]/input[3]")WebElement Toggle_All_CheckBox;
 @FindBy(how = How.XPATH,using="/html/body/div[3]/input[1]")WebElement Remove_CheckBox;
 
 
 public void toggleAllCheckbox() {
	 Toggle_All_CheckBox.click();
 }
 public void removeButtonFunction() {
	 Remove_CheckBox.click();
}
 public void ValidUserShouldBeAbleToRemoveAllButtons() {
	 boolean status = Toggle_All_CheckBox.isEnabled();
	 
	 System.out.println("checking boolean status:"+ status);
	 if(status) {
			System.out.println("All list item has been removed");
		}else {
			System.out.println("All list item can notbe removed");
		}
 }
}
