package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

public class GoogleSearchSeleniumHq
{

    final WebDriver driver;

    public GoogleSearchSeleniumHq(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(name = "q")
    private WebElement searchInputBox;

    @FindBy(xpath="//div/a[starts-with(@href,'https://en.wikipedia.org/wiki/Selenium_(software)')]/parent::div/following-sibling::div[2]/div[1]")
    public WebElement finalLink;


    public void searchText(String text) {
        searchInputBox.sendKeys(text);
        searchInputBox.sendKeys(Keys.ENTER);
        String textValue = finalLink.getText();
        System.out.println("the text printed is : " + driver.findElement(By.xpath("//div/a[starts-with(@href,'https://en.wikipedia.org/wiki/Selenium_(software)')]/parent::div/following-sibling::div[1]/div[1]")).getAttribute("innerText"));
    }


}
