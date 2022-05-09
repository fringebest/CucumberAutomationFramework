package StepDefinition;


import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePagePF;
import pageFactory.LoginPagePF;

import java.util.concurrent.TimeUnit;

public class LoginDemoPF {

 //  WebDriver driver = null;
 //  LoginPagePF login;
 //  HomePagePF logout;

 //  @Given("browser is open")
 //  public void browser_is_open() {

 //      System.out.println("=== I am inside of the Login Steps PF class ===");
 //      String projectPath = System.getProperty("user.dir");
 //      System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
 //      driver = new ChromeDriver();
 //      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 //      driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
 //      driver.manage().window().maximize();

 //  }

 //  @And("user landed on login page")
 //  public void user_landed_on_login_page() {
 //      driver.navigate().to("https://example.testproject.io/web");

 //  }

 //  @When("^user enters valid (.*) and (.*)$")
 //  public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {

 //      login = new LoginPagePF(driver);
 //      login.enterUsername(username);
 //      login.enterPassword(password);

 //      //driver.findElement(By.id("name")).sendKeys(username);
 //      //driver.findElement(By.id("password")).sendKeys(password);
 //      Thread.sleep(2000);

 //  }

 //  @And("user clicks on login")
 //  public void user_clicks_on_login() throws InterruptedException {

 //      login.clickOnLogin();
 //      //driver.findElement(By.id("login")).click();
 //      Thread.sleep(2000);
 //  }

 //  @Then("user is navigated to the home page")
 //  public void user_is_navigated_to_the_home_page() {
 //      logout = new HomePagePF(driver);
 //      logout.checkLogoutIsDisplayed();
 //      driver.close();
 //      driver.quit();
 //  }
}
