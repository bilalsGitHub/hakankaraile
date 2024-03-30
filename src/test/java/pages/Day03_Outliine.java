package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day03_Outliine {

    public Day03_Outliine() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[normalize-space()='Üye Ol']")
    public WebElement uyeolbutton;

    @FindBy(xpath = "//input[@placeholder='Adın Soyadın']")
    public WebElement ad;
    @FindBy(xpath = "//input[@placeholder='E-posta adresin']")
    public WebElement mail;
    @FindBy(xpath = "//input[@placeholder='Şifren']")
    public WebElement sifre;
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement cepTelefonu;
    @FindBy(className = "sc-fqkvVR byzlMQ icon-account")
    public WebElement cinsiyetpopup;

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/label[1]/div[1]/div[1]")
    public WebElement uyelik;

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[7]/div[2]/div[1]/label[1]/div[1]/div[1]")
    public WebElement riza;

    @FindBy(xpath = "//span[@class='login-button_boxTxt__bFjdp']")
    public WebElement uyeolbuttonuenson;

}
