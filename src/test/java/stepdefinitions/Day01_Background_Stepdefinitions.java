package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Day01_BackgroundPage;
import utilities.ConfigReader;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class Day01_Background_Stepdefinitions {

    Day01_BackgroundPage page = new Day01_BackgroundPage();

    String expectedTitle = "";


    @Given("ets tur sitesine gidilir")
    public void etsTurSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("etsUrl"));
        expectedTitle = Driver.getDriver().getCurrentUrl();
    }


    @When("giris butona basilir")
    public void girisButonaBasilir() {
        page.giris.click();
    }

    @And("eposta girilir")
    public void epostaGirilir() {
        page.email.sendKeys("asdasds@gmail.com");
    }

    @And("password girilir")
    public void passwordGirilir() {
        page.password.sendKeys("123123");
    }

    @When("giris var butonuna basilir")
    public void girisVarButonunaBasilir() {
        page.girisYap.click();
    }

    @Then("sayfaya gidilemediği dogrulanir")
    public void sayfayaGidilemediğiDogrulanir() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        assertEquals(expectedTitle, actualUrl);

    }


    @When("uyeolbutonuna  basilir")
    public void uyeolbutonunaBasilir() {
        page.uyeOl.click();
    }

    @And("adgirilir")
    public void adgirilir() {
        page.ad.sendKeys("Ali");
    }

    @And("soyadgirilir")
    public void soyadgirilir() {
        page.soyad.sendKeys("Velikabalak");
    }

    @And("uyelikicin posta girilir")
    public void uyelikicinPostaGirilir() {
        page.uyelikEmail.sendKeys("aliveli123123123@gmail.com");
    }

    @And("ceptelefonu girilir")
    public void ceptelefonuGirilir() {
        page.uyelikPhone.sendKeys("5331231231");
    }

    @And("uyelik password girilir")
    public void uyelikPasswordGirilir() {
        page.uyelikPassword.sendKeys("AliVeli13579.");
    }

    @And("password yeniden girilir")
    public void passwordYenidenGirilir() {
        page.uyelikPasswordTekrar.sendKeys("AliVeli13579.");
    }

    @And("kullanimsartları kabul edilir")
    public void kullanimsartlarıKabulEdilir() {
        page.kullanimSartlari.click();
    }

    @And("kampayanlar kabul edilir")
    public void kampayanlarKabulEdilir() {
        page.firsatlar.click();
    }

    @When("uyeol butonuna tiklnilir")
    public void uyeolButonunaTiklnilir() {
        page.uyeOlButton.click();
    }
}
