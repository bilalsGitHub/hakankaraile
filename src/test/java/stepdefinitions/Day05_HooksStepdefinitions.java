package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Day05_HooksPage;
import utilities.Driver;

public class Day05_HooksStepdefinitions {

    Day05_HooksPage page = new Day05_HooksPage();
    String toplamsonuc;
    //    @Given("{string} sitesine gidilir")
//    public void sitesine_gidilir(String string) {
//        Driver.getDriver().get(string);
//    }
    @Given("arama kutusuna {string} yazilirr")
    public void arama_kutusuna_yazilirr(String string) {
        page.kabuletbuttonu.click();

        page.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("sonuc sayfasinda {string} oldugu dogrulanir")
    public void sonuc_sayfasinda_oldugu_dogrulanir(String string) {
        System.out.println("var mı "+page.sonucmetini.getText());
        System.out.println(page.sonucmetini.getText().contains(string));
        Assert.assertTrue(page.sonucmetini.getText().contains(string));
    }

    @When("sonuc sayfasindaki arama sonucu alinir")
    public void sonuc_sayfasindaki_arama_sonucu_alinir() {
        toplamsonuc= page.sonucsayisi.getText();
        }

    @Then("{int} den fazla urunun ekranda oldugu dogrulanir")
    public void den_fazla_urunun_ekranda_oldugu_dogrulanir(Integer int1) {
        String numericPart = toplamsonuc.replaceAll("[^\\d]", ""); // Sadece rakamları al
        int numericValue = Integer.parseInt(numericPart); // String'i tamsayıya dönüştür
        Assert.assertTrue(numericValue > int1);
    }



}
