Feature: US001 Google Sayfasinda Urun Aratma

  Scenario: TC01 Tabloda Verilen Urunler Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    And kullanici verilen bilgiler ile arama yapar
      | Urunler  |
      | nokia    |
      | samsung  |
      | iphone   |
      | motorola |
    And sayfayi kapatir






  #AltGr+<> --> |
  #option + - --> | --> mac için
  #DataTable Scenario Outline daki gibi birden fazla veriyi aynı scenario'da test etmek için kullanilir.
  #Scenario Outline'dan farkli olarak verilerle ilgili tabloları istediğimiz stepten sonra kendimiz oluşturabiliriz.
  #Tabloyu oluşturduğumuz step'in methoduna parametre olarak io.cucumber dan DataTable parametresini ekleriz.
  #Bu parametre sayesinde oluşturmuş olduğumuz tabloyu bir list'e dönüştürüp loop ile verileri kullanabiliriz.
  #Birden fazla sutün oluşturduysak yine DataTable parametresi sayesinde excel'den bildiğimiz row() methodu ile bu datalara ulaşabiliriz.