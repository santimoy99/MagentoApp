

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");
	public Login(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void typeEmail(String Data) {
		driver.findElement(email).sendKeys(Data);
	}
	public void typePass(String pass) {
		driver.findElement(pwd).sendKeys(pass);
	}
	public void clickOnloigin() {
		driver.findElement(login).click();
		}
}
