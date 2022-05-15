package FeatureTests;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static PageObject.SampleTestObject.*;

public class SampleTest extends BaseTest{


    @Test
    public void searchForPlace() throws InterruptedException {

        SearchingLocation();
    }

    @Test
    public void VerifyDetailOfTheLocation() throws InterruptedException {
        ValidatingLocationDetail();

    }
}
