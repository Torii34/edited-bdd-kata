import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-report.json"},
        features = "src/test/resources/specification/general.feature",
        glue = {"se/crisp/edu/refactor/gildedrose/step"}
)
@RunWith(Cucumber.class)
public class RunCucumberTest {
}