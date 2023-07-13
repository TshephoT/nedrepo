package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utils.BaseTestSetup;

public class Login extends BaseTestSetup {
    @Given("User navigates to homepage")
    public void user_navigates_to_homepage() throws InterruptedException {
        launchBrowser();
    }
    @When("User logs in using username {string} and password {string}")
    public void user_logs_in_using_username_and_password(String username, String password) throws InterruptedException {
        driver.findElement(By.id("login2")).click();

        Thread.sleep(5000);
        driver.findElement(By.id("loginusername")).sendKeys(username);
        driver.findElement(By.id("loginpassword")).sendKeys(password);

    }
    @Then("User clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
        Thread.sleep(5000);
    }


}
