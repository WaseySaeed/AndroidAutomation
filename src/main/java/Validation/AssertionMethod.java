package Validation;

import io.appium.java_client.MobileElement;
import org.testng.Assert;

public class AssertionMethod {

    public static void ValidateResult(MobileElement element, String expectedText)
    {
        String actualText = element.getText();
        Assert.assertEquals(actualText,expectedText);

    }
}
