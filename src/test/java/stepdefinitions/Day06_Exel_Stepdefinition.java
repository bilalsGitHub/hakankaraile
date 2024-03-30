package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Day06_Exel_Page;
import utilities.Driver;
import utilities.ExcelUtils;

public class Day06_Exel_Stepdefinition {


    Day06_Exel_Page page = new Day06_Exel_Page();

    @Given("kullanici exeldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void kullanici_exeldeki_sayfasindaki_kullanici_bilgileri_ile_login_olur(String string) throws InterruptedException {
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/cucumber deneme.xlsx", string);
        for (int i = 1; i < 3; i++) {
            System.out.println("rowcount"+excelUtils.rowCount());
            String email = excelUtils.getCellData(i, 0);
            String password = excelUtils.getCellData(i, 1);
            System.out.println("email"+email);
            System.out.println("password"+password);
            page.email.sendKeys(email);
            page.password.sendKeys(password);
            page.submit.click();
            Thread.sleep(500);
           // Assert.assertEquals("Contact List", page.contactList.getText());
            page.logout.click();
        }
    }

    @Then("kullanici login oldugunu dogrular")
    public void kullanici_login_oldugunu_dogrular() {
        Driver.getDriver().close();
    }




    @And("kullanici exeldeki {string} sayfasindaki kullanici bilgileri ile login olamadigini dogrular")
    public void kullaniciExeldekiSayfasindakiKullaniciBilgileriIleLoginOlamadiginiDogrular(String arg0) throws InterruptedException {
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/cucumber deneme.xlsx", arg0);
        for (int i = 1; i < excelUtils.rowCount(); i++) {
            System.out.println("rowcount"+excelUtils.rowCount());
            String email = excelUtils.getCellData(i, 0);
            String password = excelUtils.getCellData(i, 1);
            System.out.println("email"+email);
            System.out.println("password"+password);
            page.email.sendKeys(email);
            page.password.sendKeys(password);
            page.submit.click();
            Thread.sleep(1500);
            page.email.sendKeys("   ");
            page.password.sendKeys("   ");
            // Assert.assertEquals("Contact List", page.contactList.getText());
        }
    }

    @Then("kullanici login olamadigini dogrular")
    public void kullaniciLoginOlamadiginiDogrular() {
        Assert.assertTrue(page.error.isDisplayed());
    }
}

