package com.qa;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GeneralMethods extends BaseTest{
    public static void waitForVisibility(MobileElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public static void Wait(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public static void back() {
        driver.navigate().back();
    }

    public static void click(MobileElement locator) {
        try {
            waitForVisibility(locator);
            locator.click();
        }
        catch (NoSuchElementException e)
        {
            throw e;
        }
    }

    public static void sendText(MobileElement locator, String textToSend) {
        try {
            locator.sendKeys(textToSend);
        } catch (NoSuchElementException e) {
            throw e;
        }
    }

    // I've Sent a dummy test string here just incase i want to use scroll function, TEST string is empty
    public MobileElement scrollToElement(String Test) {
        return (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
                        + "new UiSelector().description(\""+Test+"\"));");
    }
}

