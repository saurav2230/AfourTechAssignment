package stepDefinitions;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.*;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;

public class stepDefs {
        WebDriver driver;
        GoogleSearchSeleniumHq googleSearchSeleniumHq;
        FlightsData flightsData;

    @Given("^User is on google home page$")
    public void user_is_on_gogle_home_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/libs/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension",false);
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        googleSearchSeleniumHq = new GoogleSearchSeleniumHq(driver);

    }

    @When("^User searches for text on google$")
    public void user_searches_for_text_on_google() throws InterruptedException
    {
        googleSearchSeleniumHq.searchText("selenium hq");
        driver.quit();
    }

    @Given("^User is on flights home page$")
    public void user_is_on_flights_home_page() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/libs/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension",false);
        driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flightradar24.com/data/airports/pnq");
        flightsData = new FlightsData(driver);
    }

    @When("^User finds the flights data$")
    public void User_finds_the_flights_data() throws InterruptedException
    {
        flightsData.getFlightData();
        driver.quit();
    }



}
