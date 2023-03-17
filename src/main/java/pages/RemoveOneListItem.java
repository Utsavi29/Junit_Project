package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveOneListItem {
	WebDriver driver;
	
	public RemoveOneListItem(WebDriver driver) {
		this.driver=driver;
	}
	
@FindBy(how =How.XPATH,using= "/html/body/div[3]/a[222]/span") WebElement Single_List;
@FindBy(how =How.XPATH,using= "/html/body/div[3]/input[1]") WebElement Remove_Button;


public void removeSingleList() {
	 Single_List.click();
}
public void removeButtonFunction() {
	Remove_Button.click();
}
//validation


public void validateSingleItemRemoved() {
	
	boolean status =Single_List.isEnabled();
	System.out.println("checking boolean status:"+status);
	if(status) {
		System.out.println(status+"removed");
	}else {
		System.out.println(status+"Not removed");
	}
}
}