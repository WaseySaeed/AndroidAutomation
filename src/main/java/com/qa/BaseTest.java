package com.qa;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static config.ConfigProperties.*;


public class BaseTest {

    public static AppiumDriver driver;

    public BaseTest()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }


    @BeforeClass
    public void beforeClass() {
        try{

        DesiredCapabilities DC = new DesiredCapabilities();
        DC.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform);
        DC.setCapability(MobileCapabilityType.AUTOMATION_NAME,automationName);
        DC.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
        DC.setCapability(MobileCapabilityType.UDID,AndroidUdid);
        DC.setCapability("appPackage", AppPackage);
        DC.setCapability("appActivity",AppActivity);
        DC.setCapability("appium:noSign","true");
        URL url = new URL(URL);
        driver = new AndroidDriver(url,DC);
        // For Implicit Wait of find elements before exception throw
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        /*
        Incase I want to install the application
        String appUrl = System.getProperty("user.dir") + File.separator + "src" +
                        File.separator+"main" + File.separator+"resources"+ File.separator+"google-maps-11-29-1.apk";
        DC.setCapability(MobileCapabilityType.APP,appUrl);

        UNABLE TO READ FROM CONFIG FILE USING INPUT STREAM, HAVE TO LOOK INTO THIS LATER

             String configFile = "src/main/config/application.properties";
             inputStream = getClass().getClassLoader().getResourceAsStream(configFile);
             configProp.load(inputStream);
             configProp = new Properties();
            // DC.setCapability(MobileCapabilityType.AUTOMATION_NAME,configProp.getProperty("androidAutomationName"));
            // DC.setCapability("appPackage", configProp.getProperty("androidAppPackage"));
            // DC.setCapability("appActivity",configProp.getProperty("androidAppActivity"));
            // URL url = new URL(configProp.getProperty("appiumURL"));
        */
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }



    @AfterClass
    public void afterClass()
    {
        driver.quit();
    }
}
