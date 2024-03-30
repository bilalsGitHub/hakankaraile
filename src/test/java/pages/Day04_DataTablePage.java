package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day04_DataTablePage {

    public Day04_DataTablePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[@alt='Çiçek & Hediye']")
    public WebElement ilkresim;


    @FindBy(xpath = "//*[@id=\"root\"]/header/div[3]/div/nav/div[4]/a/span/span")
    public WebElement dogumgunubuttonu;

    //a[normalize-space()='Renk']
    @FindBy(xpath = "//a[normalize-space()='Renk']")
    public WebElement renkdropdown;

    @FindBy(xpath = "//label[normalize-space()='Bej']")
    public WebElement bej;
    @FindBy(xpath = "//label[normalize-space()='Beyaz']")
    public WebElement beyaz;
    @FindBy(xpath = "//label[normalize-space()='Çok Renkli']")
    public WebElement cokRenkli;
    @FindBy(xpath = "//label[normalize-space()='Gri']")
    public WebElement gri;
}
