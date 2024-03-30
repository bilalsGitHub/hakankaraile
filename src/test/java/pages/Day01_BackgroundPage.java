package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Day01_BackgroundPage {

    public Day01_BackgroundPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "i[class='etsfonticon login-user']")
    public WebElement dropDown;
    @FindBy(xpath = "//button[contains(text(),'Giriş Yap')]")
    public WebElement giris;
    @FindBy(xpath = "//button[normalize-space()='Üye Ol']")
    public WebElement uyeOl;

    @FindBy(xpath = "//input[@id=':r0:']")
    public WebElement email;
    @FindBy(xpath = "//input[@id=':r1:']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement girisYap;
    @FindBy(xpath = "(//input[contains(@class,'MuiInputBase-input MuiInput-input')])[2]")
    public WebElement ad;
    @FindBy(xpath = "//input[@placeholder='Soyisim']")
    public WebElement soyad;
    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement uyelikEmail;
    @FindBy(xpath = "//input[@placeholder='Telefon Numarası']")
    public WebElement uyelikPhone;
    @FindBy(xpath = "//input[@placeholder='Şifre']")
    public WebElement uyelikPassword;
    @FindBy(xpath = "(//input[@id=':r4:'])[1]")
    public WebElement uyelikPasswordTekrar;
    @FindBy(xpath = "(//input[@name='acceptKvk'])[1]")
    public WebElement kullanimSartlari;
    @FindBy(xpath = "(//input[@name='allowMarketing'])[1]")
    public WebElement firsatlar;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement uyeOlButton;
}
