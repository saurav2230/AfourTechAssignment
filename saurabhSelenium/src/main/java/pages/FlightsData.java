package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightsData
{

    final WebDriver driver;

    public FlightsData(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[@id=\"cnt-data-content\"]/div/div[2]/div/aside[1]/div[1]/table/tbody/tr/td[3]")
    private List<WebElement> cities;


    @FindBy(xpath = "//*[@id=\"cnt-data-content\"]/div/div[2]/div/aside[1]/div[1]/table/tbody/tr/td[7]")
    private List<WebElement> status;


    public void getFlightData()
    {
        String validCities[] = {"Bengaluru", "Delhi", "Goa" , "Chandigarh", "Hyderabad", "Nagpur", "Dubai"};
        int validCitiesSize = validCities.length;
        String cityName;
        String Output = "";
        for (int j = 0;j<validCitiesSize-1;j++)
        {


            for (int i = 1; i < cities.size(); i++)
            {
                cityName = cities.get(i).getText();


                if (cityName.contains(validCities[j]))
                {
                    Output = Output + validCities[j]  + "  " + status.get(i).getText() +"\n";

                }

            }
        }
        System.out.println(Output);

   }

}
