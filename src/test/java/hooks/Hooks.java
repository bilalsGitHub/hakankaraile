package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("before calisti");
    }

    @After
    public void teardown(Scenario scenario){
        System.out.println("after calisti");

        if(scenario.isFailed()){
        final byte[] failedScreenShot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(failedScreenShot,"image/png","failedScreenshot"+scenario.getName() );
        }
    }
}
