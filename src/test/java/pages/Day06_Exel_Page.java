package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day06_Exel_Page {

    public Day06_Exel_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//button[@id='submit']")
    public WebElement submit;

    @FindBy(xpath = "//h1[normalize-space()='Contact List']")
    public WebElement contactList;

    @FindBy(xpath = "//button[@id='logout']")
    public WebElement logout;

    //span[@id='error']

    @FindBy(xpath = "//span[@id='error']")
    public WebElement error;
}
