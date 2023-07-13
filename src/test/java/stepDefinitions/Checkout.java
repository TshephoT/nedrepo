package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utils.BaseTestSetup;

public class Checkout extends BaseTestSetup {

    @Given("User is on product page")
    public void user_is_on_product_page() throws InterruptedException {
    }
    @When("User selects product ")
    public void user_selects_product() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a")).click();
        Thread.sleep(5000);
    }
    @Then("Proceeds to cart and checkout")
    public void proceeds_to_cart_and_checkout() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='tbodyid']/div[2]/div/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("cartur")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='page-wrapper']/div/div[2]/button")).click();

//        Checkout
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Tshepho");
        driver.findElement(By.xpath("//*[@id='country']")).sendKeys("South Africa");
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Pretoria");
        driver.findElement(By.xpath("//*[@id='card']")).sendKeys("Visa");
        driver.findElement(By.xpath("//*[@id='month']")).sendKeys("March");
        driver.findElement(By.xpath("//*[@id='year']")).sendKeys("2023");

        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[10]/p")).getAttribute("Id");
    }
}
