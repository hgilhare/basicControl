package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feataurefile",glue={"stepdefination","helper"},tags="@Reg",plugin="html:target/reports/test2.html")
public class testrunner {

}
