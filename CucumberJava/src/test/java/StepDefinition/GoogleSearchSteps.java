package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

  /*  @Given("browser is open")
    public void browser_is_open() {

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath +"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
*/
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.navigate().to("https://google.com");
        driver.findElement(By.id("L2AGLb")).click();


    }

    @When("user enters a text in search")
    public void user_enters_a_text_in_search() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

        Thread.sleep(2000);

    }

    @And("hits enter")
    public void hits_enter() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
            driver.getPageSource().contains("Online courses");
            driver.close();
            driver.quit();
    }
}
