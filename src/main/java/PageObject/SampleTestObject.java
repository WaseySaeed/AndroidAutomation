package PageObject;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import static com.qa.BaseTest.*;

import static Validation.AssertionMethod.*;
import static com.qa.GeneralMethods.*;


public class SampleTestObject {


    public static void SearchingLocation(){

        SignInScreenValidation();
        click((MobileElement) driver.findElement(By.id("com.google.android.apps.maps:id/search_omnibox_text_box")));
        sendText((MobileElement) driver.findElement(By.id("com.google.android.apps.maps:id/search_omnibox_edit_text")),"Iftikhar Syed Sports");
        click((MobileElement) driver.findElement(By.xpath("//*[@text='Iftikhar Syed Sports Park']")));
    }

    public static void ValidatingLocationDetail() throws InterruptedException {
        SignInScreenValidation();
        click((MobileElement) driver.findElement(By.id("com.google.android.apps.maps:id/search_omnibox_text_box")));
        sendText((MobileElement) driver.findElement(By.id("com.google.android.apps.maps:id/search_omnibox_edit_text")),"Iftikhar Syed Sports");
        click((MobileElement) driver.findElement(By.xpath("//*[@text='Iftikhar Syed Sports Park']")));
        Wait(10000);
        click((MobileElement) driver.findElement(By.xpath("//*[@text='Iftikhar Syed Sports Park']")));
        ValidateResult((MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Iftikhar Syed Sports Park\"]")),"Iftikhar Syed Sports Park");
        ValidateResult((MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Park']")),"Park");
    }

    public static void SignInScreenValidation()
    {
        if(((MobileElement)driver.findElement(By.xpath("//android.widget.Button[@text='Sign in']"))).isDisplayed())
        {
            back();
        }
    }
}
