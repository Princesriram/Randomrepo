package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class justpagelanding {
	

	WebDriver driver;
	
	public justpagelanding(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//a[text() ='Top Deals']")
	WebElement Topdeals ;
	@FindBy(xpath = "password")
	WebElement Flightbooking;
	
	public void Topdealslink() {
		
		Topdeals.click();

}



}
