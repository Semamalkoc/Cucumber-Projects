package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu. Cucumber ile junit eentegrasyonu sağlar.
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber1.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOut/failed_scenario.txt"},
        //rerun ile belirttiğimiz dosyada fail olan senaryolar tutulur.
        features="src/test/resources/features",
                 glue ={"techproed/stepDefinition"},
        tags ="@p",
        dryRun = false, //-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = false//-->false olursa consoldaki çıktılar renkli olur
)
/*
@CucumberOptions() notasyonuna parametre olarak
        features-->features package'ının yolunu belirtiriz(Content Root)
        glue-->stepdefinition package(source root)
        tags-->çalıştırmak istediğimiz scenarioları bu parametrede belirtiriz

@CucumberOptions() notasyonu scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı
seçenekleri bu notasyonda belirtiriz
@CucumberOptions() notasyonu içerisine plugin parametresi ile yukarıdaki gibi almak istediğimiz
rapor çeşidini seçip ekliyoruz.
pretty-->konsolda çalıştırdığımız scenario ile ilgili ayrıntılı bilgi verir.

 */

public class Runner {

}