package AppiumBase;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Session {
	
	private static final String APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.9.0/TheApp-v1.9.0.apk";
    private static final String APPIUM = "http://localhost:4723/wd/hub";
    private AndroidDriver driver;
    @Before
    public void setUp() throws Exception {
    	DesiredCapabilities caps = new DesiredCapabilities();
    	caps.setCapability("platformName", "Android");
    	caps.setCapability("platformVersion", "5");
    	caps.setCapability("deviceName","Android Emulator" );
    	caps.setCapability("automationName","UIAutomator2" );
    	caps.setCapability("app",APP );
    	driver = new AndroidDriver(new URL(APPIUM),caps);

    }
    @After
    public void tearDown() {
    	if (driver != null) {
    		driver.quit();
    	}
    }
    @Test
    public void test() {
    	System.out.println("This is our test");
    }

}
