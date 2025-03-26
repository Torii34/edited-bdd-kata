import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
//        plugin = {"pretty", "json:target/cucumber-report.json"},
        features = "src/test/java/feature/general.feature",
        glue = {"feature"}
)
@RunWith(Cucumber.class)
public class RunnerTest {
}