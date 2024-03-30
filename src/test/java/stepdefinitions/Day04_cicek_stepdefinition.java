package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Day04_DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Day04_cicek_stepdefinition {
    Day04_DataTablePage page = new Day04_DataTablePage();


    @Given("cicek sepeti sitesine gidilir")
    public void cicek_sepeti_sitesine_gidilir() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("cicekSepeti"));
        page.ilkresim.click();
        Thread.sleep(2000);
    }

    @Given("dogum gunu linkine tiklanilir")
    public void dogum_gunu_linkine_tiklanilir() {
        //page.dogumgunubuttonu.click();
        throw new io.cucumber.java.PendingException();
    }

    @Given("dogum gunu sayfasinda oldugunu dogrulanir")
    public void dogum_gunu_sayfasinda_oldugunu_dogrulanir() {
        String expectedUrl = "https://www.ciceksepeti.com/dogum-gunu";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("renk drowdowna tiklanilir")
    public void renk_drowdowna_tiklanilir() {
        page.renkdropdown.click();
    }

    @Then("sirasiyla renklerin secildigi dogrulanir")
    public void sirasiyla_renklerin_secildigi_dogrulanir(DataTable dataTable) {
        List<String> bilgiler = dataTable.asList();

        for (int i = 1; i < bilgiler.size(); i++) {
        switch (bilgiler.get(i)){
            case "Bej":
                page.bej.click();
            case "Beyaj":
                page.beyaz.click();
            case "Çok renkli":
                page.cokRenkli.click();
            case "Gri":
                page.gri.click();
            default:
                break;
        }
        }
    }

    @Given("{string} sitesine gidilir")
    public void sitesineGidilir(String arg0) {
        switch (arg0){
            case "trendyol":
                Driver.getDriver().get(ConfigReader.getProperty("trendyol"));
                break;
            case "herokuapp":
                Driver.getDriver().get(ConfigReader.getProperty("herokuapp"));
                break;
        }
    }
}
