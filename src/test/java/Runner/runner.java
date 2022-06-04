package Runner;

import org.testng.annotations.Listeners;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@Listeners({ ExtentITestListenerClassAdapter.class })
@CucumberOptions(

features = "C:/Users/mohitsharma10/eclipse-workspace/Exit_Test/src/test/java/Feature",
glue = {"StepDefinition", "Hooks"},
tags = {"@tag1"}
)



public class runner extends AbstractTestNGCucumberTests {
}
