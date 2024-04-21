package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {"pretty","html:target/cucumber.html"},
        glue={"stepDefinition", "parameterTypes"},
        features="src/test/java",
        tags = "@Scenario5"
)
public class JunitRunnerTest {
}
