Feature: Excel

  Scenario: Pozitif Login
    Given "herokuapp" sitesine gidilir
    And kullanici exeldeki "pozitif" sayfasindaki kullanici bilgileri ile login olur
    Then kullanici login oldugunu dogrular

  @excel
  Scenario: Negatif Login
    Given "herokuapp" sitesine gidilir
    And kullanici exeldeki "negatif" sayfasindaki kullanici bilgileri ile login olamadigini dogrular
    Then kullanici login olamadigini dogrular
