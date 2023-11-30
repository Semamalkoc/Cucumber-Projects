package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu. Cucumber ile junit eentegrasyonu sağlar.
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber2.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOut/failed_scenario.txt"},
        //rerun ile belirttiğimiz dosyada fail olan senaryolar tutulur.
        features="src/test/resources/features",
        glue ={"techproed/stepDefinition"},
        tags ="@n",
        dryRun = false, //-->true seçersek scenarioları kontrol eder browser'ı çalıştırmaz
        monochrome = false//-->false olursa consoldaki çıktılar renkli olur
)

public class Runner1 {
}
