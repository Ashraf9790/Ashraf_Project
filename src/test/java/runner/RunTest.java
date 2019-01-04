package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@CucumberOptions(features="src/test/java/feature/Login.feature",glue={"stepImpl","pages"},
monochrome=true,tags="@smoke")
//dryRun=true,snippets=SnippetType.CAMELCASE)

@RunWith(Cucumber.class)
public class RunTest {

}
