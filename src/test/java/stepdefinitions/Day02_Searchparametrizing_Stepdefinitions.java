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
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;
import java.time.Duration;

public class Day02_Searchparametrizing_Stepdefinitions {

    Day02_SearchParametrizingPage page = new Day02_SearchParametrizingPage();
    Faker faker = new Faker();
    String product;

    @Given("madamcoco sitesine gidilir")
    public void madamcocoSitesineGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("cocoUrl"));
    }


    @And("arama kutusuna vazo yazilir")
    public void aramaKutusunaVazoYazilir() {
//        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
//        webDriverWait.until(ExpectedConditions.visibilityOf(page.rejectAll)).click();

        page.searchBox.sendKeys("vazo", Keys.ENTER);
    }


    @Then("sonuclarda vazo oldugu dogrulanicak")
    public void sonuclardaVazoOlduguDogrulanicak() {
        Assert.assertTrue(page.sonuxBox.getText().contains("vazo"));

        System.out.println("Toplam sayi" + page.results.size());

        for (int i = 0; i < page.results.size(); i++) {
            Assert.assertTrue(page.results.get(i).getText().contains("Vazo"));
        }
    }

    @Given("ingilizce menu secilir")
    public void ingilizce_menu_secilir() {
        page.rejectAll.click();
        page.ingilizcebuttonu.click();
    }

    @Given("arama kutusuna {string} yazilir")
    public void arama_kutusuna_yazilir(String string) {
        product = faker.commerce().productName();
        if (string.contains("<urun>")) {
            page.searchBox.sendKeys(product, Keys.ENTER);
        }
    }

    @Given("sonuclarda da {string} oldugu dogrulanir")
    public void sonuclarda_da_oldugu_dogrulanir(String string) {
        Assert.assertTrue(page.sonuxBox.getText().contains(product));

    }


}
