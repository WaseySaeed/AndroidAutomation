package config;

public class ConfigProperties {

    public static ApplicationConfigReader appConfig = new ApplicationConfigReader();
    public static String deviceName = appConfig.getDeviceName();
    public static String automationName = appConfig.getAutomationName();
    public static String AndroidUdid = appConfig.getandroidUdid();
    public static String Platform = appConfig.getPlatform();
    public static String AppPackage = appConfig.getAppPackage();
    public static String AppActivity = appConfig.getAppActivity();

    public static String URL = appConfig.getbaseUrl();


}
