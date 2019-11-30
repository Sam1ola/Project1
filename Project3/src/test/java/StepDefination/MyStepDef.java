package StepDefination;


import PageObject.HomePage;
import cucumber.api.PendingException;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.ValueInstantiators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Cucumber.Base;

import java.io.IOException;


@RunWith(Cucumber.class)

public class MyStepDef extends Base {

   // public WebDriver driver;
    HomePage h;
   // CheckOutPage cp;

    @Given("^I log in to the Website$")
    public void iLogInToTheWebsite() throws IOException {

        System.out.println("log in ");

    }

    @When("^I clicked on the buy again$")
    public void i_clicked_on_the_buy_again() throws Throwable {
       // throw new PendingException();

        System.out.println("clicked on buy again  ");

    }


    @Then("^The page is displayed$")
    public void thePageIsDisplayed()
    {
        System.out.println("Displayed");
    }

   @Given("I click on page")
    public void iClickOnPage() {
        System.out.println("pages clicked");
    }

    @When("^I clicked on the search button$")
    public void i_clicked_on_the_search_button() throws Throwable {
        //throw new PendingException();
        System.out.println("search button ");
    }


    @Then("The page is shown")
    public void thePageIsShown() {
        System.out.println(" The page is shown  ");
    }

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
       // throw new PendingException();
       // driver= Base.getDriver();
    }

    @When("^User searched for (.+) Vegetable$")
    public void user_searched_for_vegetable(String name) throws Throwable {
       // throw new PendingException();
        h=new HomePage(driver);
        h.getSearch().sendKeys(name);
        Thread.sleep(3000);
    }

    @Then("^verify selected (.+) items are displayed in Check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
        //throw new PendingException();
        Assert.assertTrue( h.getProductName().getText().contains(name));
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
        //throw new PendingException();
        h.addToCart().click();
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
      //  throw new PendingException();
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }







    @Given("^i search (.+) in eb$")
    public void i_search_in_eb(String Name) throws Throwable {
       // throw new PendingException();
        h=new HomePage(driver);
        h.getSearch2().sendKeys(Name);
    }

}
