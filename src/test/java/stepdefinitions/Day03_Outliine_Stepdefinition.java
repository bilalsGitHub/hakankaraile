package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Day02_SearchParametrizingPage;
import pages.Day03_Outliine;
import utilities.ConfigReader;
import utilities.Driver;

public class Day03_Outliine_Stepdefinition {

    Day03_Outliine page=new Day03_Outliine();

    @Given("boyner sitesine gidilirr")
    public void boyner_sitesine_gidilirr() {
        Driver.getDriver().get(ConfigReader.getProperty("boynerUrl"));
        throw new io.cucumber.java.PendingException();
    }
    @Given("uye ol linkine tiklanilir")
    public void uye_ol_linkine_tiklanilir() {
        page.uyeolbutton.click();
        throw new io.cucumber.java.PendingException();
    }
    @Given("uyelik sayfasında oldugu dogrulanir")
    public void uyelik_sayfasında_oldugu_dogrulanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("uyelik sayfasında ad bolumune {string} girilir")
    public void uyelik_sayfasında_ad_bolumune_girilir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("uyelik sayfasında emaile {string} girilir")
    public void uyelik_sayfasında_emaile_girilir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("uyelik sayfasında sifreye {string} girilir")
    public void uyelik_sayfasında_sifreye_girilir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("uyelik sayfasında ceptelefonu yerine {string} girilir")
    public void uyelik_sayfasında_ceptelefonu_yerine_girilir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("uyelik sayfasında uyelik metnine {string} checkbox secilir")
    public void uyelik_sayfasında_uyelik_metnine_checkbox_secilir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("uyelik sayfasında riza metnine {string} checkbox secilir")
    public void uyelik_sayfasında_riza_metnine_checkbox_secilir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("uye ol buttonu tiklanilir")
    public void uye_ol_buttonu_tiklanilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("uye olunamadigi dogrulanir")
    public void uye_olunamadigi_dogrulanir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
