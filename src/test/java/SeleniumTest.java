//Java Class that will hold Selenium test

//This line imports WebDriver interface from the Selenium library, which is central interface to control Browser
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;	
import org.junit.Assert;
import org.junit.Test;



public class SeleniumTest {
	
	@Test
	public void testLogin() {
		//Set the path to the ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver-win32/chromedriver.exe");
		
		// Create a new indtance of the CHrome Driver
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			//Navigate to a web page
			driver.get("https://automationexercise.com/login");
			
			//Create a new instance of the Chrome Driver
			LoginPage loginPage = new LoginPage(driver);
			
			// Interact with the login page
            loginPage.enterEmail("serej4ka@gmail.com"); // Replace with a valid email
            loginPage.enterPassword("123456789"); // Replace with a valid password
            loginPage.clickLoginButton();
            
            //String expectedUrl = "";
            //String actualUrl = driver.getCurrentUrl();
            //Assert.assetEqual(expectedUrl, actualUrl);
            //Assert.assertTrue(driver.findElement(By.id("element_id")).isDisplayed());
            boolean isLogoutDisplayed = driver.findElement(By.linkText("Logout")).isDisplayed();
            Assert.assertTrue("Logout link should be displayed after successful login", isLogoutDisplayed);

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {		
	
		
		//Close the browser
		driver.quit();
		
	    }
	}

}
