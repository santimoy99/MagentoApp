

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	WebDriver driver;
	
	By logout=By.linkText("");

	public Logout(WebDriver driver) {
		
		this.driver = driver;
	}
	public void clickOnLogOut() {
		driver.findElement(logout).click();
	}
}
