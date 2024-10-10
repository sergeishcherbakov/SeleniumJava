import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginPage {
    // WebDriver instance to control the browser
    WebDriver driver;

    // Constructor to initialize the WebDriver for this page
    public LoginPage(WebDriver driver) { // Corrected parameter type
        this.driver = driver;
    }

    // Locating the username input field
    By emailField = By.name("email");

    // Locating the password input field
    By passwordField = By.name("password"); // Corrected the name to "password" (case-sensitive)

    // Locating the login button
    By loginButton = By.className("btn");

    // Method to enter email
    public void enterEmail(String email) { // Changed "string" to "String"
        WebElement emailElement = driver.findElement(emailField); // Corrected variable name
        emailElement.sendKeys(email); // Use the parameter email
    }

    // Method to enter password
    public void enterPassword(String password) { // Changed "string" to "String"
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password); // Use the parameter password
    }

    // Method to click the login button
    public void clickLoginButton() {
        WebElement loginBtnElement = driver.findElement(loginButton);
        loginBtnElement.click();
    }
}
