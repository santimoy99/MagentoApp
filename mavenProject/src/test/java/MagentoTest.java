

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

;

public class MagentoTest{

	@Test
	public void creadential() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String url="https://www.magento.com";
		driver.get(url);

		Home h=new Home(driver);
		h.clickOnMyAccount();
		
		Login l1=new Login(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		l1.typePass("Welcome123");
		l1.clickOnloigin();
		
		Logout l2= new Logout(driver);
		l2.clickOnLogOut();
		
		driver.quit();
	}

}
