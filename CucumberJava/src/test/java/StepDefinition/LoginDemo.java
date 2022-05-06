package StepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class LoginDemo {

 // WebDriver driver = null;
 // @Given("browser is open")
 // public void browser_is_open() {
 //     String projectPath = System.getProperty("user.dir");
 //     System.setProperty("webdriver.chrome.driver",projectPath +"/src/test/resources/drivers/chromedriver.exe");
 //     driver = new ChromeDriver();
 //     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 //     driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
 //     driver.manage().window().maximize();

 // }

 // @And("user landed on login page")
 // public void user_landed_on_login_page() {
 //     driver.navigate().to("https://example.testproject.io/web");

 // }

 // @When("^user enters valid (.*) and (.*)$")
 // public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
 //     driver.findElement(By.id("name")).sendKeys(username);
 //     driver.findElement(By.id("password")).sendKeys(password);
 //     Thread.sleep(2000);

 // }

 // @And("user clicks on login")
 // public void user_clicks_on_login() throws InterruptedException {
 //     driver.findElement(By.id("login")).click();
 //     Thread.sleep(2000);
 // }

 // @Then("user is navigated to the home page")
 // public void user_is_navigated_to_the_home_page() {
 //     driver.findElement(By.id("logout")).isDisplayed();
 //     driver.close();
 //     driver.quit();
 // }
}
