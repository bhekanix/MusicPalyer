package Setup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseSetup {
    private static AndroidDriver androidDriver = null;

    @BeforeSuite
    public AndroidDriver getDriver() throws MalformedURLException {
        initDriver();
        return androidDriver;
    }
    private void initDriver() throws NullPointerException,
            MalformedURLException {
        System.out.println("Inside initDriver method");

        String dir = System.getProperty("user.dir");

        final String apkfile = dir + "/apk/musicplayer.apk";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("newCommandTimeout", 120);
        capabilities.setCapability("platformName", "Android");
        // capabilities.setCapability("platformVersion", "8.0"); enable this when you have connected multiple devices and want to run a specific version       
        capabilities.setCapability(MobileCapabilityType.APP, apkfile);
        capabilities.setCapability("noReset", true);
        String serverUrl = "http://127.0.0.1:4723/wd/hub";
        System.out.println("Argument to driver object : " + serverUrl);
        androidDriver = new AndroidDriver(new URL(serverUrl), capabilities);
        System.out.println("Driver in initdriver is : " + androidDriver);
    }
    //  The below method will kill the android driver after it has completed the execution   
    @AfterSuite
    public void tearDown() {
        androidDriver.quit();
        System.out.println("We are done");
    }
}

