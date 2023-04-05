import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://example.com/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        // Enter valid credentials and click login button
        username.sendKeys("myusername");
        password.sendKeys("mypassword");
        loginButton.click();

        // Verify login success by checking if a welcome message is displayed
        WebElement welcomeMessage = driver.findElement(By.cssSelector(".welcome-message"));
        if (welcomeMessage.isDisplayed()) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }

        driver.quit();
    }
}
