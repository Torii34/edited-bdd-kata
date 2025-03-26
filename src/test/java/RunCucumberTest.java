import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports"},
        features = "src/test/resources/specification/general.feature",
        glue = {"se/crisp/edu/refactor/gildedrose/step"}
)
@RunWith(Cucumber.class)
public class RunCucumberTest {
}