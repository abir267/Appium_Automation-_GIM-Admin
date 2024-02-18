
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateTrip {
    AppiumDriver driver;

    @Test
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "14.0"); // Replace with your device's Android version
        dc.setCapability("deviceName", "Android Emulator"); // Replace with your device's name

        dc.setCapability("app", "/Users/abira/Downloads/base.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), dc);
        Thread.sleep(5000);
        //login As Abir Arshad
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"LOG IN\"]/android.widget.EditText[1]")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"LOG IN\"]/android.widget.EditText[1]")).sendKeys("abirarshad.gim@gmail.com");
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"LOG IN\"]/android.widget.EditText[2]")).click();
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"LOG IN\"]/android.widget.EditText[2]")).sendKeys("qwerty123");
        Thread.sleep(5000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout")).click();

        WebElement loginButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOG IN\"]"));
        loginButton.click();

        System.out.println("Welcome! You're now logged in.");
        //

    }
}


