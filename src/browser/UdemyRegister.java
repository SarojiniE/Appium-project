package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class UdemyRegister {

	public static void main(String[] args) throws MalformedURLException {
		//5. 5.	Register on Udemy
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.udemy.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.udemy.android.SplashActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.udemy.android:id/signin_button")).click();
		driver.findElement(MobileBy.id("com.udemy.android:id/create_account_or_sign_in")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign up with email\")")).click();
		driver.findElement(MobileBy.id("com.udemy.android:id/username_edit")).sendKeys("Sarojini");
		driver.findElement(MobileBy.id("com.udemy.android:id/email_edit")).sendKeys("sarojini.emekar4@gmail.com");
		driver.findElement(MobileBy.id("com.udemy.android:id/password_edit")).sendKeys("Password@123");
		driver.findElement(MobileBy.id("com.udemy.android:id/create_account_button")).click();
		
		
	}

}
