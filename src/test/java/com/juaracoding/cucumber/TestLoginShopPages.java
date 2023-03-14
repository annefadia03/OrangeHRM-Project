package com.juaracoding.cucumber;

import com.juaracoding.cucumber.pages.LoginShopPages;
import com.juaracoding.cucumber.utils.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLoginShopPages {
    public static WebDriver driver;
    public static LoginShopPages loginShopPages = new LoginShopPages();
    public TestLoginShopPages(){
        driver = Hookss.driver;
    }

    @Given("User open browser and url")
    public void user_open_browser_and_url() {
        driver.get(Constants.URL);
        System.out.println("User open browser and url");
    }

    @And("User go to My Account")
    public void user_go_to_my_account() {
        loginShopPages.tologinpage();
        System.out.println("User go to My Account");
    }

    @And("User enter valid username")
    public void user_enter_valid_username() {
        loginShopPages.inputUsername("annefadia143@gmail.com");
        System.out.println("User enter valid username");
    }

    @When("User enter valid password")
    public void user_enter_valid_password() {
        loginShopPages.inputPassword("1403Pane");
        System.out.println("User enter valid password");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password() {
        loginShopPages.inputPassword("123pane");
        System.out.println("User enter invalid password");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginShopPages.buttonLogin();
        System.out.println("User click button login");
    }

    @Then("User get message ERROR")
    public void user_get_message_error() {
        Hooks.delay(1);
        Assert.assertEquals(loginShopPages.getTxtError(),"Lost your password");
        System.out.println("User get message ERROR");
    }

    @Then("User go to page Dashboard")
    public void user_go_to_page_dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginShopPages.getMenuDashboard(),"Dashboard");
        System.out.println("User go to page Dashboard");
    }
}
