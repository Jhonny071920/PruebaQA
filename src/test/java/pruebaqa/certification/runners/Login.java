package pruebaqa.certification.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
       glue ={
               "pruebaqa.certification.stepdefinitions",
               "pruebaqa.certification.hooks"
       },

        features = "src/test/resources/features/login.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Login {
}
