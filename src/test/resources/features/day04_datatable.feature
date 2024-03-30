@etc4
Feature: Data table Test

  Scenario: cicek sepeti urun secme
    Given  cicek sepeti sitesine gidilir
    And dogum gunu linkine tiklanilir
    And dogum gunu sayfasinda oldugunu dogrulanir
    When renk drowdowna tiklanilir
    Then sirasiyla renklerin secildigi dogrulanir
      | renkler    |
      | Bej        |
      | Beyaj      |
      | Çok renkli |
      | Gri        |