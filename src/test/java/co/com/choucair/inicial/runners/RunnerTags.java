package co.com.choucair.inicial.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/inicial.feature",
        tags = "@stories",
        glue = "co.com.choucair.inicial.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
