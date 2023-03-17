package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAllCheckBoxPage {
	
	WebDriver driver;
	
	public ToggleAllCheckBoxPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH,using="/html/body/div[3]/input[3]")WebElement Toggle_All_CheckBox;
	
	public void validateToggleAll() {
		Toggle_All_CheckBox.click();
		
	}
	
	public void validateToggleCheckbox() {
		 boolean status =Toggle_All_CheckBox.isSelected();
		 
		 System.out.println("Checking boolean status;"+ status);
		  if(status) {
			  System.out.println("allToggleCheckbox checked sucessfully");
			  
		  }else {
			  
			  System.out.println("allToggleCheckbox not checked sucessfully");    
		  
		  }
		 
	}
}
