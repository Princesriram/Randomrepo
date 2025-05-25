package seleniumWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Randompage {

	WebDriver driver;
	
	public Randompage(WebDriver driver) {
		this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//a[text() ='Top Deals']")
	WebElement Topdeals ;
/*	@FindBy(xpath = "")
	WebElement Flightbooking;*/
	
	public void Topdealslink() {
		
		Topdeals.click();
		


}

	
}
