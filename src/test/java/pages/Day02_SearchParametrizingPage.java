package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Day02_SearchParametrizingPage {

    public Day02_SearchParametrizingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='search_text']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@class='searched-text']")
    public WebElement sonuxBox;

    //a[@class='product-item__name']
    @FindBy(xpath = "//a[@class='product-item__name']")
    public List<WebElement> results;


    @FindBy(xpath = "//*[@id=\"ccp---nb\"]/div[1]/div[2]/button[2]")
    public WebElement rejectAll;


    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement ingilizcebuttonu;


}
