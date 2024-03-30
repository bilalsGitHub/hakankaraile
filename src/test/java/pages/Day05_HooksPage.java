package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day05_HooksPage {

    public Day05_HooksPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement kabuletbuttonu;

    //input[@data-testid='search-bar-input']

    @FindBy(xpath = "//input[@data-testid='search-bar-input']")
    public WebElement searchBox;

    //h1[normalize-space()='gömlek']
    @FindBy(xpath = "//h1[normalize-space()='gömlek']")
    public WebElement sonucmetini;


    @FindBy(xpath = "//div[@class='title']//p[1]")
    public WebElement sonucsayisi;

}
