@etc2
Feature: SearchParametrizing
  Background: madamcoco sitesine gitme
    Given madamcoco sitesine gidilir


  Scenario: TC02
    And arama kutusuna vazo yazilir
    Then sonuclarda vazo oldugu dogrulanicak


  Scenario:Parametreli Arama Kutusu Testi
    And ingilizce menu secilir
    And arama kutusuna "<urun>" yazilir
    And sonuclarda da "<urun>" oldugu dogrulanir
