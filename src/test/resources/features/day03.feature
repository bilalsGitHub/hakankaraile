@etc3
Feature: Negatif Uyelik2

  Scenario Outline: boyner gidilir
    And boyner sitesine gidilirr
    And uye ol linkine tiklanilir
    And uyelik sayfasında oldugu dogrulanir
    And uyelik sayfasında ad bolumune "<ad>" girilir
    And uyelik sayfasında emaile "<email>" girilir
    And uyelik sayfasında sifreye "<sifre>" girilir
    And uyelik sayfasında ceptelefonu yerine "<cepptelefonu>" girilir
    And uyelik sayfasında uyelik metnine "<uyelikmetni>" checkbox secilir
    And uyelik sayfasında riza metnine "<rizametni>" checkbox secilir
    And uye ol buttonu tiklanilir
    Then uye olunamadigi dogrulanir

    Examples:
      | ad    | email              | sifre  | cepptelefonu | uyelikmetni | rizametni |
      | hakan | hakanali@gmail.com | 123456 | 5337111212   | 1           | 1         |
      | hakan | hakanali.poe@gmail | 123456 | 5337111212   | 1           | 1         |
