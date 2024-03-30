#Background bize tekrar eden giriş işlemlerinde stepleri birleştirme imkanı verir.
#Background her Scenario başlarken loop yapar gibi her defasinda yeniden calisir.
@ets
Feature:ets tur sitesine login
  Background: ets sitesine giris
    Given ets tur sitesine gidilir


  Scenario: ets tur login
    When giris butona basilir
    And eposta girilir
    And password girilir
    When giris var butonuna basilir
    Then  sayfaya gidilemediği dogrulanir

    Scenario: etc tur uyelik
      When uyeolbutonuna  basilir
      And adgirilir
      And soyadgirilir
      And uyelikicin posta girilir
      And ceptelefonu girilir
      And uyelik password girilir
      And password yeniden girilir
      And kullanimsartları kabul edilir
      And kampayanlar kabul edilir
      When uyeol butonuna tiklnilir
      Then sayfaya gidilemediği dogrulanir