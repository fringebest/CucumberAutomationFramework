package StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HooksSteps {

    WebDriver driver = null;

    @Before(value = "@smoke", order = 1)
    public void browserSetup() {
        System.out.println("I am inside of HooksSteps file");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before(order = 0)
    public void setup2(){
        System.out.println("I am inside of setup2 \n");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @BeforeStep
    public void beforeSteps() {
        System.out.println("I am inside beforeSteps");
    }

    @AfterStep
    public void afterSteps() {
        System.out.println("I am inside afterSteps");
    }


    @Given("user is on login page")
    public void user_is_on_login_page() {

    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {

    }

    @And("click on login button")
    public void click_on_login_button() {

    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_menu_page() {

    }

}
