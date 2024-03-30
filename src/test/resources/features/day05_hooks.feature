@day05
Feature: Hooks Testi
  Background: Hooks testi
    Given "trendyol" sitesine gidilir
    And  arama kutusuna "gömlek" yazilirr

    Scenario: hooks testi negatif
      Then sonuc sayfasinda "Gömlek" oldugu dogrulanir
      When sonuc sayfasindaki arama sonucu alinir
      Then 20 den fazla urunun ekranda oldugu dogrulanir