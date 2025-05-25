package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcaseforrandompages {
	
	WebDriver driver = new ChromeDriver();
	
	@Test(priority = 1)	
	public void Pagesettings() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
	@Test
	public void firstpage() {
		justpagelanding land = new justpagelanding(driver);
		land.Topdealslink();
		
	}
	}


