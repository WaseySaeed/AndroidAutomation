package config;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//@Resource.Classpath("application.properties")

public class ApplicationConfigReader {
    Properties prop = new Properties();
    String fileName = "src/main/resources/application.properties";


    {
        try {
            InputStream input = new FileInputStream(fileName);
            prop.load(input);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getDeviceName() {
        return prop.getProperty("androidDeviceName");
    }

    //---------------------------------------//
    public String getAutomationName() {
        return prop.getProperty("androidAutomationName");
    }


    //---------------------------------------//
    public String getandroidUdid() {
        return prop.getProperty("androidUdid");
    }

    //---------------------------------------//
    public String getPlatform() {
        return prop.getProperty("androidPlatform");
    }
    //---------------------------------------//
    public String getAppPackage() {
        return prop.getProperty("androidAppPackage");
    }

    //---------------------------------------//
    public String getAppActivity() {
        return prop.getProperty("androidAppActivity");
    }

    //---------------------------------------//
    public String getbaseUrl() {
        return prop.getProperty("appiumURL");
    }

}